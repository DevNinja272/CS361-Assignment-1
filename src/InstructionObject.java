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
    Instructions command;
    String subj;
    String obj;
    String val;
    
    public InstructionObject()
    {
        command = Instructions.BAD;
    }
    
    public InstructionObject(String subj, String obj, String val)
    {
        this.subj = subj;
        this.obj = obj;
        this.val = val;
    }
}
