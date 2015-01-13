package MyBase;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class Beverage implements Item {
    private String description;
    private BigDecimal cost;
    private HashMap<Condiments, Condiment> condiments;

    protected Beverage(String description, BigDecimal cost) {
        this.description = description;
        this.cost = cost;
        condiments = new HashMap<Condiments, Condiment>();
    }

    public String getDescription() {
        if (condiments.isEmpty()) {
            return this.description;
        }

        StringBuilder sb = new StringBuilder(this.description);
        for (Condiment c : condiments.values()) {
            sb.append(", ").append(c.getDescription());
        }
        return sb.toString();
    }

    public BigDecimal cost() {
        if (condiments.isEmpty()) {
            return this.cost;
        }

        BigDecimal _temp = new BigDecimal(0).add(this.cost);
        for (Condiment c : condiments.values()) {
            _temp = _temp.add(c.cost());
        }
        return _temp;
    }

    public void add(Condiment... condiments) {
        for (Condiment condiment : condiments) {
            this.condiments.put(condiment.getType(), condiment);
        }
    }

    public void remove(Condiment... condiments) {
        for (Condiment condiment : condiments) {
            this.condiments.remove(condiment.getType());
        }
    }
}
