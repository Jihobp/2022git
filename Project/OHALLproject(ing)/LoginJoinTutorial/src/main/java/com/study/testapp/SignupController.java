package com.study.testapp;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/signup/*")
public class SignupController {
    
    @Inject
    private SignupService signupService;
    
    //SignUp GET
    @RequestMapping(value="/signup.do", method=RequestMethod.GET)
    public void signupGET() {
        
    }
    
    //SignUp PSOT
        @RequestMapping(value="/signup.do", method=RequestMethod.POST)
        public String signupPOST(SignupVO signVO) {
            
            signupService.insertMember(signVO);
            
            return "main";
        }
    
 
}

