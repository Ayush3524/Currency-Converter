package com.converter.services;

import com.converter.providers.CurrencyProvider;

public interface CurrencyService {

    double firstTo(String to,double value);

    double secondTo(String to,double value);

    double thirdTo(String to,double value);

    double fourthTo(String to,double value);

    double fifthTo(String to,double value);
}
