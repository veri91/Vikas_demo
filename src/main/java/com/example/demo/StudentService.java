package com.example.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<DemoApplication.Student> getStudents() {
        return List.of(
                new DemoApplication.Student(
                        1L,
                        "Vikas",
                        "vikas.gmail.com",
                        LocalDate.of(1998, Month.JUNE, 3),
                        23


                )
        );
    }
}

