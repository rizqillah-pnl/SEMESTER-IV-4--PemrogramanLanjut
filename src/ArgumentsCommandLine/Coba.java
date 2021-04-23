/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArgumentsCommandLine;

import java.io.FileInputStream;
import java.util.Properties;

public class Coba {
    public static void main(String[] args) throws Exception {
        // set up new properties object
        // from file "myProperties.txt"
        FileInputStream propFile = new FileInputStream("myProperties.txt");
        Properties p = new Properties(System.getProperties());
        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
    }
}
