package in.saffu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.saffu.binding.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String loadPage(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "index";
	}
	
	@PostMapping("/register")
	public String returnPage(@Valid Student student,BindingResult result,Model model)
	{
		if (result.hasErrors()) {
			return "index";
			
		}
		System.out.println(student);
		model.addAttribute("msg", "Data insert successfully.....");
		return "success";
	}
	
	
	
	

}
