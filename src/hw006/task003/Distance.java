package hw006.task003;

public class Distance {
    double distance;

    public Distance(double distance) {
        this.distance = distance;
        System.out.printf("Object %s has created.", Distance.class.getSimpleName());
    }

    void print() {
        System.out.printf("\nCurrent distance is %.2f cm.", distance);
    }

    static class Converter {
        public static void convertToDM(double distance) {
            System.out.printf("\nDistance in dcimeters is %.2f dm.", distance / 10);
        }

        public static void convertToM(double distance) {
            System.out.printf("\nDistance in meters is %.2f m.", distance / 100);
        }

        public static void convertToKm(double distance) {
            System.out.printf("\nDistance in kilometers is %.2f km.", distance / 100000);
        }

        public static void convertToMiles(double distance) {
            System.out.printf("\nDistance in miles is %.2f mi.", distance / 160934.4);
        }
    }
}
