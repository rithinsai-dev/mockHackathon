package com.mockhackathon.mockhackathon.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalaryStructureDTO {
    private Long id;

    @NotNull(message = "Employee ID is required")
    private Long employeeId;

    @NotNull(message = "Basic salary is required")
    @DecimalMin(value = "15000.0", message = "Basic salary must be at least 15,000")
    private BigDecimal basicSalary;

    private BigDecimal hra;
    private BigDecimal da;
    private BigDecimal specialAllowance;
    private BigDecimal bonus;
    private BigDecimal lta;

    private LocalDate effectiveFrom;
    private LocalDate effectiveTo;
    
    // For response
    private String employeeName;
    private String employeeCode;
}
