
package com.mycompany.amstechconstructionadvanced;


public class Operations {
    public static double getPrice(double area , int secter)
    {
        if(secter==1)
        {
            return area*Rate.A_Secterrate;
        }else if(secter==2)
        {
            return area*Rate.B_Secterrate;
        }else if(secter==3)
        {
            return area*Rate.C_Secterrate;
        }
        else
          return -1;
    }
    
    public static double getRagistryPrice(double price , int gender)
    {
        if (gender==1)
        {
            return (price*Rate.MaleRegistryPricePercentage)/100;
        }else if (gender==2)
        {
            return (price*Rate.FemaleRegistryPricePercentage)/100;
        }else
            return -1;
        
    }
    
    public static double getGreentax(double price)
    {
        return (price *Rate.GreenTaxPricePercentage)/100;
    }
    public static double getCGST(double price)
    {
        return (price*Rate.CGST_Percentage)/100;
    }
    public static double getSGST(double price)
    {
        return (price*Rate.SGST_Percentage)/100;
    }
    public static double getSocityDevlopmentTax(double price , int secter)
    {
        if(secter==1)
        {
            return price*Rate.SocityDevelopmentTaxSecterA;
        }else if(secter==2)
        {
            return price*Rate.SocityDevelopmentTaxSecterB;
        }else if(secter==3)
        {
            return price*Rate.SocityDevelopmentTaxSecterC;
        }
        else
          return -1;
    }
    public static double getdiscountPrice(double price)
    {
        if (price < 3000000 && price > 1)
        {
            return price-Rate.PradhanMantriAwasUojana;
        }else if (price  < 1)
        {
            return 0;
        }
        else 
            return price;
    }
    public static double getClubCharge(int secter)
    {
        if (secter==3)
            return 0;
        else if (secter == 1 || secter == 2)
        {
            return Rate.ClubCharge;
        }
        else
            return -1;
    }
}
