package at.fhj.iit;

public class Cocktail {
    Drink drink=new Drink() {
        @Override
        public double getVolume() {
            return 0;
        }

        @Override
        public double getAlcoholPercent() {
            return 0;
        }

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    };
}
