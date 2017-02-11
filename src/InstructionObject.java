/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

enum Instructions
{
    READ,
    WRITE,
    BAD
}

/**
 *
 * @author jinwook
 */
public class InstructionObject {
    private final Instructions command;
    private final String subj;
    private final String obj;
    private final String val;
    
    private InstructionObject()
    {
        command = Instructions.BAD;
    }
    
    private InstructionObject(String line)
    {
        if(line != null)
        {
            ArrayList<String> words = line.trim().replaceAll("\\p{javaSpaceChar}{2,}"," ").split();
            int counter = 0;
            if(words.size() > counter)
            {
                command = words.get(counter++);
                if(words.size() > counter)
                {
                    subject = words.get(counter++);
                    if(words.size() > counter)
                    {
                        object = words.get(counter++);
                        if(words.size() > counter)
                        {
                            val = words.get(counter++);
                        }
                    }
                }
            }
        }
    }

    private InstructionObject(String subj, String obj, String val)
    {
        this.subj = subj;
        this.obj = obj;
        this.val = val;
    }

    public String getSubj()
    {
        return subj;
    }

    public String getObj()
    {
        return obj;
    }

    public String getVal()
    {
        return val;
    }
}
