package com.project.librarian;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.service.MainService;
import com.project.service.MainServiceImpl;
import com.project.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	MainService service;
	
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String main(Model model) {
		
		List<MemberVO> list = service.list();
		for (MemberVO member : list) {
			System.out.println(member.getId());
		}
		
		return "home";
	}
	
}
