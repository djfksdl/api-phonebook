package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//등록
	@PostMapping("/api/phonebooks")
	public int wirte(@RequestBody PersonVo personVo) {
		System.out.println("PhonebookController.wirte");
		
		int count = phonebookService.exeWrite(personVo);
		
		return count;
	}
	
	//삭제하기
	@DeleteMapping("/api/phonebooks")
	public int delete(@RequestParam(value="personId")int no) {
		System.out.println("PhonebookController.delete");
		
		//서비스로 no전달
		int count = phonebookService.exeDelete(no);
		
		return count;
		
	}
	
	//수정폼
	@GetMapping("/api/phonebooks/{no}")
	public Map<String, Object> modifyform(@PathVariable(value = "no")int no) {
		System.out.println("PhonebookController.modifyform");
		
//		System.out.println(no);
		Map<String, Object> pMap = phonebookService.exeMform(no);
		
		return pMap;
		
	}
	
	//수정
	@PutMapping("/api/phonebooks")
	public int modify(@RequestBody PersonVo personVo) {//name,hp,company를 vo로 받아준다.
		System.out.println("PhonebookController.modify");
		//묶은값을 서비스로 전달
		int count = phonebookService.exeModify(personVo);
		
		return count;
	}
}
