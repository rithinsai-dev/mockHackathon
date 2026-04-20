package com.mockhackathon.mockhackathon.dto;

import com.mockhackathon.mockhackathon.model.PayrollStatus;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PayrollCycleDTO {
    private Long id;

    @NotBlank(message = "Month is required")
    private String month;

    @NotNull(message = "Year is required")
    @Min(2000)
    @Max(2100)
    private Integer year;

    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate paymentDate;
    
    private PayrollStatus status;
    private LocalDateTime processedAt;
    private Long processedById;
    private String processedByName;
}
