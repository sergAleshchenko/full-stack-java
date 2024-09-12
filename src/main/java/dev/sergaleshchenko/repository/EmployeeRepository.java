package dev.sergaleshchenko.repository;

import dev.sergaleshchenko.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sergei Aleshchenko
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
