
package com.mycompany.amstechconstructionadvanced;


public class Estimation {
    public static void printPlotDetails(Secter objectName, int gender) {
        System.out.println("Length " + objectName.getLength());
        System.out.println("Width " + objectName.getWidth());
       double area = objectName.getArea();
       int secter = objectName.getsecter();
        double totalCost = Operations.getPrice(area, secter);
        double registryCost=Operations.getRagistryPrice(totalCost,gender);
        double greenTax = Operations.getGreentax(area);
        double socitydevlopmentTax = Operations.getSocityDevlopmentTax(area ,secter );
        double SGST =Operations.getSGST(totalCost);
        double CGST =Operations.getCGST(totalCost);
        double discountPrice = Operations.getdiscountPrice(totalCost);
        double clubCharge = Operations.getClubCharge(secter);
        
       
        if (secter==1)
           System.out.println("Secter A "); 
        else if (secter == 2)
            System.out.println("Secter B ");
        else if (secter==3)
           System.out.println("Secter C "); 
        
 
        
        System.out.println("=========== PLOt DETIAL =========" );
        System.out.println("Area " + area);
        System.out.println("Total Cost " + totalCost);
        System.out.println(" Registry Cost :  " +registryCost);
        System.out.println("Green tax : " +greenTax);
        System.out.println(" Socity Devlopment Tax :" +socitydevlopmentTax);
        if(secter== 1 ||secter==2)
        {
           System.out.println(" club Charge minimum for 3 year"); 
        }
        System.out.println(" club Charge :" +clubCharge);
        System.out.println(" CGST Tax :" +CGST);
        System.out.println(" SGST Tax :" +SGST);
        System.out.println(" Discount Price :" +discountPrice);
        System.out.println("Grend  Total"+(totalCost+registryCost+greenTax+socitydevlopmentTax+CGST+SGST));
        System.out.println("Grend Discount Total"+(discountPrice+registryCost+greenTax+socitydevlopmentTax+CGST+SGST+clubCharge));
        
        
        
    }
}
