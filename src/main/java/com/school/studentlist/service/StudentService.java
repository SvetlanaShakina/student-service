package com.school.studentlist.service;

import com.school.studentlist.dto.request.StudentDtoRequest;
import com.school.studentlist.dto.request.StudentUpdateDtoRequest;
import com.school.studentlist.dto.response.StudentDtoResponse;
import com.school.studentlist.dto.response.SuccessResponse;

public interface StudentService {
    StudentDtoResponse addStudent(StudentDtoRequest request);

    SuccessResponse deleteStudent(int id);

    StudentDtoResponse updateStudent(StudentUpdateDtoRequest request);
}
