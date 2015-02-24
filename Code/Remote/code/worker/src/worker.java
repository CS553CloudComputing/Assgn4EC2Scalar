/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author ayacha
 */
public class client {
       public static void main(String args[]) {
      try {
               String data = "Toobie ornaught toobie";

         Socket skt = new Socket("localhost", 1234);
         PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
         System.out.print("Sending string: '" + data + "'\n");
         out.print(data);
         out.close();
      }
      catch(Exception e) {
         System.out.print("Whoops! It didn't work!\n");
      }
   }

}
