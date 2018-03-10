package com.itheima.web;

import org.springframework.ui.Model;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午3:14:52 <br/>       
 */

	
	public class UserAction extends ActionSupport implements ModelDriven<User> {

	    private User model = new User();

	    @Override
	    public User getModel() {
	        return model;
	    }

	    private Integer id;

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    // Struts框架在封装数据的时候,会优先封装给模型对象
	    public String findUserById() {
	        System.out.println();
	        model = userService.findUserById(model.getId());
	        return SUCCESS;
	    }

	    private UserService userService;

	    public void setUserService(UserService userService) {
	        this.userService = userService;
	    }

	}

  
