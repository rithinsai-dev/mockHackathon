package com.mockhackathon.mockhackathon.dto;

import com.mockhackathon.mockhackathon.model.PayoutStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeePayrollDTO {
    private Long id;
    private Long payrollCycleId;
    private String payrollMonth;
    private Integer payrollYear;
    
    private Long employeeId;
    private String employeeName;
    private String employeeCode;
    private String department;
    
    private BigDecimal grossEarnings;
    private BigDecimal totalDeductions;
    private BigDecimal netSalary;
    
    private PayoutStatus payoutStatus;
    private String bankReference;
    private LocalDateTime paidAt;
    
    private List<SalaryBreakupDTO> breakups;
}
