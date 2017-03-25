package neroao.springlearn.base.prepost;

public class BeanWayService {
	
	public void init(){
		System.out.println("@Bean-init-Method");
	}
	
	public BeanWayService(){
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}
	
	public void destroy(){
		System.out.println("@Bean-destroy-Method");
	}

}
