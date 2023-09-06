package com.workintech.burger.entity;

public class DeluxeBurger extends  Hamburger{

    private String cips;
    private String drink;

public DeluxeBurger(){
    super("DeluxeBurger",19.1,BreadRollType.DOUBLE);
super.setMeat("Double");
}



    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("Deluxe Burger'a malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("Deluxe Burger'a malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("Deluxe Burger'a malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("Deluxe Burger'a malzeme eklenemez.");
    }
}
