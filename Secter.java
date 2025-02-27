
package com.mycompany.amstechconstructionadvanced;


public class Secter {
    double length;
    double width ;
    int secter=0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public int getsecter()
    {
        return secter;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Secter(double length, double width) {
        
        this.length = length;
        this.width = width;
        secter =SecterValidation.getValidSecter(length,width);
        
        
        
    }
    public Secter() {
        length = Limitation.LengthA;
        width = Limitation.WidthA;
        secter =SecterValidation.getValidSecter(length,width);
    }
     public Secter(double length) {
        width = Limitation.WidthB;
        secter =SecterValidation.getValidSecter(length,width);
        
        this.length = length;
        
        
    }
     public double getArea()
     {
         return length*width;
     }
}
