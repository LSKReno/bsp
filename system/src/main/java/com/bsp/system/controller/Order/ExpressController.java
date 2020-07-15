//package com.bsp.system.controller.Order;
//
//import com.bsp.server.dto.ResponseDto;
//import com.bsp.server.dto.SalSalesOrderLineItemDto;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.HashMap;
//
//@RestController
//@RequestMapping("ExpressController")
//public class ExpressController {
//    @RequestMapping("getState")
//    public ResponseDto getState(@RequestBody SalSalesOrderLineItemDto salSalesOrderLineItemDto){
//        ResponseDto responseDto = new ResponseDto();
//        String data = "";
//        String com = "";
//        String num = salSalesOrderLineItemDto.getTrackingNo();
//        BufferedReader in = null;
//        try {
//            String postUrl = "http://www.kuaidi100.com/query?id=你自己的id&type=" + com + "&postid=" + num + "&valicode=&temp=0.20180725857720894";
//            URL realUrl = new URL(postUrl);            // 打开和URL之间的连接
//            URLConnection connection = realUrl.openConnection();            // 设置通用的请求属性
//            connection.setRequestProperty("accept", "*/*");
//
//            connection.setRequestProperty("connection", "Keep-Alive");
//            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");            // 建立实际的连接
//            connection.connect();            // 定义 BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
//            String line;
//            while ((line = in.readLine()) != null) {
//                data += line;
//            }
//        } catch (Exception e) {
//            System.out.println("发送GET请求出现异常！" + e);
//        }        // 使用finally块来关闭输入流
//        finally {
//            try {
//                if (in != null) {
//                    in.close();
//                }
//            } catch (Exception e2) {
//
//            }
//        }
//
//        return responseDto;
//    }
//}
