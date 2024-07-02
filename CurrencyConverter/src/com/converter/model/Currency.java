package com.converter.model;

import com.converter.providers.CurrencyProvider;

public class Currency {

    public static String firstCurrency(){
        return CurrencyProvider.INR.toString();
    }

    public static String secondCurrency(){
        return CurrencyProvider.USD.toString();
    }

    public static String thirdCurrency(){
        return CurrencyProvider.EUR.toString();
    }

    public static String fourthCurrency(){
        return CurrencyProvider.JPY.toString();
    }

    public static String fifthCurrency(){
        return CurrencyProvider.GBP.toString();
    }

}
