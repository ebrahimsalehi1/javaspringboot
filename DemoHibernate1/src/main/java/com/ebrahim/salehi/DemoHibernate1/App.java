package com.ebrahim.salehi.DemoHibernate1;

import com.ebrahim.salehi.JpaDemo1.Allien;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Allien ebi = new Allien();
        ebi.setAid(100);
        ebi.setSname("ebrahim");
        ebi.setColor("Green");
        
        //save(ebi);
       //Configuration         
    }
}
