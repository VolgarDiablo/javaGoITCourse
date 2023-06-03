import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        float A = 8.3F;
        if (D > 0) {
            double x1 = ((-b - Math.sqrt(D)) / (2.0 * a));
            double x2 = ((-b + Math.sqrt(D)) / (2.0 * a));
            return new double[]{Math.max(x1, x2), Math.min(x1, x2)};
        }
        if (D == 0) {
            return new double[]{-b / (2.0 * a)};
        }
        return new double[0];
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        QuadraticEquationSolver quadraticEquationSolver = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(8, -72, 64)));
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(6, -60, 144)));
    }
}