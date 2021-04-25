package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //public static void main(String[] args) {
    //System.out.println("Hello Java world\n");
    //}
    //System.out.print("Ala\n");
    //System.out.print("ma\n");
    //System.out.print("kota\n");
    //}
    //int a = 3;
    //double b = 4.21;
    //String s = "jakis tekst";
/****                ****/
    //System.out.printf("a = %d, b = %f, s = %s %n", a, b, s);
    //System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);
    //System.out.printf("alfa\tsin(alfa)\n");
    //for (int i = 0; i < 370; i+=10)
    //System.out.printf("%d\t%f\t\n",i, Math.sin(i/360.0*2*Math.PI));
    //Scanner input = new Scanner(System.in);
    //int num1 = 0, num2 = 0;
//System.out.print("Podaj pierwsza liczbe: ");
//num1 = input.nextInt();
//System.out.print("Podaj druga liczbe:");
//num2 = input.nextInt();
//System.out.printf("Wynik dodawania %d + %d = %d%n", num1,num2,num1+num2);
    //do {
    //System.out.print("Podaj pierwsza liczbe:");
    //num1 = input.nextInt();
    //if (num1 != 0) {
    //if (num1 == 0) break;
    //System.out.print("Podaj druga liczbe:");
    //num2 = input.nextInt();
    //if (num1 == 0) break;
    //1}
    //System.out.print("Podaj liczbe ktore mam dodac:");
    //num1 = input.nextInt();
    //num2 = input.nextInt();
    //if ((num1 == 0)||(num2 ==0));
    //System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
    //} while ((num1 != 0) && (num2 != 0));
    //}while (true);
    //}
/***   ****/
//private static String leftPad(String aText, char aChar, int aWidth) {
    //String res = aText;
    //for (int i = 0; i < aWidth - aText.length(); i++)
    //res = aChar + res;
    //return res;

    //int[] liczby = new int[30];
    // Random rnd = new Random();

    //for (int i = 0; i < 30; i++)
    //liczby[i] = rnd.nextInt();

    //int mx = Integer.MIN_VALUE;
    //int mn = Integer.MIN_VALUE;
    //long avg = 0;
    //for (int 1:liczby)
    //{
    //System.out.println(1);
    //if (1 < mn) mn = 1;
    //if (1 > mx) mx = 1;
    //avg += 1;
    //}
    //System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float) avg / liczby.length);
//}

    /*** ****/
    //public static void main(String[] args){numer();}
    //public static String toHex(int val){
    //    var res = Integer.toHexString(val);
    //    return res;
    //}

    //public static String toBinary(int val){
    //    var res = Integer.toBinaryString(val);
    //    return res;
    //}

    //public static String leftPad (String str, char s , int val){
    //    String res = str;
    //    for(int i = 0; i < val ; i++){
    //        res = s+res;
    //    } return res;
    //}

    //public static Integer numer() {
    //        Scanner input = new Scanner(System.in);
    //        int num;
    //        System.out.print("Podaj liczbe:");
    //        num = input.nextInt();
    //        var toBinary = toBinary(num);
    //        var toHex = toHex(num);
    //        System.out.println("DEC = " + num + ". BIN = " + toBinary + " .HEX = 0x" + toHex);
    //        System.out.println(leftPad(toBinary,'0',4));
    //        System.out.println(leftPad(toHex,'0',4));
    //return num;
    //}
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("piotr Gołabek");
        //System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        // System.out.printf("%s%n",Account.translit("stanisŁARzaw maruS"));
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.translit("Оксана"));
        System.out.printf("%s%n", Account.translit("Миколай"));
        System.out.printf("%s%n", Account.translit("Евгений"));
    }
}