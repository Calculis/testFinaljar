/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phunon
 */
public class memberDatabase {

    private static memberCard memberList[] = new memberCard[0];

    public static void addAccount(memberCard lastMember) {
        memberCard[] temp = new memberCard[memberCard.getNoOfCard()];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
        memberList[memberCard.getNoOfCard() - 1] = lastMember;
    }

    public static boolean isExist(String idCard) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].getIdCard().equals(idCard)) {
                return true;
            } else {
                
            }
        }
        return false;
    }

    public static memberCard getById(String id) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].getIdCard().equals(id)) {
                return memberList[i];
            } else {
               
            }
        }
        return null;
    }

    public static memberCard[] getMemberList() {
        return memberList;
    }

}
