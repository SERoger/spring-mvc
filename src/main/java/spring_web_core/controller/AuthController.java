package spring_web_core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import spring_web_core.dao.CourseDao;
import spring_web_core.dao.TeacherDao;
import spring_web_core.model.Teacher;

@Controller
public class AuthController {
	
	@Autowired
	CourseDao courseDao;
	
	@Autowired
	TeacherDao teacherDao;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView display() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("loginPage");
		//mv.setViewName("adminPage");
		return mv;
	}
	
	
	@RequestMapping(value="/teacherForm", method=RequestMethod.GET)
	public ModelAndView displayTeacherForm() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("teacherFomPage");
		return mv;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password) {
		ModelAndView mv=new ModelAndView();
		if(username.equalsIgnoreCase("mroger") && password.equals("Jesus1king")) {
			mv.setViewName("teacherFomPage");
			return mv;
		}else {
			mv.setViewName("errorPage");
			return mv;
		}
	}
	
	@RequestMapping(value="/addTeacher", method=RequestMethod.POST)
	public String addTeacher(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,Model model) {
		ModelAndView mv=new ModelAndView();
		Teacher teacher=new Teacher();
		teacher.setFirstName(firstName);
		teacher.setLastName(lastName);
		teacherDao.add(teacher);
		model.addAttribute("teachers",teacherDao.getAll());
		return "redirect:/teachers";
	}
	
	
	@RequestMapping(value="/teachers", method=RequestMethod.GET)
	public ModelAndView displayTeacherList(Model model) {
		ModelAndView mv=new ModelAndView();
		model.addAttribute("teachers",teacherDao.getAll());
		model.addAttribute("title","Teacher List");
		mv.setViewName("teacherListPage");
		return mv;
	}
	
	@RequestMapping(value="/deleteTeacher/{id}",method=RequestMethod.GET)
	public String deleteUser(@PathVariable("id") Long id,Model model) {
		ModelAndView mv=new ModelAndView();
		teacherDao.deleteTeacher(id);
		model.addAttribute("teachers",teacherDao.getAll());
		return "redirect:/teachers";
	}
	
	@RequestMapping(value="/editTeacher/{id}",method=RequestMethod.GET)
	public ModelAndView editTeacher(@PathVariable("id") Long id,Model model) {
		ModelAndView mv=new ModelAndView();
		Teacher t=teacherDao.getTeacherById(id);
		model.addAttribute("teacher",t);
		mv.setViewName("editTeacherPage");
		return mv;
	}
	
	@RequestMapping(value="/editTeacher/updateData", method=RequestMethod.POST)
	public String updateTeacher(@ModelAttribute("updateData") Teacher teacher) {
		teacherDao.update(teacher);
		return "redirect:/teachers";
	}
}
