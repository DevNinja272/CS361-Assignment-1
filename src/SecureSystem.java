/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;

/**
 *
 * @author jinwook
 */
public class SecureSystem {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) 
    {
        if(args.length > 0)	// Valid File
        {
        	File inputFile = new File(args[0]);

        	if(!inputFile.exists())
        	{
        		System.out.println("ERROR: FILE DOES NOT EXIST");
        		return -1;
        	}

        	if(!inputFile.canRead())
        	{
        		System.out.println("ERROR: CANNOT READ FILE");
        		return -1;
        	}

        	FileReader fileReader = new FileReader(inputFile);
        	BufferedReader bufferedReader = new BufferedReader(fileReader);
        	StringBuffer stringBuffer = new StringBuffer();
        	String line;

        	while ((line = bufferedReader.readLine()) != null)
        	{

        	}

        	fileReader.close();

        }
    }

    
    
}
