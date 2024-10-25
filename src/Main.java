import java.util.Scanner;

public class Main {
    static double A, B, C, W, H;
    static String result;
    public static void main(String[] args) {

        setInfo();
        checkInfo();
        getInfo();
    }




    private  static void setInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height of brick");
         A = scan.nextDouble();
        System.out.println("Enter width of brick");
         B = scan.nextDouble();
        System.out.println("Enter length of brick");
         C = scan.nextDouble();
        System.out.println("Enter length of hole");
         W = scan.nextDouble();
        System.out.println("Ener width of hole");
         H = scan.nextDouble();
    }

    private static void checkInfo() {
        if (A<W&&B<H){
            result = "prohodit";
        }else {
            result = "ne prohodit";
        }
    }
    private static void getInfo() {
        System.out.println(result);
    }

}
