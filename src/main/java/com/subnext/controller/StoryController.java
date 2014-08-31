package com.subnext.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subnext.dao.CategoryDao;
import com.subnext.entity.CategoryEntity;

@Controller
public class StoryController {
	
	@Autowired
	private CategoryDao categoryDao;  
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public ModelAndView get() {
		CategoryEntity parentCategory = categoryDao.get(1L);
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName("Category2");
		categoryEntity.setParent(parentCategory);
		categoryDao.create(categoryEntity);
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", "Hello World!");
		ModelAndView modelAndView = new ModelAndView("storyDetail", model);
        return modelAndView;
    }

	
}
