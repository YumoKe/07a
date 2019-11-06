package com.bwei.service;

import java.util.List;
import java.util.Map;

import com.bwei.beans.Movie;
import com.bwei.beans.SortUtil;

public interface MovieService {

	public List<Movie> findAll(SortUtil su);
	
	public int delete(String id);

	public void upd(Map<String, Integer> map);
}
