package com.BridgeLabz;

public class Program {
    public double lengthOne,lengthTwo;

    public static void main(String[] args) {
        Distance lineOne=new Distance(1,1,2,2);
        double lengthOne=lineOne.getDistance();
        System.out.println("lengthOne"+lengthOne);

        Distance lineTwo=new Distance(1,1,2,3);
        double lengthTwo=lineTwo.getDistance();
        System.out.println("lengthTwo"+ lengthTwo);
        //Equal Method
        EquallMethod equalCheck=new EquallMethod(lengthOne,lengthTwo);
        equalCheck.FunctionEqualsMethod();

        CompareToMethod compareCheck= new CompareToMethod(lengthOne,lengthTwo);
        compareCheck.FunctionComparetoMethod();

        }
    }

