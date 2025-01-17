package com.example.Level5;

import java.util.Scanner;

public class Kiosk {
    //Menu 클래스로부터 객체 생성.
    private final Menu menu;
    //Main 클래스의 menu 객체로부터 값을 받아와야하기 때문에 Kiosk 생성자에 Main 클래스에서 만든 menu 객체를
    //매개변수로 넣어줘야 한다 !!
    public Kiosk(Menu menu) {
        this.menu = menu;
    }
    //반복문 수행을 위한 변수 설정
    private boolean burgerMenu = false;
    private boolean drinkMenu = false;
    private boolean dessertMenu = false;

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //메인 메뉴판
            System.out.println("[ MAIN MENU ]");
            System.out.println("1. " + menu.getBurgers());
            System.out.println("2. " + menu.getDrinks());
            System.out.println("3. " + menu.getDesserts());
            System.out.println("0. 종료");
            String mainSelect = sc.next();
            switch (mainSelect) {
                case "1":
                    burgerMenu = !burgerMenu;
                    while (burgerMenu) {
                        //버거 메뉴판
                        menu.showBurgers();
                        System.out.println("0. 뒤로가기");
                        int burgerSelect = sc.nextInt();
                        //0 입력 시 뒤로가기
                        if (burgerSelect == 0) {
                            burgerMenu = !burgerMenu;
                        //이외 숫자 입력 시 주의문구
                        } else if (burgerSelect < 0 || burgerSelect > menu.getBurgerMenuItems().size()) {
                            System.out.println("메뉴에 있는 번호를 입력해주세요.");
                        //선택 메뉴 출력
                        } else {
                            System.out.println("선택한 메뉴: " + menu.showBurgerMenuItems(burgerSelect));
                            System.exit(0);
                        }
                    }
                    break;
                //case 1과 동일 코드
                case "2":
                    drinkMenu = !drinkMenu;
                    while (drinkMenu) {
                        menu.showDrinks();
                        System.out.println("0. 뒤로가기");
                        int drinkSelect = sc.nextInt();
                        if (drinkSelect == 0) {
                            drinkMenu = !drinkMenu;
                        } else if (drinkSelect < 0 || drinkSelect > menu.getDrinkMenuItems().size()) {
                            System.out.println("메뉴에 있는 번호를 입력해주세요.");
                        } else {
                            System.out.println("선택한 메뉴: " + menu.showDrinkMenuItems(drinkSelect));
                            System.exit(0);
                        }
                    }
                    break;
                //case 1과 동일 코드
                case "3":
                    dessertMenu = !dessertMenu;
                    while (dessertMenu) {
                        menu.showDesserts();
                        System.out.println("0. 뒤로가기");
                        int dessertSelect = sc.nextInt();
                        if (dessertSelect == 0) {
                            dessertMenu = !dessertMenu;
                        } else if (dessertSelect < 0 || dessertSelect > menu.getDessertMenuItems().size()) {
                            System.out.println("메뉴에 있는 번호를 입력해주세요.");
                        } else {
                            System.out.println("선택한 메뉴: " + menu.showDessertMenuItems(dessertSelect));
                            System.exit(0);
                        }
                    }
                    break;
                //0 입력 시 프로그램 종료
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                //보기에 없는 버튼 입력 시 주의문구
                default:
                    System.out.println("올바른 숫자 버튼을 입력하시오.");
            }
        }
    }
}
