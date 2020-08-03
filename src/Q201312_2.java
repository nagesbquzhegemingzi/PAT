

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Q201312_2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String isbn=new String();
        String isbnold=(scanner.next());
isbn=isbnold.replace("-","");
int temp=0;
        for ( int i=0;i<9;i++){
           temp+= (isbn.charAt(i)-0x30)*(i+1);
        }
        temp%=11;


        if(temp==10){
            if (isbn.charAt(9)=='X') {
                System.out.println("Right");
            }
            else{
                System.out.println(isbnold.substring(0,isbnold.length()-1)+"X");

            }
        }
        else{
            if (isbn.charAt(9)-0x30==temp) {
                System.out.println("Right");
            }
            else{
                System.out.println(isbnold.substring(0,isbnold.length()-1)+temp);

            }
        }


    }






}
