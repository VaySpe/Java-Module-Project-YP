public class Product {
    String title; // название товара
    double price; // цена товара

    Product(String title, double price){
        this.title = title;
        this.price = Math.floor(price*100)/100; // Округляем число в меньшую сторону до двух знаков после запятой
    }
}
