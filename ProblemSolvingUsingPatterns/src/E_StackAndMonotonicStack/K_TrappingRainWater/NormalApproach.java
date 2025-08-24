package E_StackAndMonotonicStack.K_TrappingRainWater;

public class NormalApproach {

    public static void main(String[] args) {
        int ans = trap(new int[]{4,2,0,3,2,5});
        System.out.println(ans);
    }

    public static int trap(int[] height) {

        int ans = 0;
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        right[n - 1] = height[n-1];

        for(int i = 1;i<n;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }

        for(int i = n - 2;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        for(int i = 0 ;i<n;i++){
            int diff = Math.min(left[i],right[i]);

            if(diff > height[i]){
                ans = ans + diff - height[i];
            }
        }

        return ans;
    }
}
