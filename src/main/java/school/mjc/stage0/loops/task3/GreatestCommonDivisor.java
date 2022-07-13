package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        while(first!=second)
        {
            if(first>second)
                first=first-second;
            else if (first == 0) {
                System.out.println(second);
            } else if (second == 0) {
                System.out.println(first);
            } else
                second=second-first;
        }
        System.out.println(second);
    }
}

