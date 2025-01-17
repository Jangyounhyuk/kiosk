package com.example.Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //메뉴 생성
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamBurger = new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        //메뉴 리스트화
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(shackBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseBurger);
        menuItems.add(hamBurger);

        //초기 화면
        System.out.println("원하시는 메뉴를 선택하시오. 0 입력 시 프로그램 종료");
        System.out.println("1: ShackBurger");
        System.out.println("2: SmokeShack");
        System.out.println("3: Cheeseburger");
        System.out.println("4: Hamburger");

        Scanner sc = new Scanner(System.in);
        while (true) {
            int menuNumber = sc.nextInt();
            //프로그램 종료 입력값
            if (menuNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            //메뉴에 해당되지 않는 숫자 입력 시 오류 출력
            } else if (menuNumber < 0 || menuNumber > menuItems.size()) {
                throw new IllegalStateException();
            //List 에서 메뉴 정보 출력
            } else {
                System.out.println("선택한 메뉴 : " + menuItems.get(menuNumber-1).toString());
            }
        }
    }
}
