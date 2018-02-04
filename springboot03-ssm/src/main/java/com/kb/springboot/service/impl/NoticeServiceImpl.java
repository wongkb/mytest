/**   
* @Title: NoticeServiceImpl.java 
* @Package com.kb.springboot.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wongkb 
* @date 2018年2月1日 上午10:11:10 
* @version V1.0   
*/

package com.kb.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kb.springboot.mapper.NoticeMapper;
import com.kb.springboot.pojo.Notice;
import com.kb.springboot.service.NoticeService;

/** 
* @ClassName: NoticeServiceImpl 
* @Description: Notice的Service实现类 
* @author wongkb
* @date 2018年2月1日 上午10:11:10 
*  
*/
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page,Integer rows) {
		Map<String,Object> data = new HashMap<String, Object>();
		
		//查询记录数
		Long total = noticeMapper.count();
		data.put("total", total);
		//分页查询记录
		List<Notice> noticeList = noticeMapper.findByPage((page - 1) * rows, rows);
		data.put("rows", noticeList);
		
		return data;
	}
	
}
