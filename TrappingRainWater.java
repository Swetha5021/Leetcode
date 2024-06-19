//Two pointer approach
//Time: O(n)
//space: O(1)
class Solution{

    static int maxWater(int[] arr, int n) {

        int left = 0;
        int right = n - 1;
        int l_max = 0;
        int r_max = 0;
        int result = 0;

        while (left <= right) {
            if (r_max <= l_max) {
                result += Math.max(0, r_max - arr[right]);
                r_max = Math.max(r_max, arr[right]);
                right -= 1;
            } else {
                result += Math.max(0, l_max - arr[left]);
                l_max = Math.max(l_max, arr[left]);
                left += 1;
            }
        }
        return result;
    }
}
