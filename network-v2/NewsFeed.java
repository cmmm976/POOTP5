import java.util.ArrayList;
 
/**
 * The NewsFeed class stores news posts for the news feed in a social network 
 * application.
 * 
 * Display of the posts is currently simulated by printing the details to the
 * terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not provide any
 * search or ordering functions.
 * 
 * @author Charles-Meldhine Madi Mnemoi from Michael Kölling and David J. Barnes source code
 * @version 0.1
 */
public class NewsFeed
{
    private ArrayList<Post> messages;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
    }

    /**
     * Add a text post to the news feed.
     * 
     * @param text  The post to be added.
     */
    public void add(Post message)
    {
        messages.add(message);
    }


    /**
     * Show the news feed. Currently: print the news feed details to the
     * terminal. (To do: replace this later with display in web browser.)
     */
    public void show()
    {
        
        // display all posts
        for(Post message : messages) {
            message.display();
            System.out.println();   // empty line between posts
        }
    }
}
