public class HamburgPizzeria implements Pizzeria {
    public Pizza bestellen(String typ) {
        if (typ.equals("Hawaii")) {
            return new HawaiiPizza();
        } else {
            System.out.println("Wir haben in Hamburg keine " + typ + " Pizza.");
            return null;
        }
    }
}