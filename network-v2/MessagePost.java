
/**
 * Write a description of class MessagePsot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    private String text;
    
    /**
     * Constructor for objects of class MessagePsot
     */
    public MessagePost(String author, String text)
    {
        super(author);
        this.text = text;
    }
    
    
    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
        System.out.println(getUserName());
        System.out.println(text);
        System.out.print(timeString(getTimeStamp()));
        
        super.display();
    }
}
