public class day1{
    public static int duplicate(int [] arr){
        int n=arr.length;
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr2[i]=arr[i];
                }
            }
        }
        int size=arr2.length;
        if(size>=1){
            for(int i=0;i<size;i++){
                if(arr2[i]>0){
                    System.out.print(arr2[i]+" ");
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,6,3,6,1};
        duplicate(arr);
    }
}
/*public class day1{
    public static void best(int[] prices){
        if(prices==null || prices.length<2){
            System.out.println("No profit possible");
            return;

        }
        int minprice=prices[0];
        int maxprofit=0;
        int buyprice=prices[0];
        int sellprice=prices[0];

        for(int i=0;i<prices.length;i++){
            int price=prices[i];
            if(price<minprice){
                minprice=price;
            }
            int profit=price-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
                buyprice=minprice;
                sellprice=price;
            }
        }
        if(maxprofit>0){
            System.out.println("Buy at: "+buyprice);
            System.out.println("Sell at: "+sellprice);
            System.out.println("Profit: "+maxprofit);
        }
        else{
            System.out.println("No profit possible.");
        }
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the 'length of array: ");
        int n=x.nextInt();
        int [] prices=new int [n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            prices[i]=x.nextInt();
        }
        best(prices);
    }
}

import java.util.Scanner;
public class day1{
    static boolean twosum(int[] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the lenght of the array: ");
        int num=x.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<num;i++){
            arr[i]=x.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target=x.nextInt();
        if(twosum(arr,target))
            System.out.println("True");
        else
            System.out.println("False");
    }
}*/