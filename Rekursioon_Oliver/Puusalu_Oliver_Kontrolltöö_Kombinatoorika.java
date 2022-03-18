package main.Rekursioon_Oliver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public interface Puusalu_Oliver_Kontrolltöö_Kombinatoorika {

    public static void main(String[] args) {

        ArrayList<Integer> stocks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int number = (int) (Math.random() * 1000);
            stocks.add(number);
        }

        ArrayList<Integer> current_stocks = new ArrayList<>();

        System.out.println("Aktsiad: " + stocks);

        Set<ArrayList<Integer>> allSets = new HashSet<>();

        int money = (int) (Math.random() * 10000);

        System.out.println("Raha on " + money + " eurot.");

        sets(stocks, money, current_stocks, allSets);

        System.out.println("Kokku on " + allSets.size() + " võimalust.");

        for (ArrayList<Integer> set : allSets
             ) {
            System.out.println(set);
        }
    }

    public static void sets(ArrayList<Integer> stocks, int money, ArrayList<Integer> current_stocks, Set<ArrayList<Integer>> allSets){

        if (money > 0 && !current_stocks.isEmpty()){
            allSets.add(current_stocks);
        }
        if (stocks.size() == 0){
            if (current_stocks.size() == 0){
                return;
            }
        }
        else{
            int FirstItem = stocks.get(0);
            stocks.remove(0);
            int tempMoney = money;
            ArrayList<Integer> newStocks = new ArrayList<>(stocks);
            ArrayList<Integer> temp_current_stocks = new ArrayList<>(current_stocks);
            temp_current_stocks.add(FirstItem);
            tempMoney -= FirstItem;

            sets(stocks, money, current_stocks, allSets);
            sets(newStocks, tempMoney, temp_current_stocks, allSets);

        }


    }

}
