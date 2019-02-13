package com.fentidev.MetFriend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chencheng
 * @date 2019/2/12
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String print(){
        return "Hello World";
    }
}
