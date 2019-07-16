package dubbo.order;

import org.springframework.stereotype.Service;


@Service("orderService2")
public class OrderServiceImpl2 implements IOrderServices{

 /*   @Autowired
    IUserService userService;*/

    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过版本2："+request);
        DoOrderResponse response=new DoOrderResponse();
        response.setCode("000000");
        response.setMemo("处理成功，版本2");
        return response;
    }
}
