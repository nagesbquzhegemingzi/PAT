import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Q201312_1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=(scanner.nextInt());


        ArrayList<Integer> values=new  ArrayList<Integer>();
        for (int i = 0; i <num ; i++) {
            values.add(scanner.nextInt());
        }

        Collections.sort(values);
        int times=0;
        int  temp=values.get(0);

        ArrayList<Integer> x1=new  ArrayList<Integer>();
        ArrayList<Integer> index=new  ArrayList<Integer>();

        for ( int i=0;i<values.size();i++){

            if (temp==values.get(i)){


                times++;
            }
            else {
                x1.add(temp);
                index.add(times);
                times=1;
                temp=values.get(i);


            }

        }
        x1.add(temp);
        index.add(times);
        temp=index.get(0);
        for (int i=0;i<index.size();i++){
            if (index.get(i)>temp) {
                temp=index.get(i);
            }
        }

        System.out.println(x1.get(index.indexOf(temp)));
    }



}