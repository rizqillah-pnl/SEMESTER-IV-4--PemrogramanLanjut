/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArgumentsCommandLine;
import java.io.*;

class FavoriteCharacter {
    public static void main(String args[]) throws IOException {
        System.out.println("Hi, what's your favorite character?");
        char favChar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        favChar = (char) br.read();
        System.out.println(favChar + " is a good choice!");
    }
}
