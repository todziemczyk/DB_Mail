public class WelcomeMail {

    private String title;
    private String Content;

    public void sendEmail(){
        System.out.println("Welcome Mail");
    }
    public WelcomeMail() {
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

}
