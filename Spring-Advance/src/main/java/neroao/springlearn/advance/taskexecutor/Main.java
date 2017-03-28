package neroao.springlearn.advance.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService service = context.getBean(AsyncTaskService.class);
		for(int i = 0;i<10;i++){
			service.excuteAsyncTask(i);
			service.executeAsyncTaskPlus(i);
		}
		context.close();

	}

}
