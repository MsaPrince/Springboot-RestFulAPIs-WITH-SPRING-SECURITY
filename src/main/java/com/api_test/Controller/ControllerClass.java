package com.api_test.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api_test.Model.ModelClass;
import com.api_test.Service.ServiceClass;

@RestController
public class ControllerClass {
	
	@Autowired
	ServiceClass service;
	
	@GetMapping("/student_list")
	public List<ModelClass> getStudentList(){
		return service.getStudentList();
	}
	
	@GetMapping("/student/{id}")
	public Optional<ModelClass> getStudentById(@PathVariable Integer id ) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/student")
	public ModelClass saveStudentById(@RequestBody ModelClass model) {
		return service.saveStudentById(model);
	}
	
	@PutMapping("/student/{id}")
	public ModelClass updateById(@PathVariable Integer id, @RequestBody ModelClass model) {
		model.setId(id);
		return service.updateById(model);
		
	}
	 
	@DeleteMapping("/student/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}
	
	
}
