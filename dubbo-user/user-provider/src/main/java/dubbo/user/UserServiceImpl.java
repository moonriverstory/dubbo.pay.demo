package dubbo.user;

import dubbo.user.dto.UserLoginRequest;
import dubbo.user.dto.UserLoginResponse;
import dubbo.user.validator.UserValidator;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements IUserService{

    public UserLoginResponse login(UserLoginRequest request) {
        //参数校验
        UserLoginResponse response=new UserLoginResponse();
        if(!UserValidator.checkUserLoginRequest(request)){
           response.setCode("100001");
           response.setMemo("请求参数校验失败");
            return response;
        }
        if("root".equals(request.getName())&&"root".equals(request.getPassword())) {
            response.setCode("000000");
            return response;
        }
        response.setCode("100002");
        response.setMemo("登录失败,帐号或密码错误");
        return response;
    }
}
