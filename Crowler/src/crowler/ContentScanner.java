/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowler;

import java.util.ArrayList;

/**
 *
 * @author mohamadali
 */
public class ContentScanner {

    public ArrayList<String> getHrefs(String pageSource) {
        ArrayList<String> hrefs = new ArrayList<>();
        int start=0;
        
        while (-1 < (start = pageSource.indexOf("href=\"",start)) ) {
            start += 6;
            int end = start;
            StringBuilder link = new StringBuilder("");
            while (pageSource.charAt(end) != '\"') {
                end++;
            }
            link.append(pageSource.substring(start, end));
            hrefs.add(link.toString());
            link = new StringBuilder("");
        }
        return hrefs;
    }

}
