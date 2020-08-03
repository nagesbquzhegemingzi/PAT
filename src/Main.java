import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> window = new ArrayList<>();
       ArrayList<Integer> priority = new ArrayList<>();
        ArrayList<Integer> dotcoordinate = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int wins = scanner.nextInt();
        int dots = scanner.nextInt();
        for (int i = 0; i < wins*4; i++) {
            window.add(scanner.nextInt());

        }
        for (int i = 0; i < dots * 2; i++) {
            dotcoordinate.add(scanner.nextInt());

        }
        for (int i = 0; i < wins; i++) {
           priority.add(i);
        }
        boolean isfound=false;
        for (int i = 0; i < dots; i++) {
            isfound=false;
            for (int j = wins-1; j >=0; j--) {

              int maxpriority=  priority.get(j);


                if (dotcoordinate.get(i*2)>=window.get(4*maxpriority)&&dotcoordinate.get(i*2)<=window.get(4*maxpriority+2)&&dotcoordinate.get(i*2+1)>=window.get(4*maxpriority+1)&&dotcoordinate.get(i*2+1)<=window.get(4*maxpriority+3)){
                    System.out.println(maxpriority+1);


                    Integer temp=maxpriority;
                    for (int k = j+1; k <wins; k++) {
                        priority.set(k-1,priority.get(k));
                    }
                    priority.set(wins-1,temp);
                    isfound=true;
                    break;

                }



            }

            if(!isfound){
                System.out.println("IGNORED");
            }
        }


    }
    public  static  void  swapList( List list,int a,int b){
        Object o = new Object();
        o=list.get(a);
        list.set(a,list.get(b));
        list.set(b,o);
    }
}



