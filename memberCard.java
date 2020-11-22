
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phunon
 */
public class memberCard {

    private final String CardHolder;
    private static int noOfCard = 0;
    private final String idCard;
    private double remainMoney;

    public memberCard(String CardHolder) { 
        noOfCard++;

        this.CardHolder = CardHolder;
        this.idCard = "0000" + String.valueOf(noOfCard);
        this.remainMoney = 0;
        memberDatabase.addAccount(this);
    }

    public void addMoney(double cash) { 
        if(cash<0){
            return;
        }
        remainMoney += cash;
        System.out.println("Add money success");
    }

    public void purchaseTicket(double cash) { 
        if (remainMoney < cash) {
            System.out.println("Purchase failed: No enough money!");
        } else {
            remainMoney -= cash;
            System.out.println("Purchase successfully");
        }
    }

    @Override
    public String toString() {
        return "Cardholder-Name:" + CardHolder + " CardNo:" + idCard + " Money:" + remainMoney + " Baht\n";
    }

    public double getRemainMoney() {
        return remainMoney;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getCardHolder() {
        return CardHolder;
    }

    public static int getNoOfCard() {
        return noOfCard;
    }

}
