package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.model.Family;
import com.example.demo.repository.FamilyRepository;




@Controller
public class ApiController {
	@Autowired
	FamilyRepository serviceRepositary;
    
   
    
    @GetMapping("/getvalues")
    List<Family> getList(){
  	  return serviceRepositary.findAll();
    }
    @PostMapping("/post")
         public Family create(@RequestBody Family fam) {
  	  return serviceRepositary.save(fam);
    }
    
    

}
