package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private static final String FILENAME = "src/main/resources/beosztas.txt";




    public  static List<Teacher> teachers = new ArrayList<>();

    void readFile(Path p) throws IllegalStateException {
        try {
            List<String> lines = Files.readAllLines(p);
            int counter=0;
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                // String s[] = line.split(";");
                // humans.add(new Human(s[0], s[1]));
                counter++;
                if (counter<4) sb.append(line+";");
                if (counter==4) sb.append(line);
                System.out.println(sb);
                if (counter==4) {
                    String s[] = sb.toString().split(";");
                    teachers.add(new Teacher(s[0], s[1], s[2], Integer.parseInt(s[3])));
                    counter = 0;
                    System.out.println(sb);
                    sb.delete(0, sb.length());
                    System.out.println(sb);
                }
                }

        }catch(IOException ise)
        {
            throw new IllegalStateException("Can't read file!",ise);
        }
    }

    public int Calculator(String name) {
        int result = 0;
        for (Teacher actual : teachers) {
            if (actual.name.equals(name)) {
                result+=actual.hours;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        fileReader.readFile(Path.of(FILENAME));
        System.out.println(teachers.toString());
        System.out.println(fileReader.Calculator("Csincsilla Csilla"));
        System.out.println(fileReader.Calculator("Albatrosz Aladin"));

    }
}

