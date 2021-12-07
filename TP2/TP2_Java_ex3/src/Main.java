import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert var1");
        int var1 = sc.nextInt();
        System.out.println("Insert var1");
        int var2 = sc.nextInt();
        Nombre nbr = new Nombre(var1, var2);

        System.out.println("Insert your operation (1=> division, 2 => racine carree: ");
        int operation = sc.nextInt();
        Operation op = new Operation(nbr);
        try {
            int result = operation == 1 ? op.division() : op.racineDeLaSomme();
            System.out.println(result);
        } catch (OperationException ex) {
            ex.printStackTrace();
        }

    }
}
