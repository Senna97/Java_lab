package innerclass;

class OutClass {
    private int num = 10; //인스턴스 변수
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {
        int inNum = 200;
//        static int sInNum = 100;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

//        static void sTest() {
//        }
    }

    public void usingInTest() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100; //인스턴스 변수
        static int sInNum = 200;

        void inTest() {
//            num += 10;
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
//            System.out.println(iNum);
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
       outClass.usingInTest();

       OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
       sInClass.inTest();
    }
}
