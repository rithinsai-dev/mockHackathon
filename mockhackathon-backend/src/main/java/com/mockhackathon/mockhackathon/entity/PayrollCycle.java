package com.mockhackathon.mockhackathon.entity;

import com.mockhackathon.mockhackathon.model.PayrollStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "payroll_cycles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PayrollCycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String month;

    @Column(nullable = false)
    private Integer year;

    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PayrollStatus status;

    private LocalDateTime processedAt;

    @ManyToOne
    @JoinColumn(name = "processed_by")
    private User processedBy;
}
