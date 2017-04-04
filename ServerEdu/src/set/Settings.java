/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import Forms.MainForm;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author stalwx
 */
public class Settings {
    public String locale;
    public String status = "";
    public Settings (){
        try {
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            f.setValidating(false);
            DocumentBuilder builder = f.newDocumentBuilder();
            Document doc = builder.parse(new File("Settings.xml"));
           // jTextArea1.append(doc.getNodeName()+'\n');
            NodeList methodNodes = doc.getChildNodes();
            for (int i = 0; i < methodNodes.getLength(); i++) {
                Node node = methodNodes.item(i);
                if (node.getNodeName().equals("locale")) {   
                    this.status = "Ok";
                    this.locale = node.getFirstChild().getNodeValue();                     
                }                           
            }       
            
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            this.status = ex.getMessage();
        }
    }
    
}
