package loopexample;

public class BreakExample {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while(true) {
            sum += num;

            if (sum > 100)
                break; //break문이 없으면 num++이 진행돼버려서 num = 15가 된다.
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
