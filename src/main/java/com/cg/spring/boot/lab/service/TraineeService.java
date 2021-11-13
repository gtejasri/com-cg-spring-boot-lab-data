package com.cg.spring.boot.lab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.lab.model.Trainee;
import com.cg.spring.boot.lab.repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;
	
	public List<Trainee> getAllTrainees(){
		System.out.println("Service getAllTrainees");
		return traineeRepository.findAll();
	}
	
	public Trainee getTraineeById(int traineeId) {
		System.out.println("Service getTraineeById");
		return traineeRepository.findById(traineeId).get();
	}
	public Trainee getTraineeByName(String traineeName) {
		System.out.println("Service getTraineeByName");
	
		return null;
	}
	
	public int deleteTraineeById(int traineeId) {
		System.out.println("Service deleteTraineeById");
		if (traineeRepository.existsById(traineeId)) {
			traineeRepository.deleteById(traineeId);
			return traineeId;
		}
		System.out.println(traineeId + " does not exist.");
		return 0;
	}
	
	public Trainee insertTrainee(Trainee trainee) {
		System.out.println("Service insertTrainee");
		if (!traineeRepository.existsById(trainee.getTraineeId()))
			return traineeRepository.save(trainee);
		System.out.println(trainee.getTraineeId() + " already exists.");
		return null;
	}
	public Trainee updateTrainee(Trainee trainee) {
		System.out.println("Service updateEmployee");
		if (traineeRepository.existsById(trainee.getTraineeId()))
			return traineeRepository.save(trainee);
		System.out.println(trainee.getTraineeId()+ " does not exist.");
		return null;
	}
	
	
}
