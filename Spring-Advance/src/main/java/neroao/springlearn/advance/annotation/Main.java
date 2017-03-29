package neroao.springlearn.advance.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService service = context.getBean(DemoService.class);
		service.outputResult();
		context.close();

	}

}
