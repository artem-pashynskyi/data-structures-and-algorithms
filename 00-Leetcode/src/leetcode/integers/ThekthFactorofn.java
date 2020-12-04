package leetcode.integers;

import java.util.ArrayList;

public class ThekthFactorofn {
    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
    }
    /*
        Input: n = 12, k = 3
        Output: 3
        Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
     */
    public static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++) {
            if(n % i == 0)
                list.add(i);
        }
        if(list.size() >= k)
            return list.get(k-1);
        return -1;
    }
}
