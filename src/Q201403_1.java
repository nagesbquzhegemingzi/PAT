import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q201403_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            values.add(scanner.nextInt());
        }

        int size=values.size();
        int rtn=0;
        Collections.sort(values, Collections.reverseOrder());
        if (values.get(size-1)>=0)
        {
            System.out.println("0");
            return;
        }
        for (int i = 0; i < values.size()&&values.get(i)>0; i++) {

            for (int j=size-1;values.get(i)<=Math.abs(values.get(j))&&values.get(j)<0;j--)
            {
                if(values.get(i)==0-values.get(j))
                {
                    rtn++;
                }
            }
        }
        System.out.println(rtn);
    }
}
