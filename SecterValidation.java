
package com.mycompany.amstechconstructionadvanced;


public class SecterValidation {
    public static int getValidSecter(double length, double width)
    {
        if(length<=Limitation.maxLengthB && length >=Limitation.minimumLengthB && width ==Limitation.WidthB)
        {
            return 2;
        }else if (length<=Limitation.maxLengthC && length >=Limitation.minimumLengthC && width<=Limitation.maxWidthC && width >=Limitation.minimumWidthC)
        {
            return 3;
        }else if (length ==Limitation.LengthA && width ==Limitation.WidthA)
        {
            return 1;
        }else 
        {
            return 0;
        }
        
        
    }
}
