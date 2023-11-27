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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ahsanHabib = new Student(
                    "Ahsan Habib",
                    "ahsan.habib@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student adibHasan = new Student(
                    "Adib Hasan",
                    "adib.hasan@gmail.com",
                    LocalDate.of(1998, Month.MARCH, 18)
            );

            repository.saveAll(
                    List.of(ahsanHabib, adibHasan)
            );
        };
    }
}
