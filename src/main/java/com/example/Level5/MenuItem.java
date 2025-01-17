package com.example.Level5;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;
    private double price;
    private String description;

    //매개변수로 이름, 가격, 설명을 받는 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //List 내 메뉴 정보 출력을 위한 toString() Override
    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
