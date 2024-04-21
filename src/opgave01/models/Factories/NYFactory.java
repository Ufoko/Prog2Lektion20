package opgave01.models.Factories;

import opgave01.models.pizzas.*;

public class NYFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        else {
            return null;
        }


        return pizza;
    }
}
