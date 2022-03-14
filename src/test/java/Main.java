class Main {
    public static void main(String[] args) {
        Pizza pizza;
        pizza = zamowPizza("grecka");
        System.out.println(pizza.getOpis());

        pizza = zamowPizza("serowa");
        System.out.println(pizza.getOpis());

    }

    static Pizza zamowPizza(String type) {
        Pizza pizza;

        pizza = PizzaFactory.createPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();
        return pizza;

    }


}
