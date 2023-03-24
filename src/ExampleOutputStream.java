import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
public class ExampleOutputStream {
    public static void main(String[] args) throws Exception {
        // Generate Data
        String timeInString = new Date().toString();

        //Store Data
        File file = new File("log.txt");
        FileOutputStream stream = new FileOutputStream(file);

        byte[] timeInBytes = timeInString.getBytes();

        stream.write(timeInBytes);
        stream.flush();
        stream.close();
    }
}
