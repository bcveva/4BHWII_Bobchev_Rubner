public class PrinterSW implements Printer {
    @Override
    public void print(int amountOfPages) {
        System.out.printf("Black and White", amountOfPages);
    }
}
