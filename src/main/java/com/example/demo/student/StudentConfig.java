package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student s1 = new Student(
                    "Harsh",
                    LocalDate.of(1998,Month.JANUARY,17),
                    "harsh@gmail.com"
            );
            Student s2 = new Student(
                    "Kartik",
                    LocalDate.of(1998,Month.APRIL,17),
                    "kartik@gmail.com"
            );

            repository.saveAll(List.of(s1,s2));
        };
    }
}
