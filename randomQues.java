import java.util.*;
public class randomQues {
    static int maxWater(int[] arr){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int amount=Math.min(arr[i],arr[j])*(j-i);
                res=Math.max(amount,res);            
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=maxWater(arr);
        System.out.println(res);
    }
}
