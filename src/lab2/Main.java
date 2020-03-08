package lab2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int SIZE=10;
        int[] n = new int[SIZE]; 
        float sum = 0;
        int min=Integer.MAX_VALUE , max=0;
        Scanner  reader = new Scanner(System.in);
        for(int i=0; i<SIZE; i++){
           System.out.print("Number"+i+":");
           n[i]= reader.nextInt(); //nextInt รับค่าเลขจำนวนเต็ม
       
           if(n[i] > max){
               max = n[i];
           } 
           
           if(n[i] < min ){
               min = n[i];
           }
        }
        
        for(int i=0; i<SIZE; i++){
          System.out.print(n[i]+", ");
          sum=sum+n[i];  //sum+=n[i];
        } 
        System.out.println("Sum= "+sum);
        System.out.println("Average= "+(sum/SIZE));
        System.out.println("Min= "+min);
        System.out.println("Max= "+max);
    } 
}
