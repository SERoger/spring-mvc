package spring_web_core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring_web_core.dao.UserDao;
import spring_web_core.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public void add(User user) {
		userDao.add(user);
	}
	
	public void update(User user) {
		userDao.update(user);
	}
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	public void deleteById(int id) {
		userDao.deleteUser(id);
	}
	
	public List<User> getAll(){
		return userDao.getAll();
	}

	
	
}
