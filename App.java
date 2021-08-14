import java.util.Scanner;

public class App {
   public static void main(String[] args) {
    Playlist playlist=new Playlist();
    int choice;
    char decision;
    do
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the choice");
   
    System.out.println("1. Add Songs\n2.To view the oldest song\n3.delete the oldest one\n4.View Recent Added First");
    choice=sc.nextInt();
    switch(choice)
    {
        case 1:playlist.insertSong();
        break;
        case 2:playlist.viewFrontSong();
        break;
        case 3:playlist.removeOldestSong();
        break;
        case 4:playlist.newlyAddedSongs();
        break;
    }
    System.out.println("Do you want to continue y/n");
    decision=sc.next().charAt(0);
    }while(choice=='y'||choice=='Y');
  
   }
    
}
