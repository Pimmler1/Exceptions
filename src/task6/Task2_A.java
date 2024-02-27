package task6;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_A {
    public static void main(String[] args) {
        Scanner scanner = null;
        ArrayList<String> possibleNotes = new ArrayList<>(List.of(new String[]{"C,", "D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B", "c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'"}));
        try{
            scanner = new Scanner(Paths.get("C:/Users/pippo/IdeaProjects/Exceptions/src/task6/musicnotes.txt"));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line != null && possibleNotes.contains(line)){
                    System.out.print(line + " ");
                }
            }
        }catch(IOException | InvalidPathException e){
            System.err.println(e.getMessage());
        } finally{
            try{
                scanner.close();
            }catch(NullPointerException e){
                System.err.println(e.getMessage());
            }
        }
    }
}
