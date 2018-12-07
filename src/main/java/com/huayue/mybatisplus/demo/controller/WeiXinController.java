package com.huayue.mybatisplus.demo.controller;

import com.huayue.mybatisplus.demo.common.HttpClientUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2018/12/7 11:18
 */
@Controller
public class WeiXinController {

    @RequestMapping("/getOpenid")
    @ResponseBody
    public String getOpenId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";

        Map<String, String> map = new HashMap<String, String>();
        map.put("appid", "wxccaee78ed37b06fc");
        map.put("secret", "e7e912e5331df5aa386e210026dd438f");
        map.put("js_code", code);
        map.put("grant_type", "authorization_code");


        String resultJson = HttpClientUtils.doGet(url, map);

        return resultJson;
    }

}
