/**
 * HackerRank
 * challenge: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */

package self.practise;

public class ArrayRotation {

    public static void main(String[] args) {
        int k = 4;
        int a[] = {1, 2, 3, 4, 5};
        if(k>=1 && k<=a.length) {
            for(int x=1; x<=k; x++) {
                int temp = a[0];
                for(int i=0; i<a.length-1; i++) {
                    a[i] = a[i+1];
                }
                a[a.length-1] = temp;
            }
            for(int i=0; i<a.length; i++) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
