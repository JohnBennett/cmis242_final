package johnbennettfinalproject;

/**
 *Author: John Bennett
 *Class: CMIS 242
 *Date: 5/6/12
 * 
 * Purpose: A general JFrame to encapsulate the inner portions of the project
 * (From Module 3, example 1)
 */
import javax.swing.*;
public class GeneralFrame extends JFrame {
    static final int WIDTH = 320, HEIGHT = 240;
    public GeneralFrame(){
        super("John Bennett Final Project");
        setFrame(WIDTH, HEIGHT);
    }
    public GeneralFrame(String title, int width, int height){
        super(title);
        setFrame(width,height);
    }
    public void display(){
        setVisible(true);
    }
    public void setFrame(int width, int height){
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
