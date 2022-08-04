package generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
        printerPowder.setMaterial(new Powder());
        Powder powder = printerPowder.getMaterial();
        System.out.println(printerPowder);

        ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        System.out.println(printerPlastic);

//        ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
//        printerWater.setMaterial(new Water());
//        System.out.println(printerWater);} // Material 클래스를 상속받지 않았기 때문에 사용할 수 없다.

        printerPlastic.printing();
        printerPowder.printing();
    }
}
