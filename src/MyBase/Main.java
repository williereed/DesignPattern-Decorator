package MyBase;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void TestBeverage(Beverage bev) {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        Soy soy = new Soy();
        Whip whip = new Whip();
        Milk milk = new Milk();
        Mocha mocha = new Mocha();

        System.out.println("drink = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.add(soy);
        System.out.println("+Soy  = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.add(whip);
        System.out.println("+Whip = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.add(milk);
        System.out.println("+Milk = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.add(mocha);
        System.out.println("+Mocha= " + bev.getDescription() + " $" + nf.format(bev.cost()));

        bev.remove(whip);
        System.out.println("-Whip = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.remove(mocha);
        System.out.println("-Mocha= " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.remove(soy);
        System.out.println("-Soy  = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.remove(milk);
        System.out.println("-Milk = " + bev.getDescription() + " $" + nf.format(bev.cost()));

        bev.add(soy, whip, milk, mocha);
        System.out.println("+all  = " + bev.getDescription() + " $" + nf.format(bev.cost()));
        bev.remove(soy, whip, milk, mocha);
        System.out.println("-all  = " + bev.getDescription() + " $" + nf.format(bev.cost()));

        System.out.println(" ");
    }

    public static void main(String[] args) {
        TestBeverage(new Espresso());
        TestBeverage(new DarkRoast());
        TestBeverage(new HouseBlend());
        TestBeverage(new Decaf());
    }
}
