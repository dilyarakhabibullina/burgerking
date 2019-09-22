public class Main {
    public static void main(String[] args) {
        Burger longer = new Burger();
        String name = "Longer BBC";
        int price = 55;
        String size = "Large";
        String photo = "https://www.kfc.ru/foodorder/product/1018";
        String description = "Best burger of the world";
        int calories = 233;
        int fat = 34;
        int carbohydrates = 56;
        int protein = 78;
        System.out.println(name);
        System.out.println(size);
        System.out.println(description);

        Burger hotDog = new Burger();
        name = "Hot Dog";
        price = 79;
        size = "Medium";
        photo = "https://www.kfc.ru/foodorder/product/2379";
        description = "Best hotdog of the world, very spicy";
        calories = 132;
        fat = 43;
        carbohydrates = 65;
        protein = 87;
        System.out.println(name);
        System.out.println(description);
    }
}
