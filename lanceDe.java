
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class lanceDe {

    public static void main(String[] args) {
        int de1=0;int i=1;int c=0;int d=0;int j=0; int h=0;int f=0;int  de11=0;
         de11 = 1+(int) (Math.random()*6);           
       System.out.println(de11);
       Scanner sc = new Scanner(System.in);
       System.out.println("entrer n:");
       int n=sc.nextInt();
        while(i<=n){
             de1=1+(int) (Math.random()*6);           
       System.out.println(de1);
                    i++;
        if(de1==6){ 
        c+=1;
         System.out.println("le nombre de lancers avant d'obtenir 6 est"+" "+ d);
         }if(de1!=6){
             
             d++;}}System.out.println("le nombre d'apparitions de la face 6 est"+" "+ c); 
 
      Scanner sc1 = new Scanner(System.in);
       System.out.println("entrer n:");
        int m=sc.nextInt();
     while(j<m){
         Random random = new Random();
     int pileOuFace = random.nextInt(2);
         if(pileOuFace==0){
             System.out.println("pile");
            
             f++;
             j++;}
         else{
            System.out.println("face"); 
           
            h++;
            j++;}
     }System.out.println("le nombre de face"+" "+h); 
     System.out.println("le nombre de pile"+" "+f);
  
    
    }}
