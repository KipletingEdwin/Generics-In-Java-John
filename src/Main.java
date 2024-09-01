import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();

        Printer<Dog> doublePrinter = new Printer<>(new Dog);
        doublePrinter.print();

        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat());

    }
}