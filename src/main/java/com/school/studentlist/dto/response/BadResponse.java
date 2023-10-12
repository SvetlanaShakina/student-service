package com.school.studentlist.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Негативный ответ в случае внутренней ошибки")
public record BadResponse(
        String message
) {
}
