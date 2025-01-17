package com.example.Level5;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        Menu menu = new Menu();
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        menu.addHamburger();
        menu.addDrink();
        menu.addDessert();
        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menu);
        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}
