import java.util.Scanner;

public class QuadraticEquationSolver {
    public void findRoot(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

   
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        solver.findRoot(a, b, c);

        sc.close();
    }
}
