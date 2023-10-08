import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            int i;
            while ( (i = fis.read()) != -1){
                System.out.print( (char) i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /*String text = "!!!";
        try {
            FileOutputStream fos = new FileOutputStream("test.txt", true);
            byte[] buff = text.getBytes();
            fos.write(buff);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}
