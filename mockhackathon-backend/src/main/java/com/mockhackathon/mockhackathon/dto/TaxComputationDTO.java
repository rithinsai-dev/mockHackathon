package com.mockhackathon.mockhackathon.dto;

import com.mockhackathon.mockhackathon.model.TaxStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaxComputationDTO {
    private Long id;
    private Long employeeId;
    private String employeeName;
    private String employeeCode;
    
    private String financialYear;
    private BigDecimal totalIncome;
    private BigDecimal totalDeductionsUnder80C;
    private BigDecimal taxableIncome;
    private BigDecimal taxPayable;
    private BigDecimal cess;
    private BigDecimal totalTax;
    private BigDecimal tdsDeducted;
    
    private TaxStatus taxStatus;
}
