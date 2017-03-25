package neroao.springlearn.base.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("neroao.springlearn.base.aop")
@EnableAspectJAutoProxy//开启Spring对AspectJ的支持
public class AopConfig {

}
