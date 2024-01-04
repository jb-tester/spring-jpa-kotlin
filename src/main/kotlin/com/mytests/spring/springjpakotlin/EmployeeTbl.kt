package com.mytests.spring.springjpakotlin

import jakarta.persistence.*
import java.math.BigDecimal


@Entity
@Table(name = "employee_tbl", schema = "jbtests")
class EmployeeTbl(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMPLOYEE_ID")
    val employeeId: Int?,

    @Column(name = "EMPLOYEE_FULLNAME")
    var employeeFullname: String?,

    @Column(name = "EMPLOYEE_DESIGNATION")
    var employeeDesignation: String?,

    @Column(name = "EMPLOYEE_SALARY")
    var employeeSalary: BigDecimal? = null
)
