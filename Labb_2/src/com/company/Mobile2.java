package com.company;

public class Mobile2 {
    public Mobile2 mobile;

    public Mobile2(Mobile2 mobile) {
        this.mobile = mobile;
    }


    public int priceMobile(int coupon) {
        if (coupon == 10) {
            System.out.println("У вас є купон на 10%\nВи получаєте знижку 5%");
            return 10;
        } else if (coupon == 15) {
            System.out.println("У вас є купон на 15%\nВи получаєте знижку 10%");
            return 15;
        } else {
            System.out.println("У нас нема таких купонів !");
            return 0;
        }
    }

    public void advertisement() {
        System.out.println("Оголошення персоналу\nПотрібно більше персоналу на касі !");
    }

}

