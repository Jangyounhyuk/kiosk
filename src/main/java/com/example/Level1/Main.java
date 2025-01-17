package com.example.Level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //초기 화면(메뉴판)
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료       | 종료");
        System.out.println("원하시는 숫자 버튼을 입력하시오.");

        Scanner sc = new Scanner(System.in);
        while (true) {
            int menuButton = sc.nextInt();
            //프로그램 종료 입력값
            if (menuButton == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                //각 메뉴에 해당되는 번호 입력 시 해당 메뉴 출력
                switch (menuButton) {
                    case 1:
                        System.out.println("1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                        break;
                    case 2:
                        System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                        break;
                    case 3:
                        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                        break;
                    case 4:
                        System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                        break;
                    default:
                        //메뉴에 해당되지 않는 숫자 입력 시 오류 출력
                        throw new IllegalStateException("올바른 숫자 버튼을 입력하시오.");
                }
            }
        }
    }
}
