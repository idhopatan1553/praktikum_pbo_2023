package latihanP4;
import java.util.Scanner;

public class Kalkulator {
//	attribut
    private double value1;
    private double value2;
    private String nameProject;
    private String noteProject;
// getter setter
    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public void setNoteProject(String note) {
        this.noteProject = note;
    }

    public double add(double val1, double val2) {
        return val1 + val2;
    }

    public double minus(double val1, double val2) {
        return val1 - val2;
    }

    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }

    public double division(double val1, double val2) {
        if (val2 == 0) {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
            return Double.NaN;
        } else {
            return val1 / val2;
        }
    }

    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();

        calculator.setValue1(7.0);
        calculator.setValue2(5.0);
        calculator.setNameProject("\nProject Calculator");
        calculator.setNoteProject("This Project show u how to manage method in java.");

        System.out.println("VALUE 1 : " + calculator.value1);
        System.out.println("VALUE 2 : " + calculator.value2);
        System.out.println(calculator.nameProject);
        System.out.println(calculator.noteProject);
        System.out.println("Result Add Is	   : " + calculator.add(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Minus Is    : " + calculator.minus(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Multiple Is : " + calculator.multiplication(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Division Is : " + calculator.division(calculator.getValue1(), calculator.getValue2()));
    }
}