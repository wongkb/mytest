/**   
* @Title: Notice.java 
* @Package com.kb.springboot.pojo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wongkb 
* @date 2018年2月1日 上午10:03:52 
* @version V1.0   
*/

package com.kb.springboot.pojo;

/** 
* @ClassName: Notice 
* @Description: Notice实体类
* @author wongkb
* @date 2018年2月1日 上午10:03:52 
*  
*/

public class Notice {
	
	private Long id;
	private String content;
	private String title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
