package tvshow;

/**
 *
 * @author Brian Albert
 */
public class TVShow {
    /**
     * @param args the command line arguments
     */
    private String network;
    private int channel;
    
   /**
    * Constructor
    * @param initialNetwork value for network field
    * @param initialChannel value for channel field
    */
    public TVShow(String initialNetwork, int initialChannel){
        network = initialNetwork;
        channel = initialChannel;
    }
    
   /**
    * The setNetwork method accepts an argument
    * which is stored in the network field.
    * @param newNetwork value for network field
    */
    public void setNetwork(String newNetwork){
        network = newNetwork;
    }
    
   /**
    * The setChannel method accepts an argument
    * which is stored in the channel field.
    * @param newChannel value for channel field
    */
    public void setChannel(int newChannel){
        channel = newChannel;
    }
    
   /**
    * The getNetwork method returns the value
    * stored in the network field.
    * @return value from network field
    */
    public String getNetwork(){
        return network;
    }
    
   /**
    * The getChannel method returns the value
    * stored in the channel field.
    * @return value from channel field
    */
    public int getChannel(){
        return channel;
    }
}

class Show extends TVShow
{
    /**
     * @param args the command line arguments
     */
    private String show;
    
    /**
    * Constructor
    * @param initialShow value for show field
    */
    public Show(String network, int channel, String initialShow){
        super(network, channel);
        show = initialShow;
    }
    
   /**
    * The setShow method accepts an argument
    * which is stored in the show field.
    * @param newShow value for show field
    */
    public void setShow(String newShow){
        show = newShow;
    }
    
   /**
    * The getShow method returns the value
    * stored in the show field.
    * @return value from show field
    */
    public String getShow(){
        return show;
    }
}
