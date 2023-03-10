package effectivejava.builderConstructor;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// Builder pattern for class hierarchies
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }
}


class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class MyPizzaBuilder extends Pizza.Builder<MyPizzaBuilder> {
        private final Size size;

        public MyPizzaBuilder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected MyPizzaBuilder self() {
            return this;
        }
    }

    private NyPizza(MyPizzaBuilder builder) {
        super(builder);
        size = builder.size;
    }
}

class Calzone extends Pizza {
    private final boolean sauceInside;


    public static class CalzoneBuilder extends Pizza.Builder<CalzoneBuilder> {
        private boolean sauceInside = false; // Default

        public CalzoneBuilder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected CalzoneBuilder self() {
            return this;
        }
    }

    private Calzone(CalzoneBuilder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}