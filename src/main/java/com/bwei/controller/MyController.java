package com.bwei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bwei.beans.Movie;
import com.bwei.beans.SortUtil;
import com.bwei.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {

	@Resource
	MovieService ms;
	
	@RequestMapping("/list")
	public ModelAndView findAll(@RequestParam(defaultValue="1")Integer pageNum,SortUtil su){
		ModelAndView mav = new ModelAndView();
		PageHelper.startPage(pageNum, 3);
		SortUtil ins = su.getIns();
		List<Movie> list = ms.findAll(ins);
		System.out.println(ins);
		PageInfo<Movie> page = new PageInfo<Movie>(list);
		mav.setViewName("list");
		mav.getModel().put("page", page);
		mav.getModel().put("su", ins);
		return mav;
	}
	
	@RequestMapping("delete")
	public String delete(String id){
		ms.delete(id);
		return "redirect:list";
	}
	
	@RequestMapping("buy")
	public String buy(Integer note,Integer id){
		System.out.println(note);
		System.out.println(id);
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("note",note);
		map.put("id", id);
		ms.upd(map);
		return "redirect:list";
	}
}
