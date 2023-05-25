public class Main {
    public static void main(String[] args) {
        Pizzeria berlinPizzeria = new BerlinPizzeria();
        Pizzeria hamburgPizzeria = new HamburgPizzeria();
        Pizzeria rostockPizzeria = new RostcokPizzeria();

        Pizza salamiPizza = berlinPizzeria.bestellen("Salami");
        Pizza hawaiiPizza = hamburgPizzeria.bestellen("Hawaii");
        Pizza calzonePizza = rostockPizzeria.bestellen("Calzone");

        salamiPizza.backen();
        salamiPizza.schneiden();
        salamiPizza.einpacken();

        hawaiiPizza.backen();
        hawaiiPizza.schneiden();
        hawaiiPizza.einpacken();

        calzonePizza.backen();
        calzonePizza.schneiden();
        calzonePizza.einpacken();
    }
}