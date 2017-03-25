package neroao.springlearn.base.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(EventConfig.class);
		
		DemoPublisher publisher = context.getBean(DemoPublisher.class);
		publisher.publish("Hello application event");
		context.close();
	}

}
