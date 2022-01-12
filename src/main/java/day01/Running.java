package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Running {

    public static final String SEPARATOR = " km;";

    public List<Run> runnings = new ArrayList<>();

    private String values;
    private Path fileName;

    public Running(Path fileName) {
        this.fileName = fileName;
    }


    public List<Run> runnings() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName.toString()))) {
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(SEPARATOR);
                Run run = new Run(Double.parseDouble(fields[0].split(" ")[1]), LocalDate.parse(fields[1]));
                runnings.add(run);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Error by parsing, general io", ioe);
        }
        return runnings;
    }

    public double sumKm(int year, Month month){
        double sumKm =0;
        for (Run actual : runnings) {
            if (actual.getDate().getYear()==year && actual.getDate().getMonth()==month) {
                sumKm+=actual.getKm();
            }
        }
        return sumKm;
    }

    public static void main(String[] args) {
        Running running = new Running(Paths.get("src/main/resources/running.csv"));
        System.out.println(running.runnings());
        System.out.println(running.sumKm(2021, Month.DECEMBER));
        System.out.println(running.sumKm(2021, Month.NOVEMBER));
        System.out.println(running.sumKm(2022, Month.JANUARY));




    }
}
