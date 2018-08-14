package com.careerguidence.dao.type;

public class UserWithRole {

    private Long id;
    private Long id_category;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String login;
    private int the_number_of_the_test;
    private String password;
    private String name_role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getThe_number_of_the_test() {
        return the_number_of_the_test;
    }

    public void setThe_number_of_the_test(int the_number_of_the_test) {
        this.the_number_of_the_test = the_number_of_the_test;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }
}
