package com.elshialabeouf.tatooine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 22.11.2016.
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "account/index";
    }

}
