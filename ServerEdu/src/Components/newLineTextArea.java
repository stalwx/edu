/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import javax.swing.JTextArea;

/**
 *
 * @author stalwx
 */
public class newLineTextArea extends JTextArea{
    @Override
    public void append(String text){
        super.append(text + '\n');
    }    
}
