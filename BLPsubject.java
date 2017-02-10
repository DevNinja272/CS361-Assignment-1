/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blp.simple.security;

/**
 *
 * @author jinwook
 */
public class BLPsubject 
{
    private String name;
    private int TEMP;
    
    public BLPsubject()
    {
        TEMP = 0;
    }
    
    public BLPsubject(String name)
    {
        this.name = name.toLowerCase();
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getTemp()
    {
        return TEMP;
    }
    
    public void setTemp(int val)
    {
        TEMP = val;
    }
    
    public boolean equals(BLPsubject subject)
    {
        return name == subject.name;
    }
}
