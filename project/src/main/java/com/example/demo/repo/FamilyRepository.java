package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family,Integer>{

}
