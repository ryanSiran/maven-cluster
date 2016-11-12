package maven.demo.mvc.service;

import maven.demo.mvc.bean.User;

public interface IUserService {

	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public User selectUserById(long id);
	
}
