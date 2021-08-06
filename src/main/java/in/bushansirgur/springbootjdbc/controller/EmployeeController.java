package in.bushansirgur.springbootjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springbootjdbc.DAO.EmployeeDAO;
import in.bushansirgur.springbootjdbc.entity.Employee;

@RestController
public class EmployeeController {
	
	@Autowired 
	private EmployeeDAO eDAO;
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return eDAO.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee findById(@PathVariable int id) {
		return eDAO.findById(id);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteById(@PathVariable int id) {
		return eDAO.deleteById(id)+" Employee(s) delete from the database";
	}
	
	@PostMapping("/employees")
	public String save(@RequestBody Employee e) {
		return eDAO.save(e)+" Employee(s) saved successfully";
	}
	
	@PutMapping("/employees/{id}")
	public String update(@RequestBody Employee e, @PathVariable int id) {
		return eDAO.update(e, id)+" Employee(s) updated successfully";
	}
	
}