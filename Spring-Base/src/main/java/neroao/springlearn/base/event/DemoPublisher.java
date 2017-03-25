package neroao.springlearn.base.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


//事件发布类
@Component
public class DemoPublisher {
	
	@Autowired
	ApplicationContext context;
	
	public void publish(String msg){
		context.publishEvent(new DemoEvent(this,msg));
	}
}
