package com.finatel.tabserve.exception;

import java.util.HashMap;
import java.util.Map;


/**
 * The Class ParameterFormat.
 */
public class ParameterFormat {
    
    /** The map. */
    private static Map<String, String[]> map;
    static {
        map = new HashMap<String, String[]>();
        
        
        map.put("cityName", new String[] { "[a-zA-Z0-9][a-zA-Z0-9 ]{3,75}", "City must be between 3 to 75 With Alphanumeric and Space" });
        map.put("Location", new String[] { "[a-zA-Z0-9][a-zA-Z0-9 ]{3,75}", "Location must be between 3 to 75 With Alphanumeric and Space" });
            
        
        map.put("name", new String[] { "[a-zA-Z][a-zA-Z0-9'\\. ]{2,50}",
                "Name must be between 3 and 50 characters, start with an alphabet, and may contain only alphabet, space, and '." });
//        map.put("middleName", new String[] { "[a-zA-Z][a-zA-Z'. ]{1,75}",
//                "Middle name must be between 2 and 40 characters, start with an alphabet, and may contain only alphabet, space, and '." });
//        map.put("lastName", new String[] { "[a-zA-Z][a-zA-Z'. ]{0,75}",
//                "Last name must be between 2 and 40 characters, start with an alphabet, and may contain only alphabet, space, and '." });
//      
        map.put("contactpersonname", new String[] { "[a-zA-Z\\.\\s\\']{2,50}",
        "Name must be between 3 and 50 characters, start with an alphabet, and may contain only alphabet, space, and '." });
        
        map.put("date",  new String[] {"^[1-2]{1}[0-9]{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$", " " });
       

        map.put("username", new String[] { "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", "invalid email format" });
        map.put("password", new String[] { "[a-zA-Z0-9#@$_-]+", "invalid password format" });
        
        

        map.put("postal", new String[] { "[0-9]{5}", "Zip code must be exactly 5 digits long." });
        map.put("country", new String[] { "[0-9]{3}", "The issuing country length can not be more than 3 digits." });
        
        
        map.put("city", new String[] { "[a-zA-Z0-9][a-zA-Z0-9 _-]{1,39}",
                "city must be between 2 and 40 characters, and may contain only alphanumerics, -, _, and spaces" });
        
        map.put("phoneNumber", new String[] { "[+-]*[0-9]{5,16}", "phone numbers must contain upto 15 digits." });
        map.put("mobilePhone", new String[] { "[7-9][0-9]{9}", "mobile numbers must be exactly 10 digits and must start with 7 or 8 or 9." });
        
        
        
        
        map.put("email", new String[] { "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$",
                "email address is in incorrect format." });
        
        
       
        
        map.put("name", new String[] {"^[A-Za-z0-9_\\s]*$",
        "name must contain only alphabet numeric" });
        
       
        map.put("pincode", new String[] { "[0-9]{6}$", "Please provide a PIN code of length 6 " });
      
    }
    
    /**
     * Gets the pattern and error message.
     * @param key the key
     * @return the pattern and error message
     */
    public static String[] getPatternAndErrorMessage(String key) {
    	    	
        return (String[]) map.get(key);
        
    }
}