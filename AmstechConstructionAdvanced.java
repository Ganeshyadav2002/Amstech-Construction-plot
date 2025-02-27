

package com.mycompany.amstechconstructionadvanced;


public class AmstechConstructionAdvanced {

     public static void main(String[] args) {
        
        boolean check  ;
        Secter plotA = new Secter(50,20);
        Gender.setGender(2);
        
        
        check =Validation.getValidLength(plotA.getLength(),plotA.getWidth());
        if (check)
        {
                  // type male for 1 , Female for 2 
             Estimation.printPlotDetails(plotA, Gender.getGender());
        }else 
        {
            System.out.println("input is invalid");
        }
        
    }
}
