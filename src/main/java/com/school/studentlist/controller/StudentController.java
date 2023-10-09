package com.school.studentlist.controller;

import com.school.studentlist.dto.request.StudentDtoRequest;
import com.school.studentlist.dto.request.StudentUpdateDtoRequest;
import com.school.studentlist.dto.response.StudentDtoResponse;
import com.school.studentlist.dto.response.SuccessResponse;
import com.school.studentlist.service.StudentService;
import com.school.studentlist.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/students")
@Schema(description = "Операции по работе со справочником студентов")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @PostMapping()
    @Operation(description = "Добавление нового студента")
    public StudentDtoResponse addStudent(@RequestBody
                                         @Parameter(description = "Информация о новом студенте")
                                         @Valid StudentDtoRequest request) {
        return studentService.addStudent(request);
    }

    @DeleteMapping("/{id}")
    @Operation(description = "Удаление студента")
    public SuccessResponse deleteStudent(@PathVariable @Parameter(description = "Id студента") int id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping()
    @Operation(description = "Обновление студента")
    public StudentDtoResponse updateStudent(@RequestBody
                                            @Parameter(description = "Обновленная информация о студенте")
                                            @Valid StudentUpdateDtoRequest request) {
        return studentService.updateStudent(request);
    }
}