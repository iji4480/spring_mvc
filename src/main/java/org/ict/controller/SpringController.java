package org.ict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
// 기본 url(localhost:8181/ 뒤에 spring/ 모든패턴이 추가됨.
@RequestMapping("/spring/*")
public class SpringController {
	
	@RequestMapping("")
	public void base() {
		
		System.out.println("기본 url로 접속했습니다.");
	}
}
