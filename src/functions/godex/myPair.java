package functions.godex;

/**
 * Created by godex on 24.03.2015.
 */
public class myPair {
        private Double key;
        private Double value;

        public myPair(Double aKey, Double aValue) {
            key = aKey;
            value = aValue;
        }

        public Double key() {
            return key;
        }

        public Double value() {
            return value;
        }

    @Override
    public String toString() {
        return new String("Key="+key+" Val="+value);
    }
}

