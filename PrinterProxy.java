public class PrinterProxy implements Printer {
    @Override
    public void print(int amountOfPages) {
        Printer p = null;
        if(amountOfPages <= 0){
            System.out.println("Please more pages");
            return;
        }
        if(amountOfPages > 500){
            System.out.println("Toooooo much");
            return;
        }
        if(amountOfPages >= 50){
            p = new PrinterSW();
        }
        if(amountOfPages < 50){
            p = new PrinterColor();
        }

        p.print(amountOfPages);
    }
    public void print(int amountOfPages, PrinterType type) {
        Printer d = null;
        if(amountOfPages <= 0){
            System.out.println("noooo");
            return;
        }
        if(amountOfPages > 500){
            System.out.println("to much");
            return;
        }
        if(amountOfPages > 50){
            if(type != PrinterType.SW){
                System.out.println("Wrong Type 50 page too much");
                return;
            }
            d = new PrinterSW();
        }
        if(amountOfPages < 50){
                if(type != PrinterType.COLOR){
                    System.out.println("Wrong Type 50 too low");
                    return;
                }
                d = new PrinterColor();
            }


        d.print(amountOfPages);
    }
}