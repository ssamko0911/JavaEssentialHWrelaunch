package hw007.task003.models;

public class Price {
    private String itemTitle;
    private String shopTitle;
    private int priceTag;

    public Price(String itemTitle, String shopTitle, int priceTag) {
        this.itemTitle = itemTitle;
        this.shopTitle = shopTitle;
        this.priceTag = priceTag;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public int getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(int priceTag) {
        this.priceTag = priceTag;
    }

    @Override
    public String toString() {
        return String.format("We have itemTitle - %s, shopTitle - %s and price - %d.", itemTitle, shopTitle, priceTag);
    }
}
