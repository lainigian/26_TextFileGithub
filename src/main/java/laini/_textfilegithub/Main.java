/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laini._textfilegithub;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Main 
{
    public static void main(String[] args) 
    {
        String s1="Riga 1";
        String s2="Riga 2";
        String s3="Riga 3";
        
        
        try
        {
            TextFile f1=new TextFile("prova.txt",'W');
            f1.toFile(s1);
            f1.toFile(s2);
            f1.toFile(s3);
            f1.close();
            System.out.println("Scrittura del file avvenuta correttamente");
                    
        }
        catch(IOException e1)
        {
            System.out.println("Impossibile accedere al file");
        } 
        catch (FileException e2) 
        {
            System.out.println(e2.toString());
        }
        
        String s;
        try
        {
            TextFile f1=new TextFile("prova.txt",'R');
            try
            {
                while(true)
                {  
                    {
                        s=f1.fromFile();
                        System.out.println(s1);
                     }  
                }
            }
            catch (FileException e2) 
            {
                f1.close();
                System.out.println(e2.toString());
            }
            
        }
        catch(IOException e1)
        {
            System.out.println("Impossibile accedere al file");
            
        } 
       
        
    }
}
