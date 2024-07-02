package com.converter.identifier;

import com.converter.providers.CurrencyProvider;

public class CurrencyIdentifier {

    public static String identifyCurrency(String to){

        String identifiedCurrency=null;

        if (to.equals(CurrencyProvider.INR.toString()))
            identifiedCurrency = CurrencyProvider.INR.toString();

        if (to.equals(CurrencyProvider.USD.toString()))
            identifiedCurrency = CurrencyProvider.USD.toString();

        if (to.equals(CurrencyProvider.JPY.toString()))
            identifiedCurrency = CurrencyProvider.JPY.toString();

        if (to.equals(CurrencyProvider.EUR.toString()))
            identifiedCurrency = CurrencyProvider.EUR.toString();

        if (to.equals(CurrencyProvider.GBP.toString()))
            identifiedCurrency = CurrencyProvider.GBP.toString();

        return identifiedCurrency;
    }
}
