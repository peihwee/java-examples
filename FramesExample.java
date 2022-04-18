import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import library.SampleClass;

public class FramesExample
{
    public static void main(String[] args) 
    {
        System.out.println("Main is running");

        SampleClass objClass = new SampleClass();
        objClass.ExampleFunction();

        FramesExample objMain = new FramesExample();
        objMain.CreateFrame("First Frame", 640, 480);
        JFrame objFrame2 = objMain.CreateFrame("Second Frame", 250, 250);
        
        objMain.AddButton(objFrame2, "Hello World");
    }

    private JFrame CreateFrame(String sFrameName, int iWidth, int iHeight)
    {
        JFrame objFrame = new JFrame(sFrameName);
        objFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objFrame.setSize(iWidth,iHeight);
        objFrame.setVisible(true);

        return objFrame;
    }

    public void AddButton(JFrame objFrame, String sLabel)
    {
        JButton objButton = new JButton(sLabel);
        objFrame.getContentPane().add(objButton); 
    }
}