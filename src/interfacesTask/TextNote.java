package interfacesTask;

public class TextNote extends AbstractNote implements IPrinter {
    String topic;

    TextNote(String date, String author, Type type, String topic) {
        super(date, author, type);
        this.topic = topic;
    }

    public void getVolume() {
        if (super.messageType == Type.POST || super.messageType == Type.REPOST || super.messageType == Type.COMMENT) {
            System.out.println("The message is: " + messageType + " and the size is " + messageType.volumeInMb);
        }
    }
    public void getTopic(){
        System.out.println(topic);
    }

    public void print(Type type){
        if (super.messageType == Type.POST || super.messageType == Type.REPOST || super.messageType == Type.COMMENT){
            System.out.println(type);
        }
    }
}
