import java.math.BigDecimal;
import java.text.DecimalFormat;

public class JavaBasis {

    public static void main(String args[]){
        stringFormart();
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
        String ss = "11111111111";
        DecimalFormat decimalFormat = new DecimalFormat("###,####,####");
        BigDecimal bigDecimal = new BigDecimal(ss);
        String a = decimalFormat.format(bigDecimal);
        String b = a.replaceAll(","," ");
        System.out.println(a);
        System.out.println(b);
    }

}
