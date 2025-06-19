import java.util.Arrays;
import java.util.Scanner;

public class partition {
    public static int partitionArray(int[] nums,int k){
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            int start=nums[i];
            count++;
            while(i<n && nums[i]-start<=k){
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        partition sp=new partition();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        System.out.println(partitionArray(nums,k));
    }
}
