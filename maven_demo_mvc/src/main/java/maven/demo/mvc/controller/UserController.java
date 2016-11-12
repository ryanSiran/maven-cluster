package maven.demo.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import maven.demo.mvc.bean.User;
import maven.demo.mvc.service.IUserService;

@Controller
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("{userId}/getUser")
	public ModelAndView getUser(HttpServletRequest request, HttpServletResponse response,
			@PathVariable Integer userId){
		ModelAndView mav = new ModelAndView();
		try {
			User user = userService.selectUserById(userId);
			mav.addObject("user", user);
			mav.setViewName("user");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
}
