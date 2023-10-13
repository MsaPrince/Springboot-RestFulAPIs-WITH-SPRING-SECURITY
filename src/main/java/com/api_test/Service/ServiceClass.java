package com.api_test.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_test.Model.ModelClass;
import com.api_test.Repositoy.RepositoryInterface;

@Service
public class ServiceClass 
{
	@Autowired
	RepositoryInterface repo;
	
	public List<ModelClass> getStudentList(){
		return repo.findAll();
	}
	
	public Optional<ModelClass> getStudentById(Integer id) {
		return  repo.findById(id);
	}
	
	public ModelClass saveStudentById(ModelClass model) {
		return repo.save(model);
	}
	
	public ModelClass updateById(ModelClass model) {
		return repo.save(model);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
	
	
}
