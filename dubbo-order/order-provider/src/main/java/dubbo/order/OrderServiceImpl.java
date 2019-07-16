package dubbo.order;

import org.springframework.stereotype.Service;


@Service(value = "orderService")
public class OrderServiceImpl implements IOrderServices{


    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过："+request);
        DoOrderResponse response=new DoOrderResponse();
        response.setCode("111111");
        response.setMemo("处理成功");
        return response;
    }
}
