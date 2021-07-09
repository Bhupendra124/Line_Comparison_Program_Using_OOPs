package com.BridgeLabz;

public class Distance {
    public double distance;
    public int x2,y2,x1,y1;
    public Distance(int a1,int b1,int c2,int d2){
        this.x1=a1;
        this.x2=c2;
        this.y1=b1;
        this.y2=d2;
    }
    public double getDistance(){
        distance = Math.sqrt(Math.pow(x2-x1,2) +Math.pow(y2-y1,2));
        return distance;
    }


}
