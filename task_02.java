import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class task_02{
    public static void main(String [] args) {

        try(BufferedReader studFile = new BufferedReader(new FileReader("studing.txt"))){
            Scanner scanStud = new Scanner(studFile);
            String lines = scanStud.next();
            String[] studSplit = lines.split(";");




            for (String line : studSplit) {
                String[] parts = line.split(",");
                String surname = parts[0].split(":")[1].replace("\"", "");
                String mark = parts[1].split(":")[1].replace("\"", "");
                String subject = parts[2].split(":")[1].replace("\"", "");

                StringBuilder sb = new StringBuilder();
                sb.append("Студент ").append(surname).append(" получил ").append(mark).append(" по предмету ").append(subject).append(".");
                System.out.println(sb);

            }

        }
        catch (Exception e){
            System.out.println("Давай по новой, Миша, всё х...");
        }

    }


}