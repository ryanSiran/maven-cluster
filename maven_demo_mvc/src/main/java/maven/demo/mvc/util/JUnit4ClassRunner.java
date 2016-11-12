package maven.demo.mvc.util;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ryan
 * @Date 2016.03.08
 * @UseMethod RunWith(JUnit4ClassRunner.class) 
 */
public class JUnit4ClassRunner extends SpringJUnit4ClassRunner{

	static{
		try {
//			Log4jConfigurer.initLogging("classpath:config/properties/log4j.properties");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cannot Initialize log4j");
		}
	}
	
	public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}
