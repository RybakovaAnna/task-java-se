package com.gmail.rybachko.anna.model;

import java.util.Objects;

public class Developer extends Employee {
    private String programmingLanguage;
    private Double developmentExperience;

    public Developer(String firstName, String lastName, int grade, String programmingLanguage, Double developmentExperience) {
        super(firstName, lastName, grade);
        this.programmingLanguage = programmingLanguage;
        this.developmentExperience = developmentExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Double getDevelopmentExperience() {
        return developmentExperience;
    }

    public void setDevelopmentExperience(Double developmentExperience) {
        this.developmentExperience = developmentExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(programmingLanguage, developer.programmingLanguage) && Objects.equals(developmentExperience, developer.developmentExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programmingLanguage, developmentExperience);
    }
}