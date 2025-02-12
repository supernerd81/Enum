package de.supernerd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(weekday("Montag"));
        System.out.println(weekday("Mittwoch"));
        System.out.println(weekday("Freitag"));
        System.out.println(weekday("Samstag"));
        System.out.println(weekday("Sonntag"));
    }

    public static String weekday(String weekday) {

        if(DaysOfWeek.SAMSTAG.name().equals( weekday.toUpperCase()) || DaysOfWeek.SONNTAG.name().equals( weekday.toUpperCase())) {
            return "Wochenende";
        }

        return weekday;
    }
}