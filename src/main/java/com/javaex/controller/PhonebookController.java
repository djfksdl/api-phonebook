package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {
	
	//필드
	@Autowired
	private PhonebookService phonebookService;
	
	//test
	@GetMapping("/api/phonebooks")
	public List<PersonVo> list() {
		System.out.println("PhonebookController.list");
		
		List<PersonVo> phonebookList= phonebookService.exeList();
		
		
		return phonebookList;
	}
}
