package com.xxu.system.contraller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testContraller {
@RequestMapping("/test")
public String test(){
    return "success";
}
}
