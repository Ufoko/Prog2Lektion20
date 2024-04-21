package opgave01.models.Stores;

import opgave01.models.Factories.PizzaFactory;
import opgave01.models.Pizzeria;
import opgave01.models.pizzas.Pizza;

public class NYStore extends Pizzeria {


    PizzaFactory fac;

    public NYStore(PizzaFactory fac) {
        this.fac = fac;
    }

    @Override
    public Pizza createPizza(String type) {


       Pizza piz = fac.createPizza(type);

        return piz;
    }
}
