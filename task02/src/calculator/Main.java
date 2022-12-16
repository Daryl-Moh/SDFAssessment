package calculator;

import java.io.Console;

public class Main {
    public static void main(String[] args) {

        // Not sure why cannot use $last as the second parameter
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "$last"
        // at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        // at java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
        // at java.base/java.lang.Float.parseFloat(Float.java:555)
        // at calculator.Main.main(Main.java:28)


        Console cons = System.console();

        Float last = 0.0f;

        while (true) {

            Float temp = 0.0f;

            String line = cons.readLine("Welcome.\n");

            if (line.equals("exit")) {
                System.out.println("Bye Bye");
                break;
            }

            String[] terms = line.trim().split(" ");
            String firstTerm = terms[0];
            String secondTerm = terms[1];
            String thirdTerm = terms[2];

            switch (secondTerm) {

                case "+":

                    if (firstTerm.equalsIgnoreCase("$last")) {
                        // process for $last as first number

                        temp = last + Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;
                    } else if (thirdTerm.equalsIgnoreCase("$last")) {
                            // process for $last as second number
                            temp = Float.valueOf(firstTerm) + last;
                            System.out.println(temp);
                            last = temp;
                            break;
                    } else {
                        temp = Float.valueOf(firstTerm) + Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;

                    }
                    
                case "-":
                    if (firstTerm.equalsIgnoreCase("$last")) {
                        // process for $last as first number
                        temp = last - Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;
                    } else if (thirdTerm.equalsIgnoreCase("$last")) {
                        // process for $last as second number
                        temp = Float.valueOf(firstTerm) - last;
                        System.out.println(temp);
                        last = temp;
                        break;
                    } else {
                        temp = Float.valueOf(firstTerm) + Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;

                    }
   
                case "/":
                    if (firstTerm.equalsIgnoreCase("$last")) {
                        // process for $last as first number
                        temp = last / Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;
                    } else if (thirdTerm.equalsIgnoreCase("$last")) {
                            // process for $last as second number
                            temp = Float.valueOf(firstTerm) / last;
                            System.out.println(temp);
                            last = temp;
                            break;
                    } else {
                        temp = Float.valueOf(firstTerm) + Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;

                    }

                case "*":

                    if (firstTerm.equalsIgnoreCase("$last")) {
                        // process for $last as first number
                        temp = last * Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;
                    } else if (thirdTerm.equalsIgnoreCase("$last")) {
                            // process for $last as second number
                            temp = Float.valueOf(firstTerm) * last;
                            System.out.println(temp);
                            last = temp;
                            break;
                    } else {
                        temp = Float.valueOf(firstTerm) + Float.valueOf(thirdTerm);
                        System.out.println(temp);
                        last = temp;
                        break;

                    }
                }
            }
        }
    }
