package com.bsp.system.controller.Order;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SalSalesOrderLineItemDto;
import com.bsp.server.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("ExpressController")
public class ExpressController {
    @PostMapping("getState")
    public JSONObject getState(@RequestBody Map<String, Object> map){
        ResponseDto responseDto = new ResponseDto();
        String com = JSON.parseObject(JSON.toJSONString(map.get("com")), String.class);
        String nu = JSON.parseObject(JSON.toJSONString(map.get("nu")), String.class);

        String host = "https://ali-deliver.showapi.com";
        String path = "/showapi_expInfo";
        String method = "GET";
        String appcode = "a88499ae3b8440ba9dbfed885a8dd5ee";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("com", com);
        querys.put("nu", nu); // YT4570640481544
        querys.put("receiverPhone", "receiverPhone");
        querys.put("senderPhone", "senderPhone");
        JSONObject jsonObject = null;

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            response.getEntity();
            System.out.println(response.toString());
//            responseDto.setContent(response);
            //获取response的body
//            responseDto.setContent(EntityUtils.toString(response.getEntity()));
            String line = null;
            StringBuilder entityStringBuilder=new StringBuilder();
            BufferedReader b = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"),8*1024);
            while ((line=b.readLine())!=null) {
//                System.out.println(line);
                entityStringBuilder.append(line);
            }
//            System.out.println(entityStringBuilder.toString());
            jsonObject = JSONObject.parseObject(entityStringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
