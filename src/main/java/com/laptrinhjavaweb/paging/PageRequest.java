package com.laptrinhjavaweb.paging;

import com.laptrinhjavaweb.sort.Sorter;

public class PageRequest implements Pageble{
	
	private Integer page;
	private Integer maxPageItem;
	private Sorter sorter;
	
	public PageRequest(Integer page, Integer maxPageItem, Sorter sort) {
		this.page = page;
		this.maxPageItem = maxPageItem;
		this.sorter = sorter;
	}
	@Override
	public Integer getPage() {
		return this.page;
	}

	@Override
	public Integer getOffset() {
		if(this.page != null && this.maxPageItem != null) {
			return (this.page - 1)* this.maxPageItem;
		}
		return null;
	}
	

	public Sorter getSorter() {
		if(this.sorter != null) {
			return sorter;
		}
		return null;
	}
	
	@Override
	public Integer getLimit() {
		
		return this.maxPageItem;
	}

}
