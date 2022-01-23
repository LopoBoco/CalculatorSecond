public class StringCalc {

    public static void concat() {

        System.out.println(Main.firstElement + Main.secondElement);

    }

    public static void subtraction() {

        System.out.println(Main.firstElement.replace(Main.secondElement, ""));

    }

    public static void multiplication() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < Integer.parseInt(Main.secondElement); i++) {

            stringBuilder.append(Main.firstElement);

        }

        if (stringBuilder.length() > 40) {

            System.out.println(stringBuilder.substring(0, 39) + "...");

        } else System.out.println(stringBuilder);

    }

    public static void division() {

        Integer num = Integer.parseInt(Main.secondElement);

        System.out.println(Main.firstElement.substring(0, (Main.firstElement.length() / num)));

    }

}
