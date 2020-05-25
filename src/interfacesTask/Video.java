package interfacesTask;

public class Video extends Media implements IPlay {
    double length;

    Video (double cost, double length, Type type, String author, String date){
        super(cost,type,date,author);
        this.length = length;
    }

    public void getLength(){
        System.out.println(length);
    }

    public void play(AbstractNote.Type type){
        if (super.messageType == Type.VIDEO){
            System.out.println(type);
        }
    }
}
