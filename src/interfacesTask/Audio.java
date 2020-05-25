package interfacesTask;

public class Audio extends Media {
    String volumeOfSound;

    Audio (double cost, String volumeOfSound, Type type, String author, String date){
        super(cost,type,date,author);
        this.volumeOfSound = volumeOfSound;
    }

    public void getVolumeOfSound(){
        System.out.println(volumeOfSound);
    }
}
