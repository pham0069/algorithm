package algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem
 *
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There
 * are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to
 * spend, and he wants to maximize the number of toys he buys with this money.
 *
 * Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy? For example, if
 * prices = [1, 2, 3, 4] and Mark has k=7 to spend, he can buy items [1, 2, 3] for 6, or [3, 4] for 7 units of currency.
 * He would choose the first group of 3 items.
 *
 * Input Format
 *
 * The first line contains two integers, n and k, the number of priced toys and the amount Mark has to spend.
 * The next line contains n space-separated integers
 *
 * Constraints
 * 1 <= n <= 10^5
 * 1 <= k <= 10^9
 * 1 <= prices[i] <= 10^9
 * A toy can't be bought multiple times.
 *
 * Output Format
 *
 * An integer that denotes the maximum number of toys Mark can buy for his son.
 *
 * Sample Input
 *
 * 7 50
 * 1 12 5 111 200 1000 10
 * Sample Output
 *
 * 4
 * Explanation
 *
 * He can buy only 4 toys at most. These toys have the following prices: 1, 12, 5, 10.
 *
 */
public class MarkAndToys {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int prices[]=new int[n];

        for(int i=0;i<n;i++)
            prices[i]=scanner.nextInt();

        // Compute the final answer from n,k,prices
        Arrays.sort(prices);
        int sum = 0, i = 0;
        while (i < n && sum + prices[i] < k){
            sum += prices[i];
            i++;
        }
        System.out.println(i);
    }
}
