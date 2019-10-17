package cn.wzvtc.soft;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin//跨域，去掉其他人不能访问,只能在本域值访问
@RestController("/" )
public class TestController {

    @RequestMapping(value="/data.json",method={RequestMethod.GET})
    public Map<String,String> bookById(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","练书含" +
                "");
        resultMap.put("mynumber","18002090119");
        return resultMap;
    }
}