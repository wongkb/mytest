/**   
* @Title: HelloController.java 
* @Package com.kb.springboot.controller 
* @Description: item控制器测试类
* @author wongkb 
* @date 2018年2月1日 上午8:48:39 
* @version V1.0   
*/

package com.kb.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kb.springboot.pojo.Notice;
import com.kb.springboot.service.NoticeService;

/**
 * 
* @ClassName: NoticeController 
* @Description: Notice的控制器
* @author wongkb
* @date 2018年2月1日 上午10:13:01 
*
 */
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> user() {
		return noticeService.findAll();
	}
	
	@GetMapping("/show")
	public String show() {
		return "/html/notice.html";
	}
	
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows) {
		Map<String, Object> map = noticeService.findByPage(page, rows);
		return map;
	}
}
