package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc(); //type 상속
//        = Calculator calc = new CompleteCalc();
//        = CompleteCalc calc = new CompleteCalc();

//        Calc calc1 = new Calc(); //인터페이스이기 때문
//        Calc calc2 = new Calculator(); //추상 클래스이기 때문

        System.out.println(calc.add(num1, num2));
//        calc.showInfo();
    }
}
