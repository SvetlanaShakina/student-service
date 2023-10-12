package com.school.studentlist.service;

import com.school.studentlist.dto.request.StudentDtoRequest;
import com.school.studentlist.dto.request.StudentUpdateDtoRequest;
import com.school.studentlist.dto.response.StudentDtoResponse;
import com.school.studentlist.dto.response.SuccessResponse;
import com.school.studentlist.entity.Student;
import com.school.studentlist.exception.ServiceException;
import com.school.studentlist.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private ModelMapper mapper;
    private StudentRepository repository;

    @Autowired
    public StudentServiceImpl(ModelMapper mapper, StudentRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public StudentDtoResponse addStudent(StudentDtoRequest request) {
        Student student = mapper.map(request, Student.class);
        return mapper.map(repository.save(student), StudentDtoResponse.class);
    }

    @Override
    public SuccessResponse deleteStudent(int id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ServiceException(String.format("Студент с id %s не найден", id)));
        repository.delete(student);
        return new SuccessResponse("Студент с id " + id + " успешно удален");
    }

    @Override
    public StudentDtoResponse updateStudent(StudentUpdateDtoRequest request) {
        repository.findById(request.getId())
                .orElseThrow(() -> new ServiceException("Студент не найден"));
        Student studentToUpdate = mapper.map(request, Student.class);
        return mapper.map(repository.save(studentToUpdate), StudentDtoResponse.class);
    }
}
