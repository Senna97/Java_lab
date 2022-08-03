package chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {
        int iNum = 1000;
        byte bNum = (byte)iNum;

        System.out.println(iNum); //1000
        System.out.println(bNum); //-24: 자료의 손실

        double dNum = 3.14;
        float fNum = 0.9F;

        iNum = (int)dNum;
        System.out.println(iNum); //3

        int num1 = (int)dNum + (int)fNum;
        int num2 = (int)(dNum + fNum);

        System.out.println(num1); //3
        System.out.println(num2); //4
    }
}
