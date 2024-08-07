package spring_web_core.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import spring_web_core.model.User;

@Component
public class UserDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void add(User user) {
		hibernateTemplate.save(user);
	}
	
	@Transactional
	public void update(User user) {
		hibernateTemplate.update(user);
	}
	
	public User getUserById(int id) {
		return hibernateTemplate.load(User.class, id);
	}
	
	@Transactional
	public void deleteUser(int id) {
		hibernateTemplate.delete(getUserById(id));
	}
	
	public List<User> getAll(){
		return hibernateTemplate.loadAll(User.class);
	}
	

	
}
