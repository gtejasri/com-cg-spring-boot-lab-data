package com.cg.spring.boot.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.lab.model.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Integer>{
	
	//List<Trainee> findByName(String Name);

}
