package anagram;
import java.util.Arrays;

public class CheckAnagram {    
    public boolean check(String string1,String string2 ) {
        
        if(string1.length()!=string2.length()){
            return false;
        }

        //step 1
        char[] str1 = string1.toCharArray();
        char[] str2 = string2.toCharArray();
    
        //step 2
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        //step 3
        return Arrays.equals(str1, str2);
    }
}
