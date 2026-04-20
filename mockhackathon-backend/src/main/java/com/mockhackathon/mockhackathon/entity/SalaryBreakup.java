package com.mockhackathon.mockhackathon.entity;

import com.mockhackathon.mockhackathon.model.ComponentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "salary_breakups")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalaryBreakup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_payroll_id", nullable = false)
    private EmployeePayroll employeePayroll;

    @Column(nullable = false)
    private String componentName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ComponentType componentType;

    @Column(nullable = false)
    private BigDecimal amount;

    private String calculationFormula;
}
