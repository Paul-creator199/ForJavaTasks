package interfacesTask;

public class Video extends Media {
    double length;

    Video (double cost, double length, Type type, String author, String date){
        super(cost,type,date,author);
        this.length = length;
    }

    public void getLength(){
        System.out.println(length);
    }
}
