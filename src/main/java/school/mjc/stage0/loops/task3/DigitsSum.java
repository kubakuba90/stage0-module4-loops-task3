package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        String tStr = String.valueOf(t);
        char[] ch = tStr.toCharArray();
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            sum = sum + ch[i];
        }

        System.out.println(sum);

    }
}
