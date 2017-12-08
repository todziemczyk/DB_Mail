package com.tomasz.sendEmail.Main;

import java.util.List;

public class SMTPServer {

    private List<List> WelcomeEmail;
    private int [] GenericEmail;
    private int [] ConfirmEmail;

    public SMTPServer() {
        // TODO Auto-generated constructor stub
    }
    public void addMailWelcome (List welcome){
        WelcomeEmail.add(welcome);
    }
    public void removeMailWelcome (List welcome){
        WelcomeEmail.remove(welcome);
    }
    public void sendAll (){

    }
    public void allEmail (){
        for (List list : WelcomeEmail) {
            System.out.println(WelcomeEmail);
        }
    }

}
