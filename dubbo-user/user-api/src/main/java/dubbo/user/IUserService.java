package dubbo.user;

import dubbo.user.dto.UserLoginRequest;
import dubbo.user.dto.UserLoginResponse;


public interface IUserService {

    /**
     * 登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);
}
