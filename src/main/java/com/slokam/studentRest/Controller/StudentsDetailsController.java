package com.slokam.studentRest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.studentRest.Pojo.Student;
import com.slokam.studentRest.Repository.StudentRepo;

@RestController
@RequestMapping("/api")
public class StudentsDetailsController {
	
	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/details")
	public Student details(@RequestBody Student studentDetails) {
		return repo.save(studentDetails);
		
	}
	@GetMapping("/getdetails/{id}")
	public Student getdetails(@PathVariable int id) {
		return repo.findById(id).get();
		
	}
	@PutMapping("/updatedetails")
	public void updatedetails(@RequestBody Student details) {
		repo.save(details);
	}
	
	@DeleteMapping("/deletedetails/{id}")
	public void deletestudent(@PathVariable int id) {
		repo.deleteById(id);

		
	}

}
