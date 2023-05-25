public class PrinterColor implements Printer {
    @Override
    public void print(int amountOfPages) {
        System.out.printf("Color", amountOfPages);
    }
}