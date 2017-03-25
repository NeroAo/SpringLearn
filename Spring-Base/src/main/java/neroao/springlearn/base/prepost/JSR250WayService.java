package neroao.springlearn.base.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	@PostConstruct
	public void init(){
		System.out.println("@Bean-init-Method");
	}
	
	public JSR250WayService(){
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("@Bean-destroy-Method");
	}

}
