package effectivejava.builderConstructor;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class MyPizzaBuilder extends Builder<MyPizzaBuilder> {
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
