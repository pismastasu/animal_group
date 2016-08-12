package com.company;

/**
 * Created by Admin on 07.08.2016.
 */
public class Flying implements Moving
{
    public void Move(int distance)
    {
        System.out.println("Fly:"+distance);
    }
}
