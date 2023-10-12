package com.school.studentlist.service;

import com.school.studentlist.dto.request.StudentDtoRequest;
import com.school.studentlist.dto.request.StudentUpdateDtoRequest;
import com.school.studentlist.dto.response.StudentDtoResponse;
import com.school.studentlist.dto.response.SuccessResponse;

public interface StudentService {

    /**
     * Добавление нового студента
     *
     * @param request - информация о добавляемом студенте
     * @return - информация из БД о добавленной записи
     */
    StudentDtoResponse addStudent(StudentDtoRequest request);

    /**
     * Удаление студента
     *
     * @param id - идентификатор студента
     * @return - результат операции
     */
    SuccessResponse deleteStudent(int id);

    /**
     * Обновление информации о студенте
     *
     * @param request - обновленные данные студента
     * @return - информация из БД об обновленной записи
     */
    StudentDtoResponse updateStudent(StudentUpdateDtoRequest request);
}
