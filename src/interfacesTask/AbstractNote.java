package interfacesTask;


abstract class AbstractNote {
    String date;
    String author;
    Type messageType;


    AbstractNote(String date, String author, Type type) {
        this.date = date;
        messageType = type;
        this.author = author;
    }

    abstract void getVolume();

    public void getAuthor(String message0) {
        System.out.println(author);
    }

    public void getDate(String message1) {
        System.out.println(date);
    }

    public void getMessage(Type t) {
        System.out.println(t);
    }

}
