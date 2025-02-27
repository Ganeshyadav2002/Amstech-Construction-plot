
package com.mycompany.amstechconstructionadvanced;


public class Validation {
   public static boolean getValidLength(double length, double width)
    {
        if(length<=Limitation.maxLengthB && length >=Limitation.minimumLengthB && width ==Limitation.WidthB)
        {
            return true;
        }else if (length<=Limitation.maxLengthC && length >=Limitation.minimumLengthC && width<=Limitation.maxWidthC && width >=Limitation.minimumWidthC)
        {
            return true;
        }else if (length ==Limitation.LengthA && width ==Limitation.WidthA)
        {
            return true;
        }else 
        {
            return false;
        }
        
        
    } 
}
