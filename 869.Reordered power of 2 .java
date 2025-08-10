import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 31; i++) {
            int power = 1 << i;
            char[] arr = String.valueOf(power).toCharArray();
            Arrays.sort(arr);
            set.add(new String(arr));
        }
        char[] arrN = String.valueOf(n).toCharArray();
        Arrays.sort(arrN);
        return set.contains(new String(arrN));
    }
}
