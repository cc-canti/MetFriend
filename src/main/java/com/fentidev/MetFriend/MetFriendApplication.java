package com.fentidev.MetFriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class MetFriendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetFriendApplication.class, args);

	}

	@RequestMapping(value="/")
	@ResponseBody
	String home(){
		return "hello world";
	}

}

