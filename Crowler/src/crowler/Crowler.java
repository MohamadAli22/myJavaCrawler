/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowler;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohamadali
 */
public class Crowler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // TODO code application logic here
            ContentScanner cs = new  ContentScanner();
            String s = cs.getHrefs(SocketConnection.getURLSource("https://www.digikala.com/")).toString();
            System.out.println(s);
        } catch (IOException ex) {
            Logger.getLogger(Crowler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
