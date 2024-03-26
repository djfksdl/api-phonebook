package com.javaex.service;

import java.util.List;
import java.util.Map;

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
	
	//등록
	public int exeWrite(PersonVo personVo) {
		System.out.println("PhonebookService.exeWrite");
		
		//System.out.println(personVo);

		int count = phonebookDao.personInsert(personVo);
		
		return count;
	}
	
	//삭제
	public int exeDelete(int no) {
		System.out.println("PhonebookService.exeDelete");
		
		//Dao로 전달
		int count = phonebookDao.personDelete(no);
		
		return count;
	}
	
	//수정폼
	public Map<String, Object> exeMform(int no) {
		System.out.println("PhonebookService.exeMform");
		
		//Dao로 personId전달
		Map<String, Object> pMap =phonebookDao.personMform(no);
		
		return pMap;
	}
	
	//수정
	public int exeModify(PersonVo personVo) {
		System.out.println("PhonebookService.exeModify");
		
		//Dao로 전달
		int count = phonebookDao.personModify(personVo);
		
		return count;
	}
}
