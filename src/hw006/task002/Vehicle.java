package hw006.task002;

public class Vehicle {

    private final String title;
    private final String type;

    public Vehicle(String title, String type) {
        this.title = title;
        this.type = type;
    }

    void print() {
        System.out.printf("\nObject %s:\n1) title - %s;\n2) type - %s.", Vehicle.class.getSimpleName(), title, type);
    }

    static class Wheel {
        private final int radius;

        public Wheel(int radius) {
            this.radius = radius;
        }

        void print() {
            System.out.printf("\nObject %s (inner) of outer class %s object has tyre radius %d.",
                    Wheel.class.getSimpleName(), Vehicle.class.getSimpleName(), radius);
        }
    }

    static class Door {
        private final int size;

        public Door(int size) {
            this.size = size;
        }

        void print() {
            System.out.printf("\nObject %s (inner) of outer class %s object has door size %d.",
                    Door.class.getSimpleName(), Vehicle.class.getSimpleName(), size);
        }
    }
}
