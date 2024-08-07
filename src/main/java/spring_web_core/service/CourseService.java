package spring_web_core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_web_core.dao.CourseDao;
import spring_web_core.dao.UserDao;
import spring_web_core.model.Course;
import spring_web_core.model.User;

@Service
public class CourseService {
	@Autowired
	CourseDao courseDao;
	
	public void add(Course course) {
		
		courseDao.add(course);
	}
	
	public void update(Course course) {
		courseDao.update(course);
	}
	
	public Course getUserById(Long id) {
		return courseDao.getCourseById(id);
	}
	
	public void deleteById(Long id) {
		courseDao.deleteCourse(id);
	}
	
	public List<Course> getAll(){
		return courseDao.getAll();
	}
	
}
