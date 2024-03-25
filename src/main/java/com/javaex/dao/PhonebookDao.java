package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhonebookDao {
	//필드
	@Autowired
	private SqlSession sqlSession;
	
	//전체리스트
	public List<PersonVo> selectList(){
		System.out.println("PhonebookDao.selectList");
		
		List<PersonVo>phonebookList = sqlSession.selectList("phonebook.selectList");
		
		return phonebookList;
	}
}
