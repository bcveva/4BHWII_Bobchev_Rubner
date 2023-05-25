public class Main {
    public static void main(String[] args) {
        PrinterProxy proxy = new PrinterProxy();

        proxy.print(503);
        proxy.print(-10);
        proxy.print(80);
        proxy.print(5);
        proxy.print(20, PrinterType.SW);
        proxy.print(55, PrinterType.COLOR);
    }
}

