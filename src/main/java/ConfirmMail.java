package com.tomasz.sendEmail.Main;

public class ConfirmMail {

    private String title;
    private String Content;
    private String password;

    public void sendEmail(){
        System.out.println("Welcome Mail");
    }
    public ConfirmMail() {
        // TODO Auto-generated constructor stub
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return Content;
    }
    public void setContent(String content) {
        Content = content;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
