import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class KOPI_UTS {
    public static String[] kopidontbelate = new String[400];
    public static String[] kopigoncangjiwa = new String[300];
    public static String[] kopijalankenangnan = new String[300];
    public static String[] kopitanparasa = new String[250];

    static int stok = kopidontbelate.length+kopigoncangjiwa.length+kopijalankenangnan.length+kopitanparasa.length;
    static int totaljumlahtransaksi =  stok ;

    public static void dataHarianTerjual(){
        int jumlahDontBeLate = 0;
        for (int f = 0; f <jumlahDontBeLate; f++){
            if (kopidontbelate[f]!=null){
                jumlahDontBeLate++;
            }
        }
        int jumlahGoncangJiwa = 0;
        for (int f = 0; f <jumlahGoncangJiwa; f++){
            if (kopigoncangjiwa[f]!=null){
                jumlahGoncangJiwa++;
            }
        }
        int jumlahJalanKenangan = 0;
        for (int f = 0; f <jumlahJalanKenangan; f++){
            if (kopijalankenangnan[f]!=null){
                jumlahJalanKenangan++;
            }
        }
        int jumlahTanpaRasa = 0;
        for (int f = 0; f <jumlahTanpaRasa; f++){
            if (kopitanparasa[f]!=null){
                jumlahTanpaRasa++;
            }
        }

        totaljumlahtransaksi = stok - kopidontbelate.length -kopijalankenangnan.length - kopitanparasa.length - kopigoncangjiwa.length;
        System.out.println("Kopi Dont Be Late :"+jumlahDontBeLate+" Cup Terjual, Stok Tersisa : "+(kopidontbelate.length-jumlahDontBeLate));
        System.out.println("Kopi Goncang Jiwa :"+jumlahGoncangJiwa+" Cup Terjual, Stok Tersisa : "+(kopigoncangjiwa.length-jumlahGoncangJiwa));
        System.out.println("Kopi Jalan Kenangan :"+jumlahJalanKenangan+" Cup Terjual, Stok Tersisa : "+(kopijalankenangnan.length-jumlahJalanKenangan));
        System.out.println("Kopi Tanpa Rasa :"+jumlahTanpaRasa+" Cup Terjual, Stok Tersisa : "+(kopitanparasa.length-jumlahTanpaRasa));



        ArrayList<Integer> pengeluaran = new ArrayList<Integer>();
        pengeluaran.add(jumlahDontBeLate);
        pengeluaran.add(jumlahGoncangJiwa);
        pengeluaran.add(jumlahJalanKenangan);
        pengeluaran.add(jumlahTanpaRasa);

        Collections.sort(pengeluaran, Collections.reverseOrder());

        System.out.println("Kopi Favorit Hari Ini ");


        if (jumlahDontBeLate == pengeluaran.get(0)) {
            System.out.println(" Don't Be Late");
        }

        if (jumlahGoncangJiwa == pengeluaran.get(0)) {
            System.out.println(" Goncang Jiwa");
        }

        if (jumlahJalanKenangan == pengeluaran.get(0)) {
            System.out.println(" Jalan Kenangan");
        }

        if (jumlahTanpaRasa == pengeluaran.get(0)) {
            System.out.println(" Tanpa Rasa");
        }

        System.out.println("Kopi Paling Tidak Disukai");

        if (jumlahDontBeLate == pengeluaran.get(3)) {
            System.out.println(" Don't Be Late");
        }

        if (jumlahGoncangJiwa == pengeluaran.get(3)) {
            System.out.println(" Goncang Jiwa");
        }

        if (jumlahJalanKenangan == pengeluaran.get(3)) {
            System.out.println(" Jalan Kenangan");
        }

        if (jumlahTanpaRasa == pengeluaran.get(3)) {
            System.out.println(" Tanpa Rasa");
        }


    }

    public static void Pesanan(int menu){
        Scanner inputData2 = new Scanner(System.in);
        switch (menu){
            case 1 :
                System.out.println("Kopi Dont Be Late Stock tersisa : "+kopidontbelate.length);
                System.out.println("Silahkan Masukan Jumlah Pesanan : ");
                int dontBeLate = inputData2.nextInt();
                if (dontBeLate>kopidontbelate.length){
                    System.out.println("Stock Tidak Mencukupi Silahkan Kurangi Pesanan Anda Atau Pesan Menu Lain");
                }else {
                    System.out.println("Pesanan Anda adalah " + dontBeLate + "Cup");
                    System.out.println("Sisa Stok Dari Dont Be Late adalah : " + (kopidontbelate.length - dontBeLate));
                }
                break;
            case 2 :
                System.out.println("Kopi Goncang Jiwa Stock tersisa : "+kopigoncangjiwa.length);
                System.out.println("Silahkan Masukan Jumlah Pesanan : ");
                int goncangJiwa = inputData2.nextInt();
                if (goncangJiwa>kopigoncangjiwa.length){
                    System.out.println("Stock Tidak Mencukupi Silahkan Kurangi Pesanan Anda Atau Pesan Menu Lain");
                }else {
                    System.out.println("Pesanan Anda adalah " + goncangJiwa + "Cup");
                    System.out.println("Sisa Stok Dari Goncang Jiwa adalah : " + (kopigoncangjiwa.length - goncangJiwa));
                }
                break;
            case 3 :
                System.out.println("Kopi Jalan Kenangan Stock tersisa : "+kopijalankenangnan.length);
                System.out.println("Silahkan Masukan Jumlah Pesanan : ");
                int jalanKenangan = inputData2.nextInt();
                if (jalanKenangan>kopijalankenangnan.length){
                    System.out.println("Stock Tidak Mencukupi Silahkan Kurangi Pesanan Anda Atau Pesan Menu Lain");
                }else {
                    System.out.println("Pesanan Anda adalah " + jalanKenangan + "Cup");
                    System.out.println("Sisa Stok Dari Jalan Kenangan adalah : " + (kopijalankenangnan.length - jalanKenangan));
                }
                break;
            case 4 :
                System.out.println("Kopi Tanpa Rasa Stock tersisa : "+kopitanparasa.length);
                System.out.println("Silahkan Masukan Jumlah Pesanan : ");
                int tanpaRasa = inputData2.nextInt();
                if (tanpaRasa>kopitanparasa.length){
                    System.out.println("Stock Tidak Mencukupi Silahkan Kurangi Pesanan Anda Atau Pesan Menu Lain");
                }else {
                    System.out.println("Pesanan Anda adalah " + tanpaRasa + "Cup");
                    System.out.println("Sisa Stok Dari Jalan Kenangan adalah : " + (kopitanparasa.length - tanpaRasa));
                }
                break;
            case 5 :
                dataHarianTerjual();
                System.exit(0);
        }
    }

    public static void  printmenu() {
        while (true) {
            Scanner inputData = new Scanner(System.in);
            System.out.println("Wellcome To Kopi Kenangan Jiwa");
            System.out.println("1. Kopi Dont Be Late");
            System.out.println("2. Kopi Goncanag Jiwa");
            System.out.println("3. Kopi Jalan kenangan");
            System.out.println("4. Kopi Tanpa Rasa");
            System.out.println("5. Lihat Data Pengeluaran Hari Ini");
            System.out.println("Silahkan Pesan Menu : ");
            int pilihMenu = inputData.nextInt();
            Pesanan(pilihMenu);
        }
    }

    public static void main(String[] args) {
        printmenu();
    }
}
