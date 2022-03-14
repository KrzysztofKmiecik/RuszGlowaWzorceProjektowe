class PizzaFactory {


    public static Pizza createPizza(String type) {
        Pizza pizza=null;
        if (type.equals("serowa")) {
            pizza=new SerowaPizza();
        }else if (type.equals("grecka")){
            pizza =new GreckaPizza();
        }
        return pizza;
    }
}
