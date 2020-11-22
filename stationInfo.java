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
public class stationInfo {

  
    private final Scanner scan=new Scanner(System.in);
  

    public double calculatePrice(int from, int to) {
     
            int number = Math.abs(from - to);
            return 4 * number + 7;
        
    }

    public void allDestination() {
        for (int i = 0; i < station.values().length; i++) {
            System.out.println("Press " + i + " to go " + station.values()[i]);
        }
    }
    public int chooseStation(){
    int choose=scan.nextInt();
    if(choose>station.values().length|| choose<0){
        return -1;
    }
      return  choose;
   
        }
  }




