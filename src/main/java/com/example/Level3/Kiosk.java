package com.example.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //반복문 수행을 위한 변수 설정
    private boolean menu = false;
    private String numberButton;
    private int menuItem;

    //햄버거 메뉴 필드
    MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
    MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
    MenuItem cheeseBurger = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
    MenuItem hamBurger = new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
    //햄버거 메뉴 리스트 생성
    List<MenuItem> menuItems = new ArrayList<>();
    //햄버거 메뉴 생성 메서드
    public void addMenu() {
        menuItems.add(shackBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseBurger);
        menuItems.add(hamBurger);
    }
    //메뉴 입력
    Scanner sc = new Scanner(System.in);

    public void start() {
            while(true) {
                //1: 메뉴판 보기, 0: 프로그램 종료
                System.out.println("1. 메뉴판 | 0. 프로그램 종료");
                System.out.println("원하는 기능을 선택해 주세요 : ");
                //입력값 받음
                numberButton = sc.next();
                switch (numberButton) {
                    case "1":
                        //line:51 뒤로가기 입력 후 line:38 case "1" 입력 시 line:41 반복문을 실행하기 위하여 다시 조건을 true 로 바꿔줌
                        menu = !menu;
                        while (menu) {
                            System.out.println("[ SHAKESHACK MENU ]");
                            System.out.println("1: ShackBurger");
                            System.out.println("2: SmokeShack");
                            System.out.println("3: Cheeseburger");
                            System.out.println("4: Hamburger");
                            System.out.println("0. 뒤로가기");
                            System.out.println("메뉴 상세 보기 : ");
                            //입력값 받음
                            menuItem = sc.nextInt();
                            if (menuItem == 0) {
                                //while 반복문 조건을 false 로 만들어 반복문을 종료
                                menu = !menu;
                            //메뉴에 해당되지 않는 숫자 입력 시 오류 출력
                            } else if(menuItem < 0 || menuItem > menuItems.size()) {
                                System.out.println("메뉴에 있는 번호를 입력해주세요.");
                            //특정 메뉴 숫자 입력 시 해당 메뉴 상세 정보 불러옴
                            } else {
                                System.out.println("선택한 메뉴 : " + menuItems.get(menuItem-1).toString());
                                //상세 정보를 불러온 후 line:39 반복되는 것을 방지하기 위하여 프로그램 종료
                                System.exit(0);
                            }
                        }
                        break;
                    case "0":
                        //프로그램 종료를 위하여 System.exit() 함수 사용
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    default:
                        //kiosk 초기 화면에 없는 버튼 입력 시 주의 문구 출력
                        System.out.println("올바른 숫자 버튼을 입력하시오.");
                }
            }
        }
    }