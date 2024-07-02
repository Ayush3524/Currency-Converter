package com.converter.Impl;

import com.converter.model.Currency;
import com.converter.rate.*;
import com.converter.providers.CurrencyProvider;
import com.converter.services.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {


    @Override
    public double firstTo(String to, double value) {
        double result=0;
        if (to.equals(Currency.secondCurrency())){
            result=value * OneINR.toUSD();
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * OneINR.toEUR();
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * OneINR.toJPY();
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * OneINR.toGBP();
        }
        return result;
    }

    @Override
    public double secondTo(String to, double value) {
        double result=0;
        if (to.equals(Currency.firstCurrency())){
            result=value * OneUSD.toINR();
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * OneUSD.toEUR();
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * OneUSD.toJPY();
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * OneUSD.toGBP();
        }
        return result;
    }

    @Override
    public double thirdTo(String to, double value) {
        double result=0;

        if (to.equals(Currency.firstCurrency())){
            result=value * OneEUR.toINR();
        }

        if (to.equals(Currency.secondCurrency())){
            result=value * OneEUR.toUSD();
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * OneEUR.toJPY();
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * OneEUR.toGBP();
        }

        return result;
    }

    @Override
    public double fourthTo(String to, double value) {
        double result=0;

        if (to.equals(Currency.firstCurrency())){
            result=value * OneJPY.toINR();
        }

        if (to.equals(Currency.secondCurrency())){
            result=value * OneJPY.toUSD();
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * OneJPY.toEUR();
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * OneJPY.toGBP();
        }

        return result;
    }

    @Override
    public double fifthTo(String to, double value) {
        double result=0;

        if (to.equals(Currency.fifthCurrency())){
            result=value * OneGBP.toINR();
        }

        if (to.equals(Currency.secondCurrency())){
            result=value * OneGBP.toUSD();
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * OneGBP.toEUR();
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * OneGBP.toJPY();
        }

        return result;
    }
}
