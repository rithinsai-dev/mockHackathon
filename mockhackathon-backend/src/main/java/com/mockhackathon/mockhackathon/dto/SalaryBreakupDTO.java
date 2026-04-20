package com.mockhackathon.mockhackathon.dto;

import com.mockhackathon.mockhackathon.model.ComponentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalaryBreakupDTO {
    private Long id;
    private Long employeePayrollId;
    private String componentName;
    private ComponentType componentType;
    private BigDecimal amount;
    private String calculationFormula;
}
