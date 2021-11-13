package com.cg.spring.boot.lab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.lab.model.Trainee;
import com.cg.spring.boot.lab.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	private TraineeService traineeService;

	// http://localhost:8083/ListAllTrainee
	@GetMapping("/ListAllTrainee")
	public List<Trainee> ListAllTrainee() {
		System.out.println("Controller ListAllTrainee");
		return traineeService.getAllTrainees();
	}

	// http://localhost:8083/ListTraineeById
	@GetMapping("/ListTraineeById/{traineeId}")
	public Trainee ListTraineeById(@PathVariable(name = "traineeId") int traineeId) {
		System.out.println("Controller 	ListTraineeById");
		return traineeService.getTraineeById(traineeId);

	}
	// http://localhost:8083/ListTraineeByName
	@GetMapping("/ListTraineeByName/{traineeName}")
	public Trainee ListTraineeByName(@PathVariable(name = "traineeName") String traineeName) {
		System.out.println("Controller 	ListTraineeByName");
		return traineeService.getTraineeByName(traineeName);

	}

	// http://localhost:8083/DeleteTraineebyId
	@DeleteMapping("/DeleteTraineeById/{TraineeId}")
	public int DeleteTraineeById(@PathVariable int TraineeId) {
		System.out.println("Controller deleteTraineeById");
		return traineeService.deleteTraineeById(TraineeId);
	}
	
	// http://localhost:8083/InsertTrainee
	@PostMapping("/InsertTrainee")
    public Trainee InsertTrainee(@RequestBody Trainee trainee){
	    System.out.println("Controller InsertTrainee");
		return traineeService.insertTrainee(trainee);
    }
	
	//http://localhost:8083/UpdateTrainee
			@PostMapping("/UpdateTrainee")
			public Trainee UpdateTrainee(@RequestBody Trainee trainee) {
				System.out.println("Controller update Trainee");
				return traineeService.updateTrainee(trainee);
			}

}
