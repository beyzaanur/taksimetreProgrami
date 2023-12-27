import java.util.Scanner;

public class taksimetreProgrami {
    public static void main(String[] args) {

        double km,taksimetre,tutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("gidilen km'yi giriniz: ");
        km = inp.nextDouble();

        taksimetre = km*2.20 + 10;


        if (taksimetre>20) {
            tutar = taksimetre;
        }
        else{
            tutar = 20;
        }
        System.out.println("tutar: " + tutar);

    }
}

//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

