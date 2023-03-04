import java.util.Scanner;

public class Groot {
    
    public static String wordsGroot(int n){
        String a = "";
        for (int i = 1; i < n; i++){
            if(i == 1) a+="";
            if(i%2 == 0) a+=" that I am";
            if(i%2 != 0) a+=" that I groot";
           
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        System.out.println("I am" + wordsGroot(n)+ " it");
    }
    
}