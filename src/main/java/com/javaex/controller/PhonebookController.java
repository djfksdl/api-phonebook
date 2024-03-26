package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVo;

@RestController
public class PhonebookController {
	
	//필드
	@Autowired
	private PhonebookService phonebookService;
	
	//전체 리스트 불러오기
	@GetMapping("/api/phonebooks")
	public List<PersonVo> list() {
		System.out.println("PhonebookController.list");
		
		List<PersonVo> phonebookList= phonebookService.exeList();
		
		
		return phonebookList;
	}
	
	//수정폼
	@GetMapping("/api/phonebooks/modify/{personId}")
	public String modify() {
		System.out.println("PhonebookController.modify");
		return "";
	}
	
	//수정하기
}
