Problem: Given an array consisting of cost of toys. 
Given an integer K depicting the amount of money available to purchase toys. 
Write a program to find the maximum number of toys one can buy with the amount K.

Note: One can buy only 1 quantity of a particular toy.

Examples :

Input:  N = 10, K =  50
        cost = { 1, 12, 5, 111, 200, 1000, 10, 9, 12, 15 }
Output: 6
Explanation: Toys with amount 1, 5, 9, 10, 12, and 12 
can be purchased resulting in a total amount of 49. Hence,
maximum number of toys is 6.

Input: N = 7, K = 50
       cost = { 1, 12, 5, 111, 200, 1000, 10 }
Output: 4



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //7
        int K = sc.nextInt(); //50
        int[] arr = { 1, 12, 5, 111,
                200, 1000, 10 };
        Arrays.sort(arr); //O(NlogN)
        int i = 0;
        int sum = 0;
        while (i < N && K > arr[i]){ //O(N)
            K -= arr[i];
        sum ++;
        i++;
    }
        System.out.println("The number of items bought are: "+sum); //prints 4

}
}

//Time Complexity: O(N*logN)  where N is the size of cost array.
//Space Complexity: O(1)
