package maven.demo.mvc.dao;

import maven.demo.mvc.bean.User;

public interface UserDao {

	/**
	 * 根据ID查询User
	 * @param id
	 * @return
	 */
	public User selectUserById(long id);
	
}
