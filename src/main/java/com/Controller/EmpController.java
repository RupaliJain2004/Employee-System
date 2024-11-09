package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bean.EmpBean;
import com.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empservice;

	@GetMapping("/")
	public String home(HttpSession session, Model model) {
		
		// for displaying the alert msg on the web page
		String msg = (String)session.getAttribute("msg");
		if(msg != null) {
			model.addAttribute("msg", msg);
			session.removeAttribute("msg");
		}
		
		// for displaying the data on the web page
		List<EmpBean> emp = empservice.getAllEmp();
		model.addAttribute("emp",emp);
		
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute EmpBean empbean, HttpSession session) {
		//System.out.println(empbean);
		
		empservice.addEmp(empbean);
		session.setAttribute("msg", "Employee added successfully..");
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		
		EmpBean e = empservice.getEmpById(id);
		m.addAttribute("emp", e);
		
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute EmpBean e, HttpSession session) {
		
		empservice.addEmp(e);
		session.setAttribute("msg", "Employee data Updated Successfully...");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id, HttpSession session) {
		
		empservice.deleteEmp(id);
		session.setAttribute("msg", "Employee data Deleted Successfully...");
		return "redirect:/";
	}
}
