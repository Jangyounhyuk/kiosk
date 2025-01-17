package com.example.Level4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    String name;
    double price;
    String description;

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
}
