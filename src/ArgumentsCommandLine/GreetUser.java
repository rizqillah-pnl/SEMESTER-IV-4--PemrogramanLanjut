/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArgumentsCommandLine;
import java.io.*;

class GreetUser {
    public static void main(String args[]) throws IOException {
        System.out.println("Hi, what's your name?");
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        System.out.println("Nice to meet you, " + name + "! :)");
    }
}
