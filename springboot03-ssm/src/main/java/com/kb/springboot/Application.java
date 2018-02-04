/**   
* @Title: Application.java 
* @Package com.kb.springboot 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wongkb 
* @date 2018年2月1日 上午8:39:38 
* @version V1.0   
*/

package com.kb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 
* @ClassName: Application 
* @Description: SpringBoot运行的入口类
* @author wongkb
* @date 2018年2月1日 上午8:39:38 
*  
*/
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}

}
