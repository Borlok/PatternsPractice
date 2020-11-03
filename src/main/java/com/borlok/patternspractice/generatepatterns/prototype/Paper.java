package com.borlok.patternspractice.generatepatterns.prototype;

public class Paper implements Copyable{
    private int id;
    private String paperType;

    public Paper(int num, String paperType) {
        this.id = num;
        this.paperType = paperType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    @Override
    public Object copy() {
        return new Paper(id,paperType);
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", paperType='" + paperType + '\'' +
                '}';
    }
}

