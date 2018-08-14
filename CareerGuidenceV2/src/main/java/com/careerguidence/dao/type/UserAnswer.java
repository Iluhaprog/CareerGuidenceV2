package com.careerguidence.dao.type;

public class UserAnswer {

    private Long id_answer;
    private Long id_question;
    private String name_answer;
    private boolean flag;
    private int points;
    private Long id_user;
    private Long id_category;
    private String name_user;
    private String surname;
    private int age;
    private String email;
    private String login;
    private int the_number_of_the_test;
    private String password;

    public Long getId_answer() {
        return id_answer;
    }

    public void setId_answer(Long id_answer) {
        this.id_answer = id_answer;
    }

    public Long getId_question() {
        return id_question;
    }

    public void setId_question(Long id_question) {
        this.id_question = id_question;
    }

    public String getName_answer() {
        return name_answer;
    }

    public void setName_answer(String name_answer) {
        this.name_answer = name_answer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
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
}
