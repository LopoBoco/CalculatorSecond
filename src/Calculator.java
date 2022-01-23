public class Calculator {

    public static void сalculator(String line, String operator) throws Exception { // Сам метод расчета "Калькулятор"

        numberFill(line, operator);

        int a = Integer.parseInt(Main.firstElement);

        int b = Integer.parseInt(Main.secondElement);

        if (a > 10 || b > 10 || a < 1 || b < 1) {

            throw new IllegalArgumentException("Калькулятор работает с числами не более 10");

        }

        switch (Main.operand){

            case "+":

                System.out.println(a + b);

                break;

            case "-":

                System.out.println(a - b);

                break;

            case "*":

                System.out.println(a * b);

                break;

            case "/":

                System.out.println(a / b);

                break;

            default:

                System.out.println("Вы ввели не верные данные");

        }

    }

    public static void numberFill(String line, String operator) {

        int a = line.indexOf(operator);

        Main.firstElement = line.substring(0, a);

        Main.secondElement = line.substring(a + 1);

    }

}
