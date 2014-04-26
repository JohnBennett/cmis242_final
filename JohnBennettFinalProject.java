package johnbennettfinalproject;

/**
 *Author: John Bennett
 *Class: CMIS 242
 *Date: 5/6/12
 *
 *Purpose: To create an application that uses Java Collections to store a 
 * set of color name/hex values.  A GUI is built to display the values as 
 * radio buttons. When clicked, the radio button's listener will change
 * the background of a panel adjacent to the radio buttons.
 * (From Module 3, Example 1)
 * 
 * Required with this file:
 *  GeneralFrame.java
 *  RadioButtonPanel.java
 *  ColorPanel.java
 */
import java.awt.*;
public class JohnBennettFinalProject extends GeneralFrame{
    public ColorPanel colorPanel = new ColorPanel();
    
    JohnBennettFinalProject(){
        super("John Bennett Final Project", 550, 240);
        add(colorPanel, BorderLayout.CENTER);
        add(new RadioButtonPanel(this), BorderLayout.EAST);
    }
    public static void main(String[] args) {
        JohnBennettFinalProject jbApp = new JohnBennettFinalProject();
        jbApp.display();
    }
}
