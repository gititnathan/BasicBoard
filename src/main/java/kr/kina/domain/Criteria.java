package kr.kina.domain;

public class Criteria {

	private int page;
	private int perPageNum;
	
	public Criteria(){
		this.page = 1;
		this.perPageNum = 10;
	}
	
	public void setPage(int page){
	
		if(page <= 0){
			this.page = 1;
			return;
		}
		this.page = page;
	}
	
	public void setPerPageNum(int pageNum){
		if (perPageNum <= 0 || perPageNum > 100){
			this.perPageNum =10;
			return;
		} 
		this.perPageNum=pageNum;
	}
	
	public int getPage(){
		return page;
	}
	
	//method for MyBatis SQL Mapper
	public int getPageStart(){
		return (this.page -1) * perPageNum;
	}
	
	//method for MyBatis SQL Mapper
	public int getPerPageNum(){
		return this.perPageNum;
	}
	
	@Override
	public String toString(){
		return "Criteria [page=" + page + ", " + "perPageNum=" + perPageNum + "]";
	}
}
