package edu.controller;

import edu.controller.support.ResponseData;
import edu.controller.support.ResponseEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qingyin
 * @date 2016/8/21
 */
public class BaseController {
    public Logger LOG= LoggerFactory.getLogger(BaseController.class);


    protected String redirectTo(String url) {
        StringBuffer rto = new StringBuffer("redirect:");
        rto.append(url);
        return rto.toString();
    }

    protected ResponseData setEnumResult(ResponseEnum anEnum,Object data){
        ResponseData res =new ResponseData();
        res.setStatus(anEnum.getCode());
        res.setData(data);
        res.setMessage(anEnum.getMsg());
        return res;
    }
}
