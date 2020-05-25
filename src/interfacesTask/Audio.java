package interfacesTask;

public class Audio extends Media implements IPlay {
    String volumeOfSound;

    Audio (double cost, String volumeOfSound, Type type, String author, String date){
        super(cost,type,date,author);
        this.volumeOfSound = volumeOfSound;
    }

    public void getVolumeOfSound(){
        System.out.println(volumeOfSound);
    }

    public void play(AbstractNote.Type type){
        if (super.messageType == Type.AUDIO){
            System.out.println(type);
        }
    }
}
