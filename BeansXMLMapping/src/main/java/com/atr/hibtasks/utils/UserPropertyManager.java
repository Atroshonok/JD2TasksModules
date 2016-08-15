/**
 * 
 */
package com.atr.hibtasks.utils;

import java.util.ResourceBundle;

/**
 * @author Atroshonok Ivan
 *
 */
public class UserPropertyManager {
    private static ResourceBundle bundle = ResourceBundle.getBundle("User");
    
    public static String getProperty(String propertyName) {
	return bundle.getString(propertyName);
    }

}
