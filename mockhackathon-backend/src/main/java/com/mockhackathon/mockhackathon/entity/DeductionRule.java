package com.mockhackathon.mockhackathon.entity;

import com.mockhackathon.mockhackathon.model.DeductionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "deduction_rules")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeductionRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeductionType deductionType;

    private BigDecimal percentage;
    private BigDecimal fixedAmount;
    private BigDecimal maxAmount;

    private LocalDate applicableFrom;
}
