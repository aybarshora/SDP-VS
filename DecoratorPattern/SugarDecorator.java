package DecoratorPattern;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with Sugar";
    }
}
