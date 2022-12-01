package com.study.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
        //메인 GET 공통
        @RequestMapping("/main.do")
        public String main() {
            return "main";
        }
}

