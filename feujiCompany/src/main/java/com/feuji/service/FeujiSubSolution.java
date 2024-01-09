package com.feuji.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.bean.FeujiSolutions;
import com.feuji.entity.FeujiEntity;
import com.feuji.repository.FeujiRepository;
@Service
public class FeujiSubSolution implements FeujiService {
	
	
	@Autowired
	protected FeujiRepository repository;
	
	

	@Override
	public void save(FeujiSolutions solutions) {
		
		FeujiEntity entity=new FeujiEntity();
		entity.setCompany_Name(solutions.getCompany_Name());
		entity.setLocation(solutions.getLocation());
		entity.setNumberOfEmp(solutions.getNumberOfEmp());
		
		repository.save(entity);
		
	}

}
