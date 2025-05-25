public class day3 {
    public int longestPalindrome(String[] words){
        int[][] count=new int [26][26];
        int length=0;
        for(String word:words){
            int a=word.charAt(0)-'a';
            int b=word.charAt(1)-'a';

            if(count[b][a]>0){
                count[b][a]--;
                length+=4;
            }
            else{
                count[a][b]++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i][i]>0){
                length+=2;
                break;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        day3 solution=new day3();
        String[] words1={"lc","cl","gg"};
        System.out.println(solution.longestPalindrome(words1));
    }
}
