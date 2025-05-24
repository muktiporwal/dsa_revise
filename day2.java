import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class day2{
    public static List<Integer> findwords(String [] words, char x){
        List<Integer> indices= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                indices.add(i);
            }
        }
        return indices;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        System.out.print("Enter the character to search for: ");
        char x = sc.next().charAt(0);
        List<Integer> result = findwords(words, x);

        if (result.isEmpty()) {
            System.out.println("No words contain the character '" + x + "'.");
        } else {
            System.out.println("Indices of words containing '" + x + "': " + result);
        }

        sc.close();



    }
}
/*public class day2 {
    public static List<List<Integer>> ZerosumTriplet(int [] arr){
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left + 1]) 
                        left++;
                    while (left < right && arr[right] == arr[right - 1]) 
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
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=x.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
        }
        List<List<Integer>> triplets=ZerosumTriplet(arr);
        if(triplets.isEmpty()){
            System.out.println("No triplet found");
        }
        else{
            for(List<Integer> triplet: triplets){
                System.out.println(triplet);
            }
        }
        x.close();
    }
}
*/
