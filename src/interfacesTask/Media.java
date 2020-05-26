package interfacesTask;

public class Media extends AbstractNote {
    double cost;

    Media(double cost, Type type, String date, String author) {
        super(date, author, type);
        this.cost = cost;
    }

    public void getVolume() {
        if (super.messageType == Type.IMAGE || super.messageType == Type.AUDIO || super.messageType == Type.VIDEO) {
            System.out.println("The type is: " + messageType + " and the size is " + messageType.volumeInMb);
        }
    }

    public void getCost() {
        System.out.println(cost);
    }
}
