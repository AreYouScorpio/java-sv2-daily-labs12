package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {

    public static final String SEPARATOR = ";";

    private String values;
    private Path fileName;

    public Running(Path fileName) {
        this.fileName = fileName;
    }



    public List<Run> runnings() {
        List<Run> runnings = new ArrayList<>();
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName.toString()))) {
            while ((line = reader.readLine()) != null) {
                Run run = new Run(line);
                runnings.add(run);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Error by parsing, general io", ioe);
        }
        return runnings;
    }

    private Run parseLine(String line){
        String[] fields = line.split(SEPARATOR);
        return new Run(Integer.parseInt(fields[0].trim()), LocalDate.parse(fields[1]));
            }

    public static void main(String[] args) {
        Running running = new Running(Paths.get("src/main/resources/running.csv"));
        System.out.println(running.runnings());

    }
}
