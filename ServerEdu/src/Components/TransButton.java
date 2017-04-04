/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.awt.Container;
import javax.swing.JButton;
/**
 *
 * @author stalwx
 */
public class TransButton extends JButton{
    @Override
    public void setText(String text){
        super.setText(text);
       // super.setText(this.getParent().getName());
    }
    
    public Container getParent(String className){
        Container cont = this.getParent();
        while (!cont.getClass().getName().equals("javax.swing.JFrame")){
            if (cont.getClass().getName().equals(className)){
                break;
            }
            cont = cont.getParent();
        }
        return cont;
    } 
    
}
