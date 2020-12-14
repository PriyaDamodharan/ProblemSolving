/*Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.
Example:

Input matrix
0 1 1 1
0 0 1 1
1 1 1 1  // this row has maximum 1s
0 0 0 0

Output: 2

*/


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //row with max no of ones in a matrix
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        for (int i = 0; i < m; i++) { //O(m)
            for (int j = 0; j < m; j++) { //O(m)
                mat[i][j] = sc.nextInt();
            }
        }
        //Prints the matrix
        System.out.println(Arrays.deepToString(mat));
        maxOnes(mat, m);

    }

    public static void maxOnes(int mat[][], int m) {
        int row = 0,index = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) { //)(n)
            int val = firstOneIndex(mat[i],m); //O(logm)  Total time - O(nlogm)
            System.out.println(val);
            if(val!=-1 && val < index){
                index = val;
                row = i;}
        }
        System.out.println("The row with maximum ones is: " +row);
    }

    public static int firstOneIndex(int[] arr, int m) {
        int start = 0, end = m - 1, ind = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == 0) start = mid + 1;
            else if (arr[mid] == 1){
                ind = mid;
                end = mid - 1;}
        }
        return ind;

    }
}

