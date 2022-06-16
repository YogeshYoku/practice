package com.omrbranch.pojo;
import java.util.ArrayList;
import java.util.List;
public class Employee1 {
private String page;
private String per_page;
private String total;
private String total_pages;
private List<Data1> data;
public Support1 getSupport() {
		return support;
	}
public void setSupport(Support1 support) {
this.support = support;
	}
private Support1 support;
public Employee1(String page, String per_page, String total, String total_pages, List<Data1> datas,Support1 support) {
this.page = page;
this.per_page = per_page;
this.total = total;
this.total_pages = total_pages;
this.data = datas;
this.support = support;

	}

public List<Data1> getData() {
		return data;
	}
public void setData(ArrayList<Data1> data) {
		this.data = data;
	}
public String getPage() {
		return page;
	}
public void setPage(String page) {
		this.page = page;
	}
public String getPer_page() {
		return per_page;
	}
public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
public String getTotal() {
		return total;
	}
public void setTotal(String total) {
		this.total = total;
	}
public String getTotal_pages() {
		return total_pages;
	}
public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
}
