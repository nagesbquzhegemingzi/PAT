import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
//60 我真是吐了,也不给错误的测试用例,我人瓜了
//这个题是真你妈傻逼
public class Q201403_3 {
    public static ArrayList<String> noOptions = new ArrayList<String>();
    public static ArrayList<String> withOptions = new ArrayList<String>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.nextLine();
        if (pattern.charAt(pattern.length() - 1) != ':') {
            noOptions.add("-" + pattern.charAt(pattern.length() - 1));
        }
        for (int i = 0; i < pattern.length(); i++) {
            try {
                if (pattern.charAt(i + 1) != ':') {
                    noOptions.add("-" + pattern.charAt(i));
                } else {
                    withOptions.add("-" + pattern.charAt(i));
                    i++;
                }
            } catch (Exception e) {
                continue;
            }
        }
        ArrayList<String> cmd = new ArrayList<>();
        int index = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < index; i++) {
            String t = scanner.nextLine();
            if (cmd.indexOf(t) == -1) {
                cmd.add(t);
            }
        }
        for (int i = 0; i < cmd.size(); i++) {
            System.out.println("Case " + (i + 1) + ": " + parseCmd(cmd.get(i)));
        }
    }

    public static String parseCmd(String cmd) {
        // cmd=new StringBuffer(cmd).reverse().toString();
        // java Api真尼玛又臭又长
        // ArrayList<String> rtn = new ArrayList<>();
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        ArrayList<String> opts = new ArrayList<String>(Arrays.asList(cmd.split(" ")));
        for (int i = 1; i < opts.size() - 1; i++) {
            try {
                if (noOptions.indexOf(opts.get(i)) != -1) {
                    //  if(opts.get(i+1))
                    stringStringLinkedHashMap.put(opts.get(i), "");
                } else if (withOptions.indexOf(opts.get(i)) != -1) {
                    if (isValidParameter(opts.get(i + 1))) {
                        stringStringLinkedHashMap.put(opts.get(i), opts.get(i + 1));
                        i++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            if (stringStringLinkedHashMap.containsKey(String.valueOf('-') + i)) {
                String x, y;
                x = '-' + (String.valueOf(i));
                y = stringStringLinkedHashMap.get(x);
                if (y == "") {
                    stringBuilder.append(x + " ");
                } else {
                    stringBuilder.append(x + " " + y + " ");
                }
            }
        }
//        stringStringLinkedHashMap.forEach((x, y) -> {
//
//            //stringBuilder.append(x + " " + y + " "); 有错误,未考虑y为""时的情况
//            if(y==""){
//                stringBuilder.append(x + " ");
//            }
//            else {
//                stringBuilder.append(x + " " + y + " ");
//            }
//            //            stringBuilder.append(x + " " + y + y==""?"":" ");这句竟然不行,我真傻了
//        }
//        );
        return stringBuilder.toString();
    }

    public static boolean isValidParameter(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if (!((x.charAt(i) == '-') || (x.charAt(i) > 'a' && x.charAt(i) < 'z') || (x.charAt(i) > '0' && x.charAt(i) < '9'))) {
                return false;
            }
        }
        return true;
    }

    public static void test() {
        System.out.println("132");
    }
}
