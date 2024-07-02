package com.converter.Impl;

import com.converter.model.Currency;
import com.converter.rate.*;
import com.converter.services.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {


    @Override
    public double firstTo(String to, double value) {
        double result=0;
        if (to.equals(Currency.secondCurrency())){
            result=value * CurrencyRate.firstToSecondRate;
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * CurrencyRate.firstToThirdRate;
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * CurrencyRate.firstToFourthRate;
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * CurrencyRate.firstToFifthRate;
        }
        return result;
    }

    @Override
    public double secondTo(String to, double value) {
        double result=0;
        if (to.equals(Currency.firstCurrency())){
            result=value * CurrencyRate.secondToFirstRate;
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * CurrencyRate.secondToThirdRate;
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * CurrencyRate.secondToFourthRate;
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * CurrencyRate.secondToFifthRate;
        }
        return result;
    }

    @Override
    public double thirdTo(String to, double value) {
        double result=0;

        if (to.equals(Currency.firstCurrency())){
            result=value * CurrencyRate.thirdToFirstRate;
        }

        if (to.equals(Currency.secondCurrency())){
            result=value * CurrencyRate.thirdToSecondRate;
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * CurrencyRate.thirdToFourthRate;
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * CurrencyRate.thirdToFifthRate;
        }

        return result;
    }

    @Override
    public double fourthTo(String to, double value) {
        double result=0;

        if (to.equals(Currency.firstCurrency())){
            result=value * CurrencyRate.fourthToFirstRate;
        }

        if (to.equals(Currency.secondCurrency())){
            result=value * CurrencyRate.fourthToSecondRate;
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * CurrencyRate.fourthToThirdRate;
        }

        if (to.equals(Currency.fifthCurrency())){
            result=value * CurrencyRate.fourthToFifthRate;
        }

        return result;
    }

    @Override
    public double fifthTo(String to, double value) {
        double result=0;

        if (to.equals(Currency.fifthCurrency())){
            result=value * CurrencyRate.fifthToFirstRate;
        }

        if (to.equals(Currency.secondCurrency())){
            result=value * CurrencyRate.fifthToSecondRate;
        }

        if (to.equals(Currency.thirdCurrency())){
            result=value * CurrencyRate.fifthToThirdRate;
        }

        if (to.equals(Currency.fourthCurrency())){
            result=value * CurrencyRate.fifthToFourthRate;
        }

        return result;
    }
}
