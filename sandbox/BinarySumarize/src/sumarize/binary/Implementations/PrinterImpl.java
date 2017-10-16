package sumarize.binary.Implementations;

import sumarize.binary.Classes.Result;
import sumarize.binary.interfaces.Printer;

public class PrinterImpl implements Printer {
    public void print(Result z, String a) {
        System.out.print("Wynik działania w kodzie " + a + ": " + z.getDigit(31) + ".");
        for (int i = z.getDigit(32); i >= 0; i--) {
            System.out.print(z.getDigit(i));
        }
        System.out.println();

    }

}
