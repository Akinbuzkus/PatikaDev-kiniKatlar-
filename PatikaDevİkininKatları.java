
import java.util.Scanner;


public class PatikaDevİkininKatları {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Please Enter the Number :");
        int number=scan.nextInt();
       
        
       /* for(int i=1;i<=number;i*=2){
           
            System.out.println(i); 
        }
*/      
       for(int i=1;i<number;i++){
           if(i%4==0 && i%5==0) // And operatoru ile yaparsak ikisinin ortak katlarını alır. Or operatoru ile yaparsak hem 4 hem 5 in katlarını yazdırır.
           {
               System.out.println(i);
           }
       }
        
    }
}
