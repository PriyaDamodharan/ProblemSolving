Statement : A thief has a bag that can hold K items. Find the items that the thief need to rob to get maximum profit.

Input:
Bag size K
Array of items

Test Case:
K = 3
Array {20,30,500,100,200,40,300,10,400)
//output 900

K = 4
{20,70,100,30,200,40,10,300,400};
//410


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = 4;
        int items[] = {20,70,100,30,200,40,10};
        int N = items.length;
        Arrays.sort(items);
        int price =0;
        for(int i = N-1;i>=N-K;i--){
            price += items[i];
        }
        System.out.println(price); 
}
}
