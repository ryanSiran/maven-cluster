package maven.demo.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maven.demo.mvc.bean.User;
import maven.demo.mvc.dao.UserDao;
import maven.demo.mvc.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User selectUserById(long id) {
		return userDao.selectUserById(id);
	}

}
