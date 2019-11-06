package com.bwei.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwei.beans.Movie;
import com.bwei.beans.SortUtil;
import com.bwei.dao.MovieDao;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Resource
	MovieDao dao;
	
	public List<Movie> findAll(SortUtil su) {
		// TODO Auto-generated method stub
		return dao.findAll(su);
	}

	public int delete(String id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	public void upd(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		dao.upd(map);
		
	}

}
