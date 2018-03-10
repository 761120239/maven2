package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午4:09:11 <br/>       
 */
public class UserServiceImpl implements UserService {

	 private UserDao userDao;

	    public void setUserDao(UserDao userDao) {
	        this.userDao = userDao;
	    }
	public User findUserById(Integer id) {
		  
		return userDao.findUserById(id);
	}

}
  
