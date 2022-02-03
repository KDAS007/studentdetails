package com.koustav.das.StudentDetails;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Employee implements Serializable
{


    @Exclude
    private String key;
    private String name;
    private String roll;
    public Employee(){}
    public Employee(String name, String roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRoll()
    {
        return roll;
    }

    public void setRoll(String roll)
    {
        this.roll = roll;
    }
    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }
}
