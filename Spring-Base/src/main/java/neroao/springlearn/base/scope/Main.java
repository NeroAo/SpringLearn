package neroao.springlearn.base.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService ss1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService ss2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService ps1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService ps2 = context.getBean(DemoPrototypeService.class);

		System.out.println("ss1 与 ss2是否相同："+ss1.equals(ss2));
		System.out.println("ps1 与 ps2是否相同："+ps1.equals(ps2));
		
		context.close();
	}

}
