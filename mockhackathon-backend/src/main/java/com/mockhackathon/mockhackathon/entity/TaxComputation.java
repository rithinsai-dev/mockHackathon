package com.mockhackathon.mockhackathon.entity;

import com.mockhackathon.mockhackathon.model.TaxStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tax_computations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaxComputation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private User employee;

    @Column(nullable = false)
    private String financialYear;

    private BigDecimal totalIncome;
    private BigDecimal totalDeductionsUnder80C;
    private BigDecimal taxableIncome;
    private BigDecimal taxPayable;
    private BigDecimal cess;
    private BigDecimal totalTax;
    private BigDecimal tdsDeducted;

    @Enumerated(EnumType.STRING)
    private TaxStatus taxStatus;
}
