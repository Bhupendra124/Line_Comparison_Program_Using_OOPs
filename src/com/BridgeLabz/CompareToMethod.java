package com.BridgeLabz;

public class CompareToMethod {
    public double line1,line2;
    public CompareToMethod(double line1,double line2){
        this.line2=line1;
        this.line1=line2;

    }
    public void FunctionComparetoMethod(){

        if (line1>line2 )
            System.out.println("Modelled Length of Line-1 is greater than the Length of line-2");
        else
            System.out.println("Modelled Length of Line-2 is greater than the Length of line-1");

    }
}
