package com.company;

public class TransactionUtil {

    public static void executeTransaction(Double from, Double to, Double ammount) {

        try {
            if (from > ammount) {
                from -= ammount;
                to += ammount;
                System.out.println("Остаток 1 : " + to + "\nОстаток 2 " + from);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}
