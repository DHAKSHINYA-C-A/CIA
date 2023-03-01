package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.AddressRepo;
import com.example.demo.model.Address;

@Controller
public class ApiController {
@Autowired
AddressRepo repo;
@GetMapping("/getvalues")
      List<Address> getList(){
	  return repo.findAll();
}
}
