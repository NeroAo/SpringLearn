package test.neroao.springlearn.test;

import neroao.springlearn.test.TestBean;
import neroao.springlearn.test.TestConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanInterationTests {
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShoudInject(){
		String expected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}

}
