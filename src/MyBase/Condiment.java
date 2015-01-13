package MyBase;

import java.math.BigDecimal;

public abstract class Condiment implements Item {
    private Condiments type;
    private double price;

    protected Condiment(Condiments type, double price) {
        this.type = type;
        this.price = price;
    }

    public Condiments getType() {
        return type;
    }

    public String getDescription() {
        return type.getName();
    }

    public BigDecimal cost() {
        return new BigDecimal(price);
    }
}

enum Condiments {
    MILK ("Milk"), MOCHA ("Mocha"), SOY ("Soy"), WHIP ("Whip");

    private String name;

    Condiments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
