package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second)
            System.out.println(first);
        
        if (first == second)
            System.out.println(first | second);
        
        if (second > first)
            System.out.println(second);
    }
    
    public static void main(String args[]) {
       GreatestNumberPrinter main = new GreatestNumberPrinter();
        main.printGreatest(55,65);
    }
}
