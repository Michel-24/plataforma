package com.example.demo.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PersonRepositary extends JpaRepository <Person,Integer> 
{
    
}
