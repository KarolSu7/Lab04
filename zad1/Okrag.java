import java.util.Scanner;

public class Okrag {
    public static void main (String[] args){
        int WspolrzednaX = 0;
        int WspolrzednaY = 0;
        int r = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promien:");
        r = scanner.nextInt();

        System.out.print("Podaj wspolrzedna punkru X:");
        WspolrzednaX = scanner.nextInt();

        System.out.print("Podaj wspolrzedna punkru Y:");
        WspolrzednaY = scanner.nextInt();

        getPowierzchnia(r);
        setSrednica(r);
        getPromien(r);
        wSrodku(WspolrzednaX, WspolrzednaY,r);

    }

    static void getPowierzchnia(int p){
        System.out.println("Powierzchnia: " + Math.PI*p*p);
    }
    static void setSrednica(int p){
        System.out.println("Srednica: " + 2*p);
    }
    static void getPromien(int p){
        System.out.println("Promien: " + p);
    }
    static  void wSrodku(int PunktX, int PunktY, int p){
        if(Math.pow(PunktX,2)+Math.pow(PunktY,2)<Math.pow(p,2)){
            System.out.println("Punkt nalezy do okregu");
        }else System.out.println("Punkt NIE nalezy do okregu");
    }

}
