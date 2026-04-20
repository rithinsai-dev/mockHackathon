package com.mockhackathon.mockhackathon.entity;

import com.mockhackathon.mockhackathon.model.PayoutStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_payrolls")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeePayroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "payroll_cycle_id", nullable = false)
    private PayrollCycle payrollCycle;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private User employee;

    private BigDecimal grossEarnings;
    private BigDecimal totalDeductions;
    private BigDecimal netSalary;

    @Enumerated(EnumType.STRING)
    private PayoutStatus payoutStatus;

    private String bankReference;
    private LocalDateTime paidAt;
}
