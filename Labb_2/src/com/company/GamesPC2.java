package com.company;

public class GamesPC2 {

    public GamesPC2 gamesPC;

    public GamesPC2( GamesPC2 gamesPC) {
        this.gamesPC = gamesPC;
    }

    public void advertisement() {
        System.out.println("Оголошення персоналу\n Проводиться конкурс на знання компютера,переможець отримає подарок) !");
    }


    public int lottery(int count) {
        System.out.println("Скільки  планок оперативної памяті можна поставити в компютер !");

        if (count == 1){
            return count;
        }
        if (count == 4)
         {
            System.out.println("Вітаю!Ви отримали 20% на Ігри в категорії 'Спорт'  !");
            return 0;

        }
        System.out.println(count);
        return count * lottery(count - 1);
    }
}
