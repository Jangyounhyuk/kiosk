package com.example.Level5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //카테고리 이름 필드
    private final String burgers = "Burgers";
    private final String drinks = "Drinks";
    private final String desserts = "Desserts";

    //햄버거 메뉴 필드
    MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
    MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
    MenuItem cheeseBurger = new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
    MenuItem hamBurger = new MenuItem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

    //음료 메뉴 필드
    MenuItem coke = new MenuItem("Coke", 2.0, "코카 콜라");
    MenuItem americano = new MenuItem("Americano", 4.0, "따뜻한 아메리카노");
    MenuItem icedAmericano = new MenuItem("Iced Americano", 4.5, "차가운 아메리카노");
    MenuItem cafeLatte = new MenuItem("Cafe Latte", 4.5, "따뜻한 카페라떼");
    MenuItem icedCafeLatte = new MenuItem("Iced Cafe Latte", 4.5, "차가운 카페라떼");
    MenuItem icedTea = new MenuItem("Iced Tea", 4.0, "복숭아맛 아이스티");

    //디저트 메뉴 필드
    MenuItem friedPotato = new MenuItem("Fried Potato", 1.5, "감자튀김");
    MenuItem chickenNugget = new MenuItem("Chicken Nugget", 2.0, "치킨너겟");

    // MenuItem 클래스를 List 로 관리
    private final List<MenuItem> burgerMenuItems = new ArrayList<>();
    private final List<MenuItem> drinkMenuItems = new ArrayList<>();
    private final List<MenuItem> dessertMenuItems = new ArrayList<>();

    //햄버거 메뉴 생성 메서드
    public void addHamburger() {
        burgerMenuItems.add(shackBurger);
        burgerMenuItems.add(smokeShack);
        burgerMenuItems.add(cheeseBurger);
        burgerMenuItems.add(hamBurger);
    }

    //음료 메뉴 생성 메서드
    public void addDrink() {
        drinkMenuItems.add(coke);
        drinkMenuItems.add(americano);
        drinkMenuItems.add(icedAmericano);
        drinkMenuItems.add(cafeLatte);
        drinkMenuItems.add(icedCafeLatte);
        drinkMenuItems.add(icedTea);
    }

    //디저트 메뉴 생성 메서드
    public void addDessert() {
        dessertMenuItems.add(friedPotato);
        dessertMenuItems.add(chickenNugget);
    }

    // List 에 들어있는 MenuItem 을 순차적으로 보여주는 함수(버거)
    public void showBurgers() {
        for (int i = 0; i < burgerMenuItems.size(); i++) {
            System.out.println((i + 1) + ". " + burgerMenuItems.get(i).toString());
        }
    }

    // List 에 들어있는 MenuItem 을 순차적으로 보여주는 함수(음료)
    public void showDrinks() {
        for (int i = 0; i < drinkMenuItems.size(); i++) {
            System.out.println((i + 1) + ". " + drinkMenuItems.get(i).toString());
        }
    }

    // List 에 들어있는 MenuItem 을 순차적으로 보여주는 함수(디저트)
    public void showDesserts() {
        for (int i = 0; i < dessertMenuItems.size(); i++) {
            System.out.println((i + 1) + ". " + dessertMenuItems.get(i).toString());
        }
    }

    // List 를 리턴하는 함수(버거)
    public String showBurgerMenuItems(int index) {
        return burgerMenuItems.get(index - 1).toString();
    }

    // List 를 리턴하는 함수(음료)
    public String showDrinkMenuItems(int index) {
        return drinkMenuItems.get(index - 1).toString();
    }

    // List 를 리턴하는 함수(디저트)
    public String showDessertMenuItems(int index) {
        return dessertMenuItems.get(index - 1).toString();
    }

    //카테고리 이름 반환 메서드
    public String getBurgers() {
        return burgers;
    }

    public String getDrinks() {
        return drinks;
    }

    public String getDesserts() {
        return desserts;
    }

    public List<MenuItem> getBurgerMenuItems() {
        return burgerMenuItems;
    }

    public List<MenuItem> getDrinkMenuItems() {
        return drinkMenuItems;
    }

    public List<MenuItem> getDessertMenuItems() {
        return dessertMenuItems;
    }
}
