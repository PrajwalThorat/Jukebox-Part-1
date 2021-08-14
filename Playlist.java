import java.util.Scanner;

public class Playlist {

    private Node front;
    private Node rear;
    Scanner sc = new Scanner(System.in);

    public Playlist()
    {
        this.front=null;
        this.rear=null;
    }

    public Node CreateSong()
    {
        Node node = new Node();
        Song song = new Song();
        System.out.println("Enter the name of the Artist");
        String artist = sc.nextLine();
        System.out.println("Enter the name of the Song");
        String songName = sc.nextLine();
        System.out.println("Enter the name of the Genre");
        String genre = sc.nextLine();
        System.out.println("Enter the year of release");
        String yrofRelease = sc.nextLine();
        System.out.println("Enter the total playing time in the format of hh:mm:ss");
        String totalPlayingTime = sc.nextLine();
        node.setSong(song);
        return node;

    }

    public void insertSong()//enqueue
    {
        Node newNode = new Node();
        if(front==null)
        {
            front=newNode;
            rear=newNode;
            return;
        }
        rear.setNextNode(newNode);
        rear=newNode;
    }

    public void viewFrontSong()//Front
    {
        if(front==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current=front;
        while(current!=null)
        {
            System.out.println(current.getSong().toString());
            current=current.getNextNode();
        }

    }

    public void removeOldestSong()//Dequeue
    {
        if(front==null)
        {
            System.out.println("List is empty");
            return;  
        }
        Node current=front;
        System.out.println("Dequeued song : "+current.getSong().toString());
        front=current.getNextNode();
        current.setNextNode(null);
        if(front==null)
        {
            rear=null;
        }

    }

    public void newlyAddedSongs(Node node)
    {
        if(front==null)
        {
             System.out.println("List is empty");
             return;
        }
        newlyAddedSongs(node.getNextNode());
        System.out.println(node.getSong().toString());

    }

    public void newlyAddedSongs()
    {
        newlyAddedSongs(front);

    }




    
}
