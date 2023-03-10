package effectivejava.builderConstructor;

public class Calzone extends Pizza {
    private final boolean sauceInside;


    public static class CalzoneBuilder extends Builder<CalzoneBuilder> {
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
