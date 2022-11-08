package com.brooks.springandreact.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadData implements CommandLineRunner {

	private final EmployeeRepository repository;

	@Autowired 
	public LoadData(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
