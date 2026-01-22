package GreedyAlgos;
import java.util.*;
public class FractKnapsack { 
  static class Item {
    int weight;
    int profit;
    
    Item(int weight, int profit){
      this.weight = weight;
      this.profit = profit;
    
    }
  }

  public static double getMaxProfit(Item[] items, int capacity){
    Arrays.sort(items, (item1, item2) -> {
      double ratio1 = (double) item1.profit / item2.weight;
      double ratio2 = (double) item2.profit / item2.weight;
      return Double.compare(ratio2, ratio1); // descending order
    });
    double maxProfit = 0;
    for(Item item:items){
      if(item.weight <= capacity){
        capacity -= item.weight;
        maxProfit += item.profit;
      }else{
        double fraction = (double) (capacity/item.weight);
        maxProfit += fraction * item.profit;
    }
    }
    return maxProfit;
  }


  public static void main(String args[]){
    Item one = new Item(10,60);
    Item two = new Item(20,100);
    Item three = new Item(30,120);

    Item[] items = {one,two,three};
    int capacity = 50;
    System.out.println(getMaxProfit(items,capacity));
  }
}
