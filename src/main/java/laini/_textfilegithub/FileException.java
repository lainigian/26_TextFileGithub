/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laini._textfilegithub;

/**
 *
 * @author User
 */
public class FileException extends Exception 
{
    public String motivoEccezione;
    public FileException(String message) 
    {
        motivoEccezione=message;
        
    }
    
    public String toString()
    {
        return motivoEccezione;
    }
    
}