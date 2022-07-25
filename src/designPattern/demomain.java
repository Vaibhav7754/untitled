package designPattern;

public class demomain {
    public static void main(String[] args) {
        BookShop bs = new BookShop();
        bs.setShopname("Novelty");

        bs.loadData();




        BookShop bs1 = new BookShop();

        bs1.setShopname("Novel");
        bs1.loadData();
        bs.getBooks().remove(2);
        System.out.println(bs);
        System.out.println(bs1);

    }
}
