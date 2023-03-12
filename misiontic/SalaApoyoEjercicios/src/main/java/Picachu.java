public class Picachu {

//    public static String picachu(int n, String s){
//        switch(n){
//            case 1:
//                s+="";
//                break;
//            case 2:
//                s+="pica ";
//            case 3:
//                s+="pica pica ";
//            case 4:
//                s+="pica pica pi ";
//            default:
//                s+=picachu(n-1,s);
//                
//        }
//        package arreglos;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// *
// * @author USUARIO
// */
//public class Arreglos {

//    public static String picachu(int n,String s){
//              if(n==1) return s+="";
//              if(n==2) return s+="pica";
//              if(n==3) return s+="pi";
//              if(n==4) return s+=
//              else return s+=picachu(n-1,s);
//                  
//                          
//        }
    public static String picachu(int n, String s){
              if(n==1) return "";
              else {
                  if(n%2==0) s+="pica ";
                  if(n%2!=0) s+="pi ";
                  return s+=picachu(n-1,s);
              }
       
        }
    public static String picachu(int n){
        String s="";  
        for (int i = 1; i < n; i++) {
            if(i==1) s+= "";
              else {
                  if(i%2==0) s+="pica ";
                  if(i%2!=0) s+="pi ";
                  
              }
          
        }
        return s;
            
       
        }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("pica " + picachu(100) + " chu");
        String arr[]= sc.nextLine().split(" ");
    }
    
}
