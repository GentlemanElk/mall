package cn.mall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aloong on 2017/11/10.
 */

@Controller
public class PageController {

    /**
     * 实现页面的跳转
     * 首页 localhost:8082/index
     * 商品添加 localhost:
     *
     */

    @RequestMapping("{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
