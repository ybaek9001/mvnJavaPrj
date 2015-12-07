package com.newlecture.mvnJavaPrj;

public class NewNotice implements Notice{

	private String code;
	private String title;
	private String writer;
	private String content;
	private String regDate;
	private int hit;
	private String writerName;
	private int comtCount;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public int getComtCount() {
		return comtCount;
	}
	public void setComtCount(int comtCount) {
		this.comtCount = comtCount;
	}
	public String getTitle() {
		//시간을 출력하는 코드를 여기에 입력(하지만 proxy 방법을 이용해 여기에 코드 입력 안함)
		//시작시간
		
		String t = title; //제목을 얻는 로직
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//끝 시간
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
	
}
