package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Family;
import com.example.demo.repo.FamilyRepository;
import com.example.demo.service.FamilyService;



@Controller
public class ApiController {
	@Autowired
	FamilyRepository serviceRepositary;
    
    @Autowired
    FamilyService service;
    
    @GetMapping("/getvalues")
    List<Family> getList(){
  	  return serviceRepositary.findAll();
    }
    @PostMapping("/post")
         public Family create(@RequestBody Family fam) {
  	  return serviceRepositary.save(fam);
    }
    
    @GetMapping("/getvalues/{id}")
    public Optional<Family> getbyid(@PathVariable int id){
  	  return service.getStudent(id);
    }
    @PutMapping("/family")
    public String update(@RequestBody Family fam) {
  	  return service.updateDetails(fam);
    }
    @DeleteMapping("/family")
    public String delete(@RequestParam int id)
    {
  	  return service.deleteDetails(id);
    }

}
