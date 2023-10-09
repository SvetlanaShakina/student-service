package com.school.studentlist.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "Запрос на обновление оценки")
public class PerformanceUpdateDtoRequest {
    @Pattern(regexp = "^[2-5]$", message = "Оценка должна быть в диапазоне 2-5")
    private int id;

    @NotBlank
    private String text;
}
