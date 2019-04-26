package com.arnav.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping(path="/demo")
@RequestMapping("/")
class DemoRestController {

    public String index(Map<String, Object> model) {
    	return "index.html";
    }
    
    @RequestMapping("arnav")
    public String welcome(Map<String, Object> model) {
    	return "welcome.html";
    }
}
