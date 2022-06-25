package com.sda.zad17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //String date = scanner.nextLine();

        String date = "2022-06-30";
        LocalDate courseDate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(today, courseDate));

        String date_parser = "20220630";
        LocalDate date_1 = LocalDate.parse(date_parser, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(ChronoUnit.DAYS.between(today, date_1));


        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");


        String inputString1 = "25 06 2022";
        String inputString2 = "30 06 2022";

        long diff = 0;
        Date date1;
        Date date2;
        try {
            date1 = myFormat.parse(inputString1);
            date2 = myFormat.parse(inputString2);
            diff = date2.getTime() - date1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(diff); //timestamp
        System.out.println(diff / (1000*60*60*24.0f));


    }
}
