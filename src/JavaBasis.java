import com.sun.xml.internal.ws.util.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class JavaBasis {

    public static void main(String args[]){
//        stringFormart();
        forFun();
    }

    public static void eques(){
        int a = 1000;
        System.out.println(a == a);

        int boxedA = a;
        int otherBoxedA = a;
        System.out.println( boxedA == otherBoxedA);
    }

    public static void stringFormart(){
        String content = "15199278224903843804387";
        content = content.replaceAll("(?<=^\\d{3})"," ");
        content = content.replaceAll("(\\d{4})(?!$)","$1 ");
        System.out.println(content);
        String ss = "11111111111111";
        DecimalFormat decimalFormat = new DecimalFormat("###,####,####");
        BigDecimal bigDecimal = new BigDecimal(ss);
        String a = decimalFormat.format(bigDecimal);
        String b = a.replaceAll(","," ");
        System.out.println(a);
        System.out.println(b);
    }

    public static void forFun(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i + "");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i % 2);
            if (i / 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(String.join(",",list));
    }


}
