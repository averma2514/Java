package vowels;

public class RemoveVowels {
    
    void removevowels(String string){

        char[] st =string.toCharArray();
        
        System.out.print("After removing vowels : ");
        for (int i = 0; i < st.length; i++) {
            if(st[i]=='a' || st[i]=='e' || st[i]=='i' || st[i]=='o' || st[i]=='u' || st[i]=='A' || st[i]=='E' || st[i]=='I' || st[i]=='O' || st[i]=='U' ){
                continue;
            }else{
                System.out.print(st[i]);
            }
        }
    }
}