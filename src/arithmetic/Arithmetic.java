/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter arithmetic operation to perform: ");
        String operationStr = in.next();
        Operation operation = Operation.valueOf(operationStr.toUpperCase());

        System.out.println("Enter two numbers: ");
        double n = in.nextDouble();
        double m = in.nextDouble();

        double result = r.calculate(n, m, operation);
        System.out.println("Result: " + result);
    }
}