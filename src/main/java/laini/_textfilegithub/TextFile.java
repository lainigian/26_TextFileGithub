/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laini._textfilegithub;

import java.io.*;

/**
 * Classe che rappresenta un lettore/scrittore per file di testo
 * L'oggetto istanziato consentirà di scrivere su un file di testo o 
 * di leggere da un file di testo il cui pathname è passato come parametro al 
 * costruttore
 * @author User
 */
public class TextFile 
{
    private char mode;
    private BufferedReader reader;
    private BufferedWriter writer;
    
    
    /**
     * 
     * @param filename
     * @param mode
     * @throws IOException 
     */
    public TextFile(String filename,char mode) throws IOException
    {
        this.mode='R';
        if (mode=='w' || mode=='W')
            this.mode='W';
        
        if (this.mode=='R')
            reader=new BufferedReader(new FileReader(filename));
        else
            writer=new BufferedWriter(new FileWriter(filename));
    }
    
    public TextFile(String filename,char mode, boolean append) throws IOException
    {
        this.mode='R';
        if (mode=='w' || mode=='W')
            this.mode='W';
        
        if (this.mode=='R')
            reader=new BufferedReader(new FileReader(filename));
        else
            writer=new BufferedWriter(new FileWriter(filename,append));
    }
    
    public void toFile(String s) throws FileException, IOException
    {
        if (mode=='R')
            throw new FileException("Impossibiile scrivere sul file. File aperto in lettura.");
        
        writer.write(s);
        writer.newLine();
        
    }
    
    public String fromFile() throws FileException, IOException
    {
        String s;
        if (mode=='W')
            throw new FileException("Impossibiile leggere dal file. File aperto in scrittura.");
        
        s=reader.readLine();
        if (s==null)
            throw new FileException("Fine del file");
        return s;
    }
    
    public void close() throws IOException
    {
        if (mode=='R')
            reader.close();
        else
            writer.close();
    }
}
