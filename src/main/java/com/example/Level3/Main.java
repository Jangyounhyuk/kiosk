package com.example.Level3;

public class Main {
    public static void main(String[] args) {
        //Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();
        //메뉴 값을 List에 저장
        kiosk.addMenu();
        //kiosk 기능 실행
        kiosk.start();
    }
}
