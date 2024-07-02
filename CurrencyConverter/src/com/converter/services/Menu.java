package com.converter.services;

import com.converter.Impl.SplitStringImpl;
import com.converter.model.Currency;
import java.io.IOException;
import java.util.HashMap;

public class Menu {

    public HashMap<Integer,String> map=new HashMap<>();

    public void menu(String input) throws IOException {

//        HashMap<Integer,String> map=new HashMap<>();

        SplitStringImpl splitString=new SplitStringImpl();

        String currency=splitString.onlyString(input);

        System.out.println();

        System.out.println("In which Currency You Want to covert?");

        if (currency.equals(Currency.firstCurrency())){
            System.out.println("1. "+Currency.secondCurrency());
            System.out.println("2. "+Currency.thirdCurrency());
            System.out.println("3. "+Currency.fourthCurrency());
            System.out.println("4. "+Currency.fifthCurrency());
            map.put(1,Currency.secondCurrency());
            map.put(2,Currency.thirdCurrency());
            map.put(3,Currency.fourthCurrency());
            map.put(4,Currency.fifthCurrency());

        }
        else if (currency.equals(Currency.secondCurrency())){
            System.out.println("1. "+Currency.firstCurrency());
            System.out.println("2. "+Currency.thirdCurrency());
            System.out.println("3. "+Currency.fourthCurrency());
            System.out.println("4. "+Currency.fifthCurrency());
            map.put(1,Currency.firstCurrency());
            map.put(2,Currency.thirdCurrency());
            map.put(3,Currency.fourthCurrency());
            map.put(4,Currency.fifthCurrency());

        }
        else if (currency.equals(Currency.thirdCurrency())){
            System.out.println("1. "+Currency.secondCurrency());
            System.out.println("2. "+Currency.firstCurrency());
            System.out.println("3. "+Currency.fourthCurrency());
            System.out.println("4. "+Currency.fifthCurrency());
            map.put(1,Currency.secondCurrency());
            map.put(2,Currency.firstCurrency());
            map.put(3,Currency.fourthCurrency());
            map.put(4,Currency.fifthCurrency());

        }
        else if (currency.equals(Currency.fourthCurrency())){
            System.out.println("1. "+Currency.secondCurrency());
            System.out.println("2. "+Currency.thirdCurrency());
            System.out.println("3. "+Currency.firstCurrency());
            System.out.println("4. "+Currency.fifthCurrency());
            map.put(1,Currency.secondCurrency());
            map.put(2,Currency.thirdCurrency());
            map.put(3,Currency.firstCurrency());
            map.put(4,Currency.fifthCurrency());

        }
        else if (currency.equals(Currency.fifthCurrency())){
            System.out.println("1. "+Currency.secondCurrency());
            System.out.println("2. "+Currency.thirdCurrency());
            System.out.println("3. "+Currency.fourthCurrency());
            System.out.println("4. "+Currency.firstCurrency());
            map.put(1,Currency.secondCurrency());
            map.put(2,Currency.thirdCurrency());
            map.put(3,Currency.fourthCurrency());
            map.put(4,Currency.firstCurrency());
        }else {
            System.out.println("Please Enter Valid Currency Format!!");
        }

//        switch (currency)

    }


}
