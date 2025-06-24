import java.util.*;
public class k_indexed {
    public List<Integer> findKDistant(int[] nums, int key, int k){
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i-k;
            boolean found=false;
            
            while(j<=i+k){
                if(j>=0 && j<nums.length && nums[j]==key){
                    found=true;
                    break;
                }
                j++;
            }
            if (found){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the key:");
        int key=sc.nextInt();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();

        k_indexed solve=new k_indexed();
        List<Integer> res=solve.findKDistant(nums, key, k);
        System.out.println(res);
    }
}
