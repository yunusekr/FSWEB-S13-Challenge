package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        String[] dev = {"Yunus", "Batu", "Furkan"};
        Company company = new Company(3545, "Batu", 3.14, dev);
        System.out.println(company.toString());

        Healthplan healthplan = new Healthplan(2563,"Yunus", Plan.BASIC);
        System.out.println(healthplan.toString());

        String[] health = {"Yaşa", "Sürün",null,"Öl"};
        Employee employee = new Employee(8456, "Yunus Eker", "ekeryunus54@gmail.com", "ekmezeker65",health);
        employee.addHealthPlan(2,"yunus");
        System.out.println(employee.toString());
    }
    }
