package interfacesTask;

import java.lang.reflect.Type;
import java.util.Arrays;

abstract class AbstractNote {
    String date;
    String author;
    Type messageType;


    AbstractNote(String date, String author,Type type) {
        this.date = date;
        messageType = type;
        this.author = author;
    }

    enum Type
    {
        POST(11),
        REPOST(8),
        COMMENT(2),
        IMAGE(3),
        AUDIO(14),
        VIDEO(56);

        public int volumeInMb;

        Type(int volumeInMb){
            this.volumeInMb = volumeInMb;
            }
    }
    abstract void getVolume();

   public void getAuthor(String message0){
       System.out.println(author);
       }

    public void getDate(String message1){
       System.out.println(date);
   }

   public void getMessage(Type t){
       System.out.println(t);
   }

}
