package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PersonVo;

@Service
public class PhonebookService {
	
	//필드
	@Autowired
	private PhonebookDao phonebookDao;
	
	//전체 리스트
	public List<PersonVo> exeList() {
		System.out.println("PhonebookService.exeList");
		
		List<PersonVo> phonebookList= phonebookDao.selectList();
		
		return phonebookList;
		
	}
}
