import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Adder adder1 = (Adder) Naming.lookup("rmi://localhost/AdderService1");
            Adder adder2 = (Adder) Naming.lookup("rmi://localhost/AdderService2");

            int[] a = {0, 1, 2, 3};
            int[] b = {-1, 1, 3, 6};

            int[] subarrayA1 = {a[0], a[1]};
            int[] subarrayB1 = {b[0], b[1]};

            int[] subarrayA2 = {a[2], a[3]};
            int[] subarrayB2 = {b[2], b[3]};

            int[] c1 = adder1.add(subarrayA1, subarrayB1);
            int[] c2 = adder2.add(subarrayA2, subarrayB2);

            System.out.println();
            for(int i = 0; i < c1.length; i++){
                System.out.print(c1[i] + " ");
            }
            for(int i = 0; i < c2.length; i++){
                System.out.print(c2[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
