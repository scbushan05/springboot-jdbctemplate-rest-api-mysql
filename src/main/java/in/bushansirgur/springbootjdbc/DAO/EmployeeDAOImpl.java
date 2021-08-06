package in.bushansirgur.springbootjdbc.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springbootjdbc.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM tbl_employees", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM tbl_employees WHERE id=?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM tbl_employees WHERE id=?", id);
	}

	@Override
	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO tbl_employees (name, location, department) VALUES (?, ?, ?)", new Object[] {e.getName(), e.getLocation(), e.getDepartment()});
	}

	@Override
	public int update(Employee e, int id) {
		return jdbcTemplate.update("UPDATE tbl_employees SET name = ?, location = ?, department = ? WHERE id = ?", new Object[] {e.getName(), e.getLocation(), e.getDepartment(), id});
	}
		
}