package com.example.Employee.Service;


import com.example.Employee.Entity.Employee;
import com.example.Employee.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public IEmployeeRepo repo;

    public List<Employee> getAll(){
        return repo.findAll();
    }

public Employee getById(Long id){

        return repo.findById(id).orElse(null);

}
public void save(Employee employee){

    repo.save(employee);
}

public void delete(Long id){
        repo.deleteById(id);

}

}
