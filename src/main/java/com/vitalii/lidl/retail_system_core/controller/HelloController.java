
package com.vitalii.lidl.retail_system_core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "🚀 Retail System Prototype is working! Ready for Lidl Graduate Programme - Vitalii";
    }
}