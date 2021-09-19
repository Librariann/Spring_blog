package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.MemberDAO;

@Service
public class MainServiceImpl implements MainService{
	
	@Autowired
	MemberDAO dao;

	@Override
	public List list() {
		return dao.list();
	}

}
