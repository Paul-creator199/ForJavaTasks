package interfacesTask;

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
