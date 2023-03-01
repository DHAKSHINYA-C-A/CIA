package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Family;
import com.example.demo.repo.FamilyRepository;



@Service
public class FamilyService {
	@Autowired
	FamilyRepository repositary;
    
    public Optional<Family> getStudent(int id){
 	   return repositary.findById(id);
 	   
    }
    public String updateDetails(Family fam) {
 	   repositary.save(fam);
 	   return "updated";
    }
    public String deleteDetails(int id)
    {
 	   repositary.deleteById(id);
 	   return "Id deleted";
    }

	       
}
