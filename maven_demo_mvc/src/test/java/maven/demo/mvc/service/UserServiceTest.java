package maven.demo.mvc.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import maven.demo.mvc.base.SpringTestCase;
import maven.demo.mvc.bean.User;

public class UserServiceTest extends SpringTestCase{
	 
    @Autowired 
    private IUserService userService; 
 
    @Test 
    public void test(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.toString());
    }
    
}
