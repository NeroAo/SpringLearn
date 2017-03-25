package neroao.springlearn.base.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod");
//		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProfileConfig.class);
		context.refresh();
		DemoBean bean1 = context.getBean(DemoBean.class);
		
		System.out.println(bean1.getContent());
		
		context.close();

	}

}
