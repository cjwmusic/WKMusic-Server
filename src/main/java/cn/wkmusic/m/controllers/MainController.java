package cn.wkmusic.m.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wukong on 08/11/2016.
 */

@Controller
@RequestMapping("/")
public class MainController extends BaseController {

    @ResponseBody
    @RequestMapping(value = "m", method = RequestMethod.GET)
    public String index() {
        return "This is index";
    }
}
