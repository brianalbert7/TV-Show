package tvshow;
import java.util.Scanner;

/**
 *
 * @author Brian Albert
 */
public class TVShowDriver {
    /**
     * The main method is the program's starting point.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //declare variables
        Show myShow;
        String networkEntered;
        int channelEntered;
        String showEntered;
        Scanner input = new Scanner(System.in);
        
        //Instantiating an instance of Show
        myShow = new Show("HBO",28,"Game of Thrones");
        System.out.println("After instantiation...");
        
        //Display attributes of object
        System.out.printf("\nTV Network: " + myShow.getNetwork());
        System.out.printf("\nTV Network Channel: " + myShow.getChannel());
        System.out.printf("\nTV Show Name: " + myShow.getShow());
        
        //Get Data
        System.out.printf("\n\nEnter new TV network: ");
        networkEntered = input.nextLine();
        
        System.out.print("Enter new channel of the TV network: ");
        channelEntered = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter new TV show name: ");
        showEntered = input.nextLine();
        
        //create Show object
        myShow = new Show(networkEntered, channelEntered, showEntered);
        
        System.out.printf("\nAfter updates...\n\n");
        System.out.println("TV Network: " + myShow.getNetwork());
        System.out.printf("TV Network Channel: %d\n" , myShow.getChannel());
        System.out.printf("TV Show Name: %s\n", myShow.getShow());
    } 
}
