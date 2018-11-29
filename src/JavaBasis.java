public class JavaBasis {

    public static void main(String args[]){
        eques();
    }

    public static void eques(){
        int a = 1000;
        System.out.println(a == a);

        int boxedA = a;
        int otherBoxedA = a;
        System.out.println( boxedA == otherBoxedA);
    }

}
