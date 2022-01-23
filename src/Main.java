import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

    static String firstElement;

    static String secondElement;

    static String operand;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите данные: ");

        String line = "";

        try {

            line = reader.readLine();

        } catch (IOException e) {

            e.printStackTrace();

        }


        if (line.contains("+")) {

            operand = "+";

        } else if (line.contains("-")) {

            operand = "-";

        } else if (line.contains("*")) {

            operand = "*";

        } else if (line.contains("/")) {

            operand = "/";

        }



        firstElement = line.substring(0, line.indexOf(operand)).trim().replaceAll("\"", "");

        secondElement = line.substring(line.indexOf(operand) + 2).trim().replaceAll("\"", "");

        if (firstElement.length() > 10 || secondElement.length() > 10) throw new IllegalArgumentException("Строки должны быть не более 10 символов");

        if (!isString(line)) { //Если введенные данные только числа без строк. Выполняем обычную логику калькулятора

            Calculator.сalculator(line, operand);

        } else {

            if (line.charAt(0) != '"') { // Первым аргументом выражения, подаваемого на вход, должна быть строка, при вводе пользователем выражения вроде 3 + "hello", калькулятор должен выбросить исключение и прекратить свою работу.

                throw new IllegalInputException("Первый символ должен начинаться со строки");

            } else {

                switch (operand) {

                    case "+":

                        StringCalc.concat();

                        break;

                    case "*":

                        StringCalc.multiplication();

                        break;

                    case "/":

                        StringCalc.division();

                        break;

                    default:

                        StringCalc.subtraction();

                }

            }

        }

    }

    public static boolean isString(String content) {

        return content.matches("(.*)\"(.*)");

    }

}
