package com.workintech.burger.main;

import com.workintech.burger.entity.BreadRollType;
import com.workintech.burger.entity.DeluxeBurger;
import com.workintech.burger.entity.Hamburger;
import com.workintech.burger.entity.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
    }


}