package com.jim.springboot.controller;

import com.jim.springboot.model.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liu jun
 * @date: 23:37 2017/11/29
 * @ver: 1.0
 * @desc:
 */
@Controller
@RequestMapping(value = "/student")
public class IndexController {
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private Student student;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Student getDefaultStudent(){
		String studentBeanName = student.getClass().getCanonicalName();
		LOGGER.debug("============>" + studentBeanName);
		return student;
	}
}
