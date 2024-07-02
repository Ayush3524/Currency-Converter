package com.converter;

import com.converter.Impl.CurrencyConvertorServiceImpl;
import com.converter.Impl.SplitStringImpl;
import com.converter.helper.PatternMatcher;
import com.converter.identifier.CurrencyIdentifier;
import com.converter.model.Currency;
import com.converter.providers.BufferedReaderProvider;
import com.converter.providers.ExitProvider;
import com.converter.services.Menu;

import java.io.BufferedReader;
import java.io.IOException;


public class CurrencyConverter {
    public static void main(String[] args) throws IOException, InterruptedException {

         BufferedReader br=BufferedReaderProvider.getReader();
        CurrencyConvertorServiceImpl converter=new CurrencyConvertorServiceImpl();
         Menu menu=new Menu();
        SplitStringImpl splitString=new SplitStringImpl();

        while (true){
            try {
                System.out.println();
                System.out.println("/**************************| CURRENCY CONVERTER |****************************/");
                System.out.println();
                System.out.println("Currency Available to convert: CurrencyFormat = "+ Currency.firstCurrency()+","+Currency.secondCurrency()+","+Currency.thirdCurrency()+","+Currency.fourthCurrency()+","+Currency.fifthCurrency());
                System.out.println("please enter in format like: yourAmount CurrencyFormat");
                System.out.println("Enter a Currency: ");
                String input = br.readLine();

                if (PatternMatcher.matchPattern(input)){
                    String from = splitString.onlyString(input);
                    double value = splitString.onlyDouble(input);
//                    System.out.println(value);
                    menu.menu(input);
                    System.out.println("5.Exit");
                    System.out.print("Choose an Option: ");
                    int ch=Integer.parseInt(br.readLine());
                    if (ch==5){
                        ExitProvider.exit();
                    }
                    String to = menu.map.get(ch);
                    double result = converter.convert(from,to, value);
                    System.out.println();
                    System.out.println(input+" = "+String.format("%4f",result)+" "+ CurrencyIdentifier.identifyCurrency(to));
//                    menu.map.clear();
                }else {
                    System.out.println();
                    System.out.println("Please enter currency in instructed format!!");
                }
            }catch (NumberFormatException | NullPointerException e){
                System.out.println();
                System.out.println("Invalid Choice!! Try again");
            }
        }
    }
}
