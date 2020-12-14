/*Given weights and values of n items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

In the 0-1 Knapsack problem, we are not allowed to break items. We either take the whole item or don’t take it. 

Input: 
Items as (value, weight) pairs 
arr[] = {{60, 10}, {100, 20}, {120, 30}} 
Knapsack Capacity, W = 50; 

Output: 
Maximum possible value = 240 
by taking items of weight 10 and 20 kg and 2/3 fraction 
of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240*/



//Auxillary space = O(1)
//Time Complexity = O(n*n)
        public class Main {
        public static void main(String[] args) {
        //Descending sort
        Scanner sc = new Scanner(System.in);
        int k = 50, thiefprofit = 0;
        int[] price = { 60, 40, 100, 120 };//{60, 120, 100};
        int[] weight = { 10, 40, 20, 30 };//{10, 30, 20};
        int len = price.length;
        Arrays.setAll(price, i -> price[i] / weight[i]); //O(n)
        System.out.println(Arrays.toString(price));
        while (k >= 0 && len > 0) { //O(n)
            int max = Arrays.stream(price).max().getAsInt();
            System.out.println(max);
            for (int i = 0; i < price.length; i++) { //O(n)
                if (price[i] == max) {
                    price[i] = 0;
                    if (k > weight[i]) {
                        thiefprofit += max * weight[i];
                        k -= weight[i];
                        break;
                    } else if(k < weight[i] || i == price.length - 1) {
                        thiefprofit += max * k;
                        k = 0;
                        break;
                    }
                }
                len--;
            }
        }
        System.out.println(thiefprofit); //output--240
    }
}
