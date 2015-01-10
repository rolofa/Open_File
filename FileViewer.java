import javax.swing.*;
/**
 * Write a description of class FileViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileViewer extends JFrame
{
    // instance variables - replace the example below with your own
    private JTextField txtIsiFile = new JTextField();
    private FileReader fl1 = new FileReader();
    private MyFile mf = new MyFile();
    /**
     * Constructor for objects of class FileViewer
     */
    public FileViewer()
    {
        // initialise instance variables
       super("File Viewer v1.0");
       setSize(300,400);
       getContentPane().add(txtIsiFile);
       try{
		   String input = JOptionPane.showInputDialog("Input File Name :");
           txtIsiFile.setText(fl1.bacaFile(input));
       }catch (Exception e)
       {
           e.printStackTrace();
       }
       setVisible(true);
    }
}
