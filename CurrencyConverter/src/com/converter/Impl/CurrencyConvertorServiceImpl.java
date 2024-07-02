package com.converter.Impl;

import com.converter.model.Currency;
import com.converter.providers.CurrencyProvider;
import com.converter.services.CurrencyConverterService;

public class CurrencyConvertorServiceImpl implements CurrencyConverterService {

    CurrencyServiceImpl currencyService=new CurrencyServiceImpl();

    @Override
    public double convert(String from, String to, double value) {
        double res=0;
        if (from.equals(Currency.firstCurrency())){
//            System.out.println(value);
            res =  currencyService.firstTo(to,value);
        }

        if (from.equals(Currency.secondCurrency())){
            res =  currencyService.secondTo(to,value);
        }

        if (from.equals(Currency.thirdCurrency())){
            res = currencyService.thirdTo(to,value);
        }

         if (from.equals(Currency.fourthCurrency())){
            res = currencyService.fourthTo(to,value);
        }

        if (from.equals(Currency.fifthCurrency())){
            res = currencyService.fifthTo(to,value);
        }
        return res;
    }
}
