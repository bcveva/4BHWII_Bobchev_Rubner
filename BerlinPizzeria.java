public class BerlinPizzeria implements Pizzeria {
    public Pizza bestellen(String typ) {
        if (typ.equals("Salami")) {
            return new SalamiPizza();
        } else {
            System.out.println("Wir haben in Berlin keine " + typ + " Pizza.");
            return null;
        }
    }
}