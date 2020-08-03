import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q201312_3 {

    public  static  int max=0;


    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        for (int i=0;i<length;i++){
            height.add(scanner.nextInt());

        }
        area(height);



        System.out.println(max);

    }
    public  static  void area(List<Integer> height){
        if(Collections.max(height)*height.size()<max)
        {
            return;
        }
        if (height.size()==1){

            if(height.get(0)>max) {
                max=height.get(0);
            }
            return;

        }


        if(Collections.min(height)*height.size()>max){
            max=Collections.min(height)*height.size();
        }
        if(height.get(0)<height.get(height.size()-1)){

            area((List<Integer>) height.subList(1,height.size()));
        }
        else if(height.get(0)>height.get(height.size()-1)){

            area((List<Integer>) height.subList(0,height.size()-1));
        }

        else {
            area((List<Integer>) height.subList(0,height.size()-1));
            area((List<Integer>) height.subList(1,height.size()));
        }



    }
}
