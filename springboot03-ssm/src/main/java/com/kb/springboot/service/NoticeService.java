/**   
* @Title: NoticeService.java 
* @Package com.kb.springboot.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wongkb 
* @date 2018年2月1日 上午10:09:15 
* @version V1.0   
*/

package com.kb.springboot.service;

import java.util.List;
import java.util.Map;

import com.kb.springboot.pojo.Notice;

/** 
* @ClassName: NoticeService 
* @Description: Notice的Service接口
* @author wongkb
* @date 2018年2月1日 上午10:09:15 
*  
*/
public interface NoticeService {
	
	List<Notice> findAll();
	
	Map<String,Object> findByPage(Integer page, Integer rows);
}
