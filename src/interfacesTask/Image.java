package interfacesTask;

public class Image extends Media {
    String color;

    Image (double cost, String author, String date, Type type, String color){
        super(cost,type,date,author);
        this.color = color;
    }

    public void getColor(){
        System.out.println(color);
    }
}
