/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author phunon
 */
import java.util.Scanner;
public class runFile {  
        public static void main(String[] args) {
        System.out.println("set ticket Machine station:");
        ticketMachine tm=new ticketMachine(new Scanner(System.in).nextInt());
        tm.mainMenu();
            
    }
    
}
