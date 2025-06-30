import java.util.Arrays;
import java.util.Scanner;

public class harmoniousSeq {
    public static int findLHS(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int longest=0;
        int i=0;
        for(int j=0;j<n;j++){
            while(nums[j]-nums[i]>1)
                i++;
            if(nums[j]-nums[i]==1){
                int len=j-i+1;
                if(len>longest){
                    longest=len;
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(findLHS(nums));
    }
}
