public class RostcokPizzeria implements Pizzeria {
    public Pizza bestellen(String typ) {
        if (typ.equals("Calzone")) {
            return new CalzonePizza();
        } else {
            System.out.println("Wir haben in Rostock keine " + typ + " Pizza.");
            return null;
        }
    }
}