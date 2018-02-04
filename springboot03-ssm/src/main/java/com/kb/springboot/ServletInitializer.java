package com.kb.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Web项目的入口
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年2月1日 下午3:05:21
 * @version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("===========ServletInitializer===========");
		/** 设置引导类 */
		builder.sources(Application.class); 
		/** 设置 banner关闭 */
		builder.bannerMode(Mode.OFF);
		return builder;
	}
}
