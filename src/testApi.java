import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testApi {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            if (i==20){
                continue;


            }
            System.out.println(i);     System.out.println(i);
        }

    }

    /**
     *  交换列表成员
     * @param list
     * @param a
     * @param b
     */
    public  static  void  swapList(List list, int a, int b){
        Object o = new Object();
        o=list.get(a);
        list.set(a,list.get(b));
        list.set(b,o);
    }
}
