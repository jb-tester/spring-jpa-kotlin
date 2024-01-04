package com.mytests.spring.springjpakotlin

import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(
    private val employeeRepository: EmployeeRepository,
    private val populateDBService: PopulateDBService
) {
    @GetMapping("/all")
    fun getAll(): MutableIterable<EmployeeTbl?>
         {

            return employeeRepository.findAll()
        }

    @GetMapping("/byName/{name}")
    fun byName(@PathVariable("name") name: String): List<EmployeeTbl> {
        return employeeRepository.findEmployeeTblsByEmployeeFullname(name)
    }

    @PostMapping("/add")
    fun addEmpl(@RequestBody emp: EmployeeTbl): EmployeeTbl {
        employeeRepository.save(emp)
        return emp
    }

    @RequestMapping("/populate")
    fun populateTable(): MutableIterable<EmployeeTbl?> {
        populateDBService.populateDB()
        return employeeRepository.findAll()
    }
}
