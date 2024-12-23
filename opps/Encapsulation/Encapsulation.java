package Encapsulation;


/*
 * 
 * binding the data memebers and methods into a single class is called encapsulation
 * 
 * that means the instance variables can be accesed by the methods insidde the class only not by object
 * 
 * this can be acheived by private access_modifer and getters and setters
 */


class Human{
    private int  mobileOtp;
    private String safePassword;

    Human()
    {

    }

    public int getMobileOtp() {
        return mobileOtp;
    }
    public void setMobileOtp(int mobileOtp) {
        this.mobileOtp = mobileOtp;
    }
    public String getSafePassword() {
        return safePassword;
    }
    public void setSafePassword(String safePassword) {
        this.safePassword = safePassword;
    }


    

}
public class Encapsulation {
    public static void main(String[] args) {
        Human naveen = new Human();
        naveen.setMobileOtp(1);
        naveen.setSafePassword("2450");
        System.out.println(naveen.getSafePassword());
    }

}
