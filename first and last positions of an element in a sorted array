/*Given a sorted array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array. 
Examples: 

Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}    
        x = 5
Output : First Occurrence = 2
         Last Occurrence = 5

Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }    
        x = 7
Output : 
         First Occurrence = 6
         Last Occurrence = 6


Time Complexity : O(log n) 
Auxiliary Space : O(1)  */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = arr.length;
        int k = 5;
        System.out.println(left(arr,n,k)); //O(logn)
        System.out.println(right(arr,n,k)); //O(logn)


}
public static int left(int[] arr,int n,int x) {
    int start = 0, end = n - 1, res = -1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] > x) end = mid - 1;
        else if (arr[mid] < x) start = mid + 1;
        else {
            res = mid;
            end = mid - 1;

        }
    }
    return res;
}
    public static int right(int[] arr,int n,int x){
        int start = 0, end = n - 1, res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > x) end = mid - 1;
            else if (arr[mid] < x) start = mid + 1;
            else {
                res = mid;
                start = mid+1;
            }
            }
        return res;
        }
    }

