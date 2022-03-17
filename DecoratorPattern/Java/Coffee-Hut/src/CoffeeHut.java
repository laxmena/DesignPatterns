import com.laxmena.beverage.Beverage;
import com.laxmena.beverage.DarkRoast;
import com.laxmena.beverage.Espresso;
import com.laxmena.beverage.HouseBlend;
import com.laxmena.beverage.condiments.Mocha;
import com.laxmena.beverage.condiments.Soy;
import com.laxmena.beverage.condiments.Whip;

// This Implementation is based on the example from HeadFirst Design Patterns book.
public class CoffeeHut {
    public static void main(String[] args) {
        // First Customer requests Espresso with no added condiments
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Second Customer requests double mocha whipped dark roast coffee
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2); // Decorator is used to add additional functionality
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // Third customer requests House Blend with Soy, Mocha and Whip
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
