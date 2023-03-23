public class Main {
    public static void main(String[] args)
    {
        GroceryList l = new GroceryList();
        GroceryItemOrder Eggs = new GroceryItemOrder("eggs",5.45);
        Eggs.setQuantity(30);
        l.add(Eggs);
        GroceryItemOrder Cheese = new GroceryItemOrder("cheese",170);
        Cheese.setQuantity(1);
        l.add(Cheese);
        System.out.println(l.getTotalCost());
    }
}