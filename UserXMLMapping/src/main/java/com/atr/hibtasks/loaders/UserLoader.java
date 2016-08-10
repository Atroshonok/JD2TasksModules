/**
 * 
 */
package com.atr.hibtasks.loaders;

import java.text.SimpleDateFormat;
import java.util.Locale;

import org.apache.log4j.Logger;

import static com.atr.hibtasks.loaders.MenuLoader.menu;

/**
 * @author Atroshonok Ivan
 *
 */
public class UserLoader {
    private static Logger log = Logger.getLogger(UserLoader.class);

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        System.out.println("Start Menu");
        SimpleDateFormat sdfout = new SimpleDateFormat("yyyy.MM.dd");
        String date = "2012.12.20";
        java.sql.Date sqlDate = new java.sql.Date(sdfout.parse(date).getTime());
        
        menu();
        
    }

}
