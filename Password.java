import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String a = sc.next();
        int b = a.length();
        if(b>=8 || b<=15){
            
           for(int i = 0 ; i<b;i++){
                   char c=a.charAt(i);

if(c>='a' || c<='z'){
    if(c>='A' || c<='Z'){
        if(c>=0 || c<=9){
            if(c=='$' || c=='%' || c=='@' || c=='#'){
                System.out.println("Your password is valid");
            }
        }
    }
}
   }System.out.println("Invalid password");

        }
        else{
            System.out.println("Your password invalid");
        }
    }
}
