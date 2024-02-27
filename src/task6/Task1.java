package task6;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
public class Task1 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try{
            String timestamp = LocalDateTime.now().toString();
            pw = new PrintWriter("./text.txt", StandardCharsets.UTF_8);
            pw.write(timestamp);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        finally {
            try{
                pw.close();
            }catch(NullPointerException e){
                System.err.println(e.getMessage());
            }
        }
    }
}
