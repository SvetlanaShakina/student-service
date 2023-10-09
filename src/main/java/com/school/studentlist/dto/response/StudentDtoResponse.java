package com.school.studentlist.dto.response;

import com.school.studentlist.entity.Performance;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Schema(description = "Информация о студенте")
public class StudentDtoResponse {
    private int id;

    private String surname;

    private String name;

    private String middleName;

    private LocalDate birthdate;

    private Performance performance;
}
