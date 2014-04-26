package johnbennettfinalproject;

/**
 *Author: John Bennett
 *Class: CMIS 242
 *Date: 5/6/12
 * 
 * Purpose: To store colors in a HashMap and display using radio buttons.  The
 * Colors were added to a HashMap (Color/Hex value).
 * Instead of declaring 20 buttons, adding the 20 buttons to the layout,
 * adding 20 buttons to a group and finally creating 20 listeners, I used
 * the Collection for/each statement to work with the radio button HashMap in
 * conjunction with the Color/Hex Collection. 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class RadioButtonPanel extends JPanel{
    public JohnBennettFinalProject jbApp;
    private Map<String, String> colorMap = new HashMap<String, String>();
    private Map<String, JRadioButton> radioButtonMap = 
            new HashMap<String, JRadioButton>();
    
    public RadioButtonPanel(JohnBennettFinalProject jbApp){
        this.jbApp = jbApp;
        setLayout(new GridLayout(5,4));
        setBorder(BorderFactory.createTitledBorder("Choose A Hex Value"));
        ButtonGroup jrbGroup = new ButtonGroup();
        
        //Add color/hex values to HashMap
        colorMap.put("Red", "AA0000");
        colorMap.put("Blue", "0000AA");
        colorMap.put("Green", "009900");
        colorMap.put("Yellow", "F9E300");
        colorMap.put("Purple", "AA00AA");
        colorMap.put("Orange", "E98300");
        colorMap.put("Black", "000000");
        colorMap.put("Cyan", "009FDA");
        colorMap.put("Magenta", "D10074");
        colorMap.put("Brown", "6E3219");
        colorMap.put("Tan", "CE8E00");
        colorMap.put("Pink", "FAB1C2");
        colorMap.put("Dark Blue", "00257A");
        colorMap.put("Dark Green", "004438");
        colorMap.put("Light Gray", "CECFCB");
        colorMap.put("Dark Gray", "6C6F70");
        colorMap.put("Sea Green", "589199");
        colorMap.put("Sky Blue", "8CB8C6");
        colorMap.put("Maroon", "823C47");
        colorMap.put("Eggshell", "ECDEBB");
        
        /*From Module 5, Section 3.8.1
        *Iterates through colorMap HashMap and assigns a radioButton and
        *the key value from colorMap to radioButtonMap.
        *Also adds each button to the JPanel*/
        for(Map.Entry<String, String> m : colorMap.entrySet()){
            radioButtonMap.put(m.getKey(), new JRadioButton(m.getValue()));
            add(radioButtonMap.get(m.getKey()));    
        }
        /*From Module 5, Section 3.8.1
        *Iterates through jrbList HashMap, assigns a
        *listener and assigns the button to a radio button group.
        *It also passes an argument to the inner class RadioListener so the 
        *string value of the color can be utilized by the itemStateChanged
        *method.*/
        for(Map.Entry<String, JRadioButton> m : radioButtonMap.entrySet()){
            jrbGroup.add(m.getValue());
            m.getValue().addItemListener(new RadioListener(
                    colorMap.get(m.getKey())));
        }
    }
    /*Reference for passing arguments to listener constructor:
    *video at 5:32
    *http://www.youtube.com/watch?v=-ptlsT9KsM8*/
    private class RadioListener implements ItemListener{
        private String color;
        public RadioListener(String s){
            this.color = s;
        }
        public void itemStateChanged(ItemEvent e){
            radioButtonAction(color);
        }
    }
    //Method performs the action from RadioListener
    private void radioButtonAction(String color){
        int r = Integer.parseInt(color.substring(0,2),16);
        int g = Integer.parseInt(color.substring(2,4),16);
        int b = Integer.parseInt(color.substring(4,6),16);
        Color c = new Color(r,g,b);
        jbApp.colorPanel.setPanelText(getKey(colorMap, color));
        jbApp.colorPanel.setBackground(c);
    }  
    /*From Module 5, Section 3.8.1
    Method traverses through the key/value pairs and gets the key based
    off the value from the radioButtonAction method*/
    private String getKey(Map<String, String> m, String s){
        for(Map.Entry<String, String> element : m.entrySet()){
            if(s.equals(element.getValue())){
                return element.getKey();
            }
        }
        return null;
    }
}