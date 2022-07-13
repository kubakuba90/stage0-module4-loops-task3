package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        int tPos = Math.abs(t);

        String tStr = String.valueOf(tPos);
        char[] ch = tStr.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            sum = sum + Character.getNumericValue(ch[i]);
        }
        System.out.println(sum);
    }

}
