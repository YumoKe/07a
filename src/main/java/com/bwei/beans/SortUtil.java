package com.bwei.beans;

public class SortUtil {

	private static String name;
	
	private static String startdate;
	
	private static String enddate;
	
	private static String author;
	
	private static String minprice;
	
	private static String maxprice;
	
	private static String year;
	
	private static String mintime;
	
	private static String maxtime;
	
	private static String sort;
	
	private String sor;
	
	private static SortUtil su = new SortUtil();
	
	public static SortUtil getIns(){
		return su;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		SortUtil.name = name;
	}

	public static String getStartdate() {
		return startdate;
	}

	public static void setStartdate(String startdate) {
		SortUtil.startdate = startdate;
	}

	public static String getEnddate() {
		return enddate;
	}

	public static void setEnddate(String enddate) {
		SortUtil.enddate = enddate;
	}

	public static String getAuthor() {
		return author;
	}

	public static void setAuthor(String author) {
		SortUtil.author = author;
	}

	public static String getMinprice() {
		return minprice;
	}

	public static void setMinprice(String minprice) {
		SortUtil.minprice = minprice;
	}

	public static String getMaxprice() {
		return maxprice;
	}

	public static void setMaxprice(String maxprice) {
		SortUtil.maxprice = maxprice;
	}

	public static String getYear() {
		return year;
	}

	public static void setYear(String year) {
		SortUtil.year = year;
	}

	public static String getMintime() {
		return mintime;
	}

	public static void setMintime(String mintime) {
		SortUtil.mintime = mintime;
	}

	public static String getMaxtime() {
		return maxtime;
	}

	public static void setMaxtime(String maxtime) {
		SortUtil.maxtime = maxtime;
	}

	public static String getSort() {
		return sort;
	}

	public static void setSort(String sort) {
		SortUtil.sort = sort;
	}

	public String getSor() {
		this.sor = SortUtil.sort;
		return sor;
	}

	public void setSor(String sor) {
		this.sor = sor;
	}

	@Override
	public String toString() {
		return "SortUtil [name=" + name + ", startdate=" + startdate + ", enddate=" + enddate + ", author=" + author
				+ ", minprice=" + minprice + ", maxprice=" + maxprice + ", year=" + year + ", mintime=" + mintime
				+ ", maxtime=" + maxtime + ", sort=" + sort + "]";
	}
}
