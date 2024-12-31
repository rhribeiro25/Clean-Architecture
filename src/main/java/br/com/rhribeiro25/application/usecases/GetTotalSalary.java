package br.com.rhribeiro25.application.usecases;

import br.com.rhribeiro25.domain.repositories.DepartmentRepository;
import br.com.rhribeiro25.domain.services.DepartmentService;
import br.com.rhribeiro25.domain.valueobjects.Department;

import java.math.BigDecimal;

public class GetTotalSalary {

    private final DepartmentRepository departmentRepository;
    private final DepartmentService salaryService;

    public GetTotalSalary(DepartmentRepository departmentRepository, DepartmentService salaryService) {
        this.departmentRepository = departmentRepository;
        this.salaryService = salaryService;
    }

    public BigDecimal getTotalSalary(String departmentId) {
        Department department = departmentRepository.findById(departmentId);
        if (department == null) {
            throw new IllegalArgumentException("Department not found");
        }

        return salaryService.calculateTotalSalary(department);
    }
}