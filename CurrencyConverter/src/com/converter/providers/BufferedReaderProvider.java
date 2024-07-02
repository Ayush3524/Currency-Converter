package com.converter.providers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderProvider {

    private static BufferedReader reader;

    public static BufferedReader getReader(){

        if (reader==null){
            BufferedReader BufferedReader=new BufferedReader(new InputStreamReader(System.in));
            reader = BufferedReader;
        }
        return reader;
    }
}
