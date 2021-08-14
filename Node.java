public class Node
{
    private Node nextNode;
    private Song song;


    public Node() {
        nextNode = null;
        song = new Song();
    }


    public Node getNextNode() {
        return nextNode;
    }


    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }


    public Song getSong() {
        return song;
    }


    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return  song.toString();
    }

    
    

}