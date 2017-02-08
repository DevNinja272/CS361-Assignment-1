/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blp.simple.security;
import java.lang.Comparable;

enum Level
{
    HIGH, 
    LOW
}

/**
 *
 * @author jinwook
 */
public class SecurityLevel implements Comparable<SecurityLevel>
{
    Level level;
    
    public int compareTo(SecurityLevel sl)
    {
        switch (sl.level)
        {
            case HIGH:
                return this.level == Level.HIGH ? 0 : -1;
            case LOW:
                return this.level == Level.HIGH ? 1 : 0;
            default:
                return this.level.compareTo(sl.level);
        }
    }
    
    public boolean dominates(SecurityLevel sl)
    {
        return this.compareTo(sl) >= 0;
    }
}
