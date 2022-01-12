package day01;

import java.time.LocalDate;

public class Run {
    double km;
    LocalDate date;

    public Run(double km, LocalDate date) {
        this.km = km;
        this.date = date;
    }

    public Run(String line) {
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Run{" +
                "km=" + km +
                ", date=" + date +
                '}';
    }


}
