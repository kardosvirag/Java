
package alkoholkalkulator;

import java.util.Scanner;


public class ItalVezerlo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ember bekerEmber = new Ember();
        System.out.print("Hogy hívnak? ");
        bekerEmber.nev = sc.nextLine();
        System.out.print("Hány kiló vagy? ");
        bekerEmber.kilogramm = sc.nextInt();
        System.out.println("Mit csinálsz?");
        System.out.println("1 - iszol");
        System.out.println("2 - pihensz");
        System.out.println("3 - kilépsz");
        int csinal = sc.nextInt();
       
        
        while (csinal < 4 && csinal > 0) {

            switch (csinal) {
                case 1:
                    sc.nextLine();
                    Ital bekerItal = new Ital();
                    System.out.print("Mit iszol? ");
                    bekerItal.nev = sc.nextLine();
                    System.out.print("Hány százalékos alkoholtartalmú? ");
                    bekerItal.szazalek = sc.nextDouble();
                    System.out.print("Mennyit iszol belőle? ");
                    bekerItal.ml = sc.nextInt();
                    bekerEmber.megiszik(bekerItal);
                    System.out.print(bekerEmber.nev + " véralkoholszintje: ");
                    System.out.printf("%.2f", bekerItal.getAlkoholGramm());
                    System.out.print(" gramm, azaz ");
                    System.out.printf("%.2f", bekerEmber.veralkoholEzrelek());
                    System.out.println(" ezrelék.");
                    System.out.println("Mit csinálsz?");
                    System.out.println("1 - iszol");
                    System.out.println("2 - pihensz");
                    System.out.println("3 - kilépsz");
                    csinal = sc.nextInt();
                    break;

                case 2:
                    System.out.print("Mennyit pihensz? ");
                    double ora = sc.nextDouble();
                    bekerEmber.pihen(ora);
                    System.out.print(bekerEmber.nev + " véralkoholszintje: ");
                    System.out.printf("%.2f", bekerEmber.alkoholGramm());
                    System.out.print(" gramm, azaz ");
                    System.out.printf("%.2f", bekerEmber.veralkoholEzrelek());
                    System.out.println(" ezrelék.");
                    System.out.println("Mit csinálsz?");
                    System.out.println("1 - iszol");
                    System.out.println("2 - pihensz");
                    System.out.println("3 - kilépsz");
                    csinal = sc.nextInt();
                    break;

                case 3:

                    System.out.print(bekerEmber.nev + " véralkoholszintje: ");
                    System.out.printf("%.2f", bekerEmber.getJozanIdo()* 9);
                    System.out.print(" gramm, azaz ");
                    System.out.printf("%.2f", bekerEmber.veralkoholEzrelek());
                    System.out.println(" ezrelék.");
                    System.exit(0);
                    System.out.println("Mit csinálsz?");
                    System.out.println("1 - iszol");
                    System.out.println("2 - pihensz");
                    System.out.println("3 - kilépsz");
                    csinal = sc.nextInt();
                    break;
            }

        }
    }

}
