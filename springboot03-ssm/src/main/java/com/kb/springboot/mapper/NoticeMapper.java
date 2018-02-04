/**   
* @Title: NoticeMapper.java 
* @Package com.kb.springboot.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wongkb 
* @date 2018年2月1日 上午10:05:23 
* @version V1.0   
*/

package com.kb.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kb.springboot.pojo.Notice;

/** 
* @ClassName: NoticeMapper 
* @Description: Notice的Mapper
* @author wongkb
* @date 2018年2月1日 上午10:05:23 
*  
*/
@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice")
	List<Notice> findAll();
	
	List<Notice> findByPage(@Param("page") Integer page, @Param("rows") Integer rows);
	
	long count();
}
