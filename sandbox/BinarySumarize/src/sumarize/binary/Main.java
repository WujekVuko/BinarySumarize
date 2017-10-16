package sumarize.binary;
/** Program konwertuje liczby dzisiętne na binarne w 3 kodowaniach ZM, ZU1, ZU2
 * @version 1.00
 * @author Wujek Vuko
 * @param a pierwsza liczba dziesiętna
 * @param b druga liczba dziesiętna
 * @param c tablica z nazwami poszczególnych kodowań
 * @param modulus cyfra 1 odpowiada dodawaniu, cyfra -1 odpowiada odejmowaniu
 * @param first - większa bezwględna wartość z liczb a i b w kodzie binarnym
 * @param second - mniejsza bezwzględna wartość z liczb a i b w kodzie binarnym
 */

import sumarize.binary.Classes.Result;
import sumarize.binary.Classes.ResultZU1;
import sumarize.binary.Classes.ResultZU2;
import sumarize.binary.Implementations.*;
import sumarize.binary.Classes.Binary;
import sumarize.binary.interfaces.Printer;
import sumarize.binary.interfaces.Sum;
import sumarize.binary.interfaces.Z;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner in = new Scanner(System.in);
        Scanner ina = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int a = in.nextInt();
        System.out.println("Podaj działanie (dodawanie: +; odejmowanie: -): ");
        String symbol = ina.nextLine();
        /** jeżeli działanie jest odejmowaniem to
         * druga liczba zmieni znak
         */
        int modulus = 1;
        if (symbol.equals("-")) {
            modulus = -1;
        }
        String[] c = {"ZM", "ZU1", "ZU2"};

        System.out.println("Podaj drugą liczbę całkowitą: ");
        int b = in.nextInt() * modulus;

        Z z = new ZM();
        Binary first = Math.abs(a) > Math.abs(b)? z.changeToBinary(a) : z.changeToBinary(b);
        Binary second = Math.abs(a) <= Math.abs(b)? z.changeToBinary(a) : z.changeToBinary(b);

        Sum sumzm = new SumZM();
        Result zm = sumzm.result(first.clone(),second.clone());

        Printer print = new PrinterImpl();
        print.print(zm, c[0]);

       Sum sumzu1 = new SumZU1();
       ResultZU1 zu1 = (ResultZU1) sumzu1.result(first.clone(),second.clone());

       print.print(zu1,c[1]);

       Sum sumzu2 = new SumZU2();
       ResultZU2 zu2 = (ResultZU2) sumzu2.result(first,second);

       print.print(zu2, c[2]);
    }
}
