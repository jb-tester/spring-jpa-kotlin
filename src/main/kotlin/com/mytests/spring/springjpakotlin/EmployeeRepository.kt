package com.mytests.spring.springjpakotlin

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<EmployeeTbl?, Int?>{
    fun findEmployeeTblsByEmployeeFullname(employeeFullname: String):List<EmployeeTbl>;
    @Query("select count(t) from EmployeeTbl t")
    fun countAll():Int;
}
