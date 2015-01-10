import java.io.*;
import java.util.*;
/**
 * Write a description of class MyFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyFile
{
    // instance variables - replace the example below with your own
   public MyFile()
   {
      
   }
   
   public void tulisFile(String namaFile, String isiFile)throws IOException
   {
    //gunakan FielOutputStream
    FileOutputStream fos = new FileOutputStream(namaFile);
    for (int i=0; i<isiFile.length();i++)
        fos.write(isiFile.charAt(i));
    fos.close();
    }
    
   public String bacaFile(String namaFile) throws IOException
   {
       //gunakan FileInputStream
       FileInputStream fis = new FileInputStream(namaFile);
       String str = "";
       //mengambil panjang file
       int jmlByte = fis.available();
       byte []buff = new byte[jmlByte];
       int byteRead = fis.read(buff,0,jmlByte);
       str = new String(buff);
       return str;
    }
    
    
}