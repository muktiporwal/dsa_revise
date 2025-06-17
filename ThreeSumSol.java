import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSumSol {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) 
                        left++;
                    while (left < right && nums[right] == nums[right - 1]) 
                        right--;
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(threeSum(nums));
    }
}
