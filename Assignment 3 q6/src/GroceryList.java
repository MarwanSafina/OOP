import java.util.ArrayList;
public class GroceryList
{
        private ArrayList<GroceryItemOrder> list;
        private int size;
        public GroceryList(){
            list = new ArrayList<>(10);
        }
        public void add(GroceryItemOrder x){
            if(size<10) {
                list.add(x);
            }
        }
        public double getTotalCost(){
            double total=0;
            for(GroceryItemOrder x: list){
                total+=x.getCost();
            }
            return total;
        }
    }

