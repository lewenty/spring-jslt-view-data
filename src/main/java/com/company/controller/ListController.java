package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by levent.yildiz on 14.09.2014.
 */

@Controller
public class ListController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index"); // index sayfasına gider
        mv.addObject("adi","levent");
        mv.addObject("soyadi","YILDIZ");
        return mv;
    }

}
