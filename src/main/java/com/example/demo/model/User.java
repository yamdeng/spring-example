package com.example.demo.model;

import lombok.Data;

@Data
public class User {

    private String id;
    private String name;
    private String created_date;

    private String updated_date;

    private String dept_id;
    private String description_etc;

    private String school;

    private Integer age;

}
