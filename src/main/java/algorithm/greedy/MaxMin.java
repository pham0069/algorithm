package algorithm.greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-children/problem
 *
 * You will be given a list of integers, arr, and a single integer k. You must create an array of length k from elements
 * of arr such that its unfairness is minimized. Call that array subarr. Unfairness of an array is calculated as:
 * max(subarr) - min(subarr)
 * Where:
 * - max denotes the largest integer in subarr
 * - min denotes the smallest integer in subarr
 *
 * As an example, consider the array {1, 4, 7, 2}  with k=2. Pick any two elements, test subarr = {4, 7}. unfairness =
 * 7 - 4 = 3. Testing for all pairs, the solution [1, 2]  provides the minimum unfairness.
 * Note: Integers in  may not be unique.
 *
 * Input Format
 *
 * The first line contains an integer n, the number of elements in array arr.
 * The second line contains an integer k.
 * Each of the next n lines contains an integer arr[i] where 0 <= i < n.
 *
 * Constraints
 * 2 <= n <= 10^5
 * 2 <= k <= n
 * 0 <= arr[i] <= 10^9
 *
 * Output Format
 *
 * An integer that denotes the minimum possible value of unfairness.
 *
 * Sample Input 0
 *
 * 7
 * 3
 * 10
 * 100
 * 300
 * 200
 * 1000
 * 20
 * 30
 * Sample Output 0
 *
 * 20
 * Explanation 0
 *
 * Here k=3; selecting the  3 integers 10, 20, 30, unfairness equals 30 - 10 = 20
 *
 * Sample Input 1
 *
 * 10
 * 4
 * 1
 * 2
 * 3
 * 4
 * 10
 * 20
 * 30
 * 40
 * 100
 * 200
 * Sample Output 1
 *
 * 3
 * Explanation 1
 *
 * Here k=4; selecting the 4 integers 1, 2, 3, 4, unfairness equals max(1,2,3,4) - min(1,2,3,4) = 4 - 1 = 3
 * Sample Input 2
 *
 * 5
 * 2
 * 1
 * 2
 * 1
 * 2
 * 1
 * Sample Output 2
 *
 * 0
 * Explanation 2
 *
 * Here k=2. [2, 2] or [1, 1]  give the minimum unfairness of 0.
 */
public class MaxMin {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int unfairness = Integer.MAX_VALUE;
        for (int i = 0; i <= n-k; i++){
            int temp = array[i+k-1] - array[i];
            if (temp < unfairness)
                unfairness = temp;
        }
        System.out.println(unfairness);
    }
}
