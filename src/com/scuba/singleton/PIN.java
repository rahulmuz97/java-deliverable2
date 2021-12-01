package com.scuba.singleton;

public class PIN 
{
	 
    private static  PIN instance= new PIN();
     
    public int attempt=0;
     
    // This private constructor is to prevent this object get instantiated more than once.
    private PIN(){}
     
    public static PIN getInstance()
    {
        return instance;
    }
    public void screenlock()
    {
        this.attempt++;
    }
}
