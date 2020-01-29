package com.ebi.salehi.testjavadate.testjavapersiandate;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.github.mfathi91.time.PersianDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//
//        LocalDate localDate = LocalDate.of(2020, 1, 12);
//        PersianDate date= PersianDate.fromGregorian(localDate);
//        System.out.println(date.getDayOfMonth()+","+date.getYear()+","+date.getMonthValue());
        
       JSONArray array = new JSONArray().put(new JSONObject().put("prop1", "123")).put(new JSONObject().put("prop2", "ebrahim"));
       JSONObject jsonObject = new JSONObject().put("totalCount", 5).put("items", array);
       
       JSONObject obj = (JSONObject) jsonObject.get("items");
       //obj.remove()
       //jsonObject.remove("items");
       System.out.println(jsonObject.toString());
    }
}
