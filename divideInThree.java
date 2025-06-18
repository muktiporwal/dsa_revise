import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class divideInThree {
    public static int[][] divideArray(int[] nums, int k){
        Arrays.sort(nums);
        int n=nums.length;
        List<int[]> res=new ArrayList<>();
        for(int i=0;i<n;i+=3){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if(c-a>k){
                return new int[0][0];
            }
            res.add(new int[]{a,b,c});
        }
        return res.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        divideInThree sol=new divideInThree();
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        int[][] output=sol.divideArray(nums, k);
        if(output.length==0){
            System.out.println("[]");
        }
        else{
            for(int[] group:output){
                System.out.println(Arrays.toString(group));
            }
        }
    }
}
