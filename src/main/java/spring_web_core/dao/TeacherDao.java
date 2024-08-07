package spring_web_core.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import spring_web_core.model.Teacher;

@Component
public class TeacherDao {
  
	@Autowired
	private HibernateTemplate hTemplate;
	

	@Transactional
	public void add(Teacher teacher) {
		hTemplate.save(teacher);
	}
	
	@Transactional
	public void update(Teacher teacher) {
		hTemplate.update(teacher);
	}
	
	public Teacher getTeacherById(Long id) {
		return hTemplate.get(Teacher.class, id);
	}
	
	@Transactional
	public void deleteTeacher(Long id) {
		hTemplate.delete(getTeacherById(id));
	}
	
	public List<Teacher> getAll(){
		return hTemplate.loadAll(Teacher.class);
	}
	
}
