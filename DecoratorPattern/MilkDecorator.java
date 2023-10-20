package DecoratorPattern;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with Milk";
    }
}