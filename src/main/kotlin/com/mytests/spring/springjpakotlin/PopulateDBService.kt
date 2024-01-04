package com.mytests.spring.springjpakotlin

import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.List

@Service
class PopulateDBService(private val repository: EmployeeRepository) {
    fun populateDB() {
        val count = repository.countAll()
        val tblList = List.of(
            EmployeeTbl(count + 1, "Marie Johnson", "QA engineer", BigDecimal(50000)),
            EmployeeTbl(count + 2, "Julia Davidson", "QA engineer", BigDecimal(50000))
        )
        /*for (e in tblList) {
            println(e.employeeFullname+" "+e.employeeDesignation)
        }*/
        repository.saveAll(tblList)
        /*val emp = EmployeeTbl(null,null,null,null)
        emp.employeeFullname = "William Smith"
        emp.employeeDesignation = "manager"
        emp.employeeSalary = BigDecimal(200000)
        repository.save(emp)*/
    }
}
