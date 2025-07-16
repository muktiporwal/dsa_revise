import java.util.*;
class validWord {
    public static boolean isValid(String word) {
        if(word.length()<3)
            return false;
        boolean hasVowel=false;
        boolean hasConsonant=false;
        for(char c: word.toCharArray()){
            if(!Character.isLetterOrDigit(c))
                return false;
            if("aeiouAEIOU".indexOf(c)!=-1){
                hasVowel=true;
            }
            else if(Character.isLetter(c)){
                hasConsonant=true;
            }
        }
        return hasVowel && hasConsonant;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String word=sc.next();
        boolean res=isValid(word);
        System.out.println(res);
    }
}