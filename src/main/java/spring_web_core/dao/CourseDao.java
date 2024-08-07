package spring_web_core.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import spring_web_core.model.Course;

@Component
public class CourseDao {
  
	@Autowired
	private HibernateTemplate hTemplate;
	

	@Transactional
	public void add(Course course) {
		hTemplate.save(course);
	}
	
	@Transactional
	public void update(Course course) {
		hTemplate.update(course);
	}
	
	public Course getCourseById(Long id) {
		return hTemplate.load(Course.class, id);
	}
	
	@Transactional
	public void deleteCourse(Long id) {
		hTemplate.delete(getCourseById(id));
	}
	
	public List<Course> getAll(){
		return hTemplate.loadAll(Course.class);
	}
	
}