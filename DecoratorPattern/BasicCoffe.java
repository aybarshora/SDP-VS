package DecoratorPattern;

interface Coffee {
    double cost();

    String getDescription();
}

class BasicCoffe implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
}
