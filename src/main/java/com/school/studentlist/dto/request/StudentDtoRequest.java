package com.school.studentlist.dto.request;

import com.school.studentlist.entity.Performance;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "Запрос с информацией о студенте")
public class StudentDtoRequest {
    @Pattern(regexp = "^[a-zA-Za-яА-Я]*$", message = "Фамилия должна состоять только из букв")
    private String surname;

    @Pattern(regexp = "^[a-zA-Za-яА-Я]*$", message = "Имя должно состоять только из букв")
    private String name;

    @Pattern(regexp = "^[a-zA-Za-яА-Я]*$", message = "Отчество должно состоять только из букв")
    private String middleName;

    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Дата рождения должна быть в формате YYYY-MM-DD")
    private LocalDate birthdate;

    private Performance performance;
}
