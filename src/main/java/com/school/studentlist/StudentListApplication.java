package com.school.studentlist;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Список студентов",
                version = "1.0",
                description = "REST АПИ для клиентского приложения, которое отображает страницу со списком студентов"
        )
)
public class StudentListApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentListApplication.class, args);
    }

}