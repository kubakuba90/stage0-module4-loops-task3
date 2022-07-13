package school.mjc.stage0.loops.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        String regex = "[9]+"; // + means one more time
        String convIntStr;
        boolean foundNine;
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();

        if (lengthOfLastNumber > 0) {
            for (int i = 0; i < lengthOfLastNumber; i++) {
                stringBuilder.append("9");
            }
            String number = stringBuilder.toString();
            int strBldToInt = Integer.parseInt(number);

            for (int i = 0; i <= strBldToInt; i++) {

                convIntStr = String.valueOf(i);
                foundNine = convIntStr.matches(regex);

                if (foundNine) {
                    result = result + i;
                }
            }
            System.out.println(result);
        } else
            System.out.println(0);






    }

//    public static void main(String[] args) {
//        calculateSum(5);
//    }

}
