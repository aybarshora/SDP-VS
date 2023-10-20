import FactoryPatternAssignment.Shape;
import FactoryPatternAssignment.ShapeFactory;
import DecoratorPattern.*;

public class Main {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println("Cost: $" + basicCoffee.cost());
        System.out.println("Description: " + basicCoffee.getDescription());

        Coffee coffeeWithMilk = new MilkDecorator(basicCoffee);
        System.out.println("Cost: $" + coffeeWithMilk.cost());
        System.out.println("Description: " + coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.cost());
        System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription());
    }
}