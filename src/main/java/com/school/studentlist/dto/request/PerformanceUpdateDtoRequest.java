package com.school.studentlist.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "Запрос на обновление оценки")
public class PerformanceUpdateDtoRequest {
    private int id;

    @NotBlank
    private String text;
}