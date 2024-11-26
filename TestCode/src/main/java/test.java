import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        int GPSid = 30;

        System.out.print(LocationSystem.getCoords(GPSid));
    }
}
