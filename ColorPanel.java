package johnbennettfinalproject;

/**
 *Author: John Bennett
 *Class: CMIS 242
 *Date: 5/6/12
 * 
 * Purpose: General panel to hold the color as the radio buttons change
 * (From Module 3, Example 12)
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ColorPanel extends JPanel{
    private final int SIZE = 40;
    private String text = " ";
    private int x,y;
    public ColorPanel(){
        setBackground(Color.white);
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createRaisedBevelBorder(),
                BorderFactory.createLoweredBevelBorder()));
    }
    public void setPanelText(String s){
        text = s;
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 22));
        g.setColor(Color.WHITE);
        g.drawString(text, 25, 50);
        //put the text or other idea here
    }
}
