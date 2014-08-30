package com.subnext.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoryController {
	
	@RequestMapping(value = "/story", method = RequestMethod.GET)
	public ModelAndView get() {
		Map<String, String> model = new HashMap<String, String>();
		model.put("message", "Hello World!");
		ModelAndView modelAndView = new ModelAndView("storyDetail", model);
        return modelAndView;
    }
}
