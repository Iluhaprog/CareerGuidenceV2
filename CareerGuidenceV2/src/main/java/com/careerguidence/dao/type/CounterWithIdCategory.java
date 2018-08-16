package com.careerguidence.dao.type;

public class CounterWithIdCategory {

    private Long id_category;
    private int counter;

    public CounterWithIdCategory(Long id_category, int counter) {
        this.id_category = id_category;
        this.counter = counter;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
