/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author jinwook
 */
public class ObjectManager {
    private ArrayList<BLPobject> objects;
    
    private boolean exists(String name)
    {
        for(BLPobject obj: objects)
            if(obj.name == name.toLowerCase())
                return true;
        return false;
    }
    
    private BLPobject get(String name)
    {
        for(BLPobject obj: objects)
            if(obj.name == name.toLowerCase())
                return obj;
        return null;
    }
    
    public int read(String name)
    {
        if(exists(name))
            return get(name).value;
        return 0;
    }
    
    public boolean write(String name, int value)
    {
        if(exists(name))
        {
            get(name).setValue(value);
            return true;
        }
        return false;
    }
    
    public boolean createObject(String name)
    {
        if(exists(name))
            return false;
        objects.add(new BLPobject(name.toLowerCase()));
        return true;
    }
    
    public boolean createObject(String name, int value)
    {
        if(!createObject(name))
            return false;
        write(name, value);
        return true;
    }
}
