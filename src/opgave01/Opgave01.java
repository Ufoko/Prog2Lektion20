package opgave01;

import opgave01.models.Factories.NYFactory;
import opgave01.models.Factories.PizzaFactory;
import opgave01.models.Pizzeria;
import opgave01.models.Stores.NYStore;

public class Opgave01 {
    public static void main(String[] args) {
        Pizzeria pizzaria = new NYStore(new NYFactory());
        pizzaria.orderPizza("pepperoni");
        pizzaria.orderPizza("veggie");
    }

}
