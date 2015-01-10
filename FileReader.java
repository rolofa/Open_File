import java.util.*;
import javax.swing.*;
import java.io.*;
/**
 * Write a description of class FileReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileReader
{
    // instance variables - replace the example below with your own
    private String namaFile;
    /**
     * constructor for object of class FileReader
     */
    public FileReader()
    {
     
    }
    
   
    public String bacaFile(String namaFile)throws IOException 
    {
        String str = "";
        Scanner sc = new Scanner(new File(namaFile));
        str = sc.next();
        return str;
    }
    
    public static void main(String []args)
    {
		String namaFile = JOptionPane.showInputDialog("Input File Name");
        FileReader fr1 = new FileReader();
        try{
            String isiFile=fr1.bacaFile(namaFile);
            System.out.println(isiFile);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
}
