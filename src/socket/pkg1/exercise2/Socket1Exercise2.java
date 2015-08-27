/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.pkg1.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author AlexanderSteen
 */
public class Socket1Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String ip = "localhost";
        int port = 1234;
        Socket link = new Socket(ip, port);
        
        PrintWriter out = new PrintWriter(link.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(link.getInputStream()));
        
        out.println();
        System.out.println(in.readLine());
    }
}
