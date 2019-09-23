package simple_factory;

import java.util.Scanner;

/**
 * 反面教材
 */
public class BadExample {
    public static void main(String[] args) throws Exception {
        double  numberA   = 1;
        double  numberB   = 2;
        double  res;
        Scanner s         = new Scanner(System.in);
        String  operation = s.nextLine();
        if ("+".equals(operation)) {
            res = numberA + numberB;
        } else if ("-".equals(operation)) {
            res = numberA - numberB;
        } else if ("*".equals(operation)) {
            res = numberA * numberB;
        } else if ("/".equals(operation)) {
            res = numberA / numberB;
        } else {
            throw new Exception();
        }
        System.out.println(res);
    }
}
