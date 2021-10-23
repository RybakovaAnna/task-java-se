package com.gmail.rybachko.anna.main;

import com.gmail.rybachko.anna.model.Developer;
import com.gmail.rybachko.anna.model.Employee;
import com.gmail.rybachko.anna.model.TeamLeader;
import com.gmail.rybachko.anna.model.Trainee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> setEmployees = new HashSet<>();
        setEmployees.add(new Developer(
                "Василий",
                "Иванов",
                6,
                "Java",
                4.5));
        setEmployees.add(new Trainee(
                "Кирилл",
                "Абросимов",
                0,
                LocalDate.of(2021, 10, 14),
                LocalDate.of(2021, 12, 5)));
        setEmployees.add(new TeamLeader(
                "Руслан",
                "Титов",
                10,
                5,
                2));
        List<Employee> listEmployees = new ArrayList<>(setEmployees);
    }
}
