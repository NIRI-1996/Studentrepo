package com.slokam.studentRest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PutMapping("/updatedetails/{id}")
	public Student updatedetails(@PathVariable int id) {
		Student sd=repo.findById(id).get();
    return repo.save(sd);
		
	}
	@GetMapping("/getdetails/{id}")
	public Student getdetails(@PathVariable int id) {
		return repo.findById(id).get();
		
	}

}
