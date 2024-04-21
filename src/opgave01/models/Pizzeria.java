package opgave01.models;

import opgave01.models.pizzas.CheesePizza;
import opgave01.models.pizzas.GreekPizza;
import opgave01.models.pizzas.PepperoniPizza;
import opgave01.models.pizzas.Pizza;

public abstract class Pizzeria {



    public Pizza orderPizza(String type) {


        Pizza pizza = createPizza(type);




        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    public abstract Pizza createPizza(String type);

}
