/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays {
    public enum Day {
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");

        private String dayName;

        Day(String dayName) {
            this.dayName = dayName;
        }

        public String getDayName() {
            return dayName;
        }
    }

    public void nameOfDay(String code) {
        Day[] days = Day.values();

        if (code >= one && code <= days.length) {
            System.out.println(days[code - one].getDayName());
        } else {
            System.out.println("Invalid day number!");
        }
    }