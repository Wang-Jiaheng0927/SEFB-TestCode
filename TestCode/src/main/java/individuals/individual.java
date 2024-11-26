package individuals;

public abstract class individual {
    protected String name;
    protected int GPSid;

    public individual (String name, int GPSid){
        this.name = name;
        this.GPSid = GPSid;
    }

    public abstract int getCoords(int GPSid);
}
