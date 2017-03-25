package neroao.springlearn.base.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@Value("其他类的属性")
	private String another;
	
	public String getAnother(){
		return this.another;
	}
	
	public void setAnother(String another){
		this.another = another;
	}

}
