package dubbo.order;

import org.springframework.stereotype.Service;


@Service(value = "orderQueryService")
public class OrderQueryServiceImpl implements IOrderQueryService{

    @Override
    public String doQuery(String params) {
        System.out.println(params);
        return "hello,菲菲";
    }
}
