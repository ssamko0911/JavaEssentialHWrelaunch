package taskadditional003.models;

public class Ticket {
    private long id;
    private String direction;
    private double price;

    public Ticket(long id, String direction, double price) {
        this.id = id;
        this.direction = direction;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Ticket.class.getSimpleName() + ": id = " + id + ", direction = " + direction + ", price = " + price;
    }
}
