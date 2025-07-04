import java.util.Scanner;

public class Main {
    // Inisialisasi variable yang diperlukan oleh program ==============================================
    public static double x, a;
    public static double A, k, p, q, s, fungsi_awal, turunan_total;
    public static int menu_fungsi, menu_trigonometri, n;
    public static Scanner input = new Scanner(System.in);
    // =================================================================================================


    // Program Utama ===================================================================================
    public static void main(String[] args) {

        //Pembukaan Program ............................................................................
        System.out.println("\n\n\n _*`~_*`~_*`~_* SELAMAT DATANG DI PROGRAM KALKULATOR TURUNAN - HAFIZH NURSALIM (GREVENT) *_~`*_~`*_~`*_\n" +
                "==== Program ini dibuat untuk mencari nilai turunan dari suatu fungsi ====");

        // Pemilihan Menu Fungsi pada Program ..........................................................
        System.out.print("\n\"Pilih fungsi yang akan dicari turunannya\"\n" +
                "1. Fungsi aljabar\n" +
                "2. Fungsi trigonometri\n" +
                "3. Fungsi eksponensial\n" +
                "4. Fungsi logaritma\n");
        System.out.print("   Menu pilihan anda: ");
        menu_fungsi = input.nextInt();

        // Beralih ke Menu Fungsi yang dipilih .........................................................
        switch (menu_fungsi) {
            case 1:
                System.out.println("-------------- FUNGSI ALJABAR --------------\n\n" +
                        "Bentuk umum fungsi aljabar:\n" +
                        "f(x) = k(0)x^n + k(1)x^(n-1) + k(2)x^(n-2) + ... + k(n-2)x^(2) + k(n-1)x + k(n)\n");
                aljabar();
                break;
            case 2:
                System.out.println("-----------FUNGSI  TRIGONOMETRI-----------\n");
                trigonometri();
                break;
            case 3:
                System.out.println("-----------FUNGSI  EKSPONENSIAL-----------\n\n" +
                        "Bentuk umum fungsi eksponensial:\n" +
                        "f(x) = A * (k)^(x - p) + q\n");
                eksponensial();
                break;
            case 4:
                System.out.println("-------------FUNGSI LOGARITMA-------------\n\n" +
                        "Bentuk umum fungsi logaritma:\n" +
                        "f(x) = A * {(k)log(x - p)} + q\n");
                logaritma();
                break;
            default:
                System.out.println("Maaf, menu anda tidak tersedia!");
        }

        // Penutupan Program Kalkulator Turunan ........................................................
        System.out.println("\n    -'-.-'-.-'- THANK YOU -'-.-'-.-'-\n" +
                "-.-'-.-'FOLLOW ME FOR MORE UPDATE!'-.-'-.-");
    }
    // =================================================================================================


    // Fitur Menu Fungsi Aljabar =======================================================================
    public static void aljabar() {
        System.out.print("Untuk mencari f'(a), masukkan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukkan nilai pangkat tertinggi (n): ");
        n = input.nextInt();

        System.out.println("Masukkan sebanyak " +(n+1)+ " (k) koefisien suku dari fungsi aljabar: \n");
        double[] k = new double[n + 1];
        for (int i = 0; i < k.length; i++) {
            System.out.print("k (" +i+ ") = ");
            k[i] = input.nextDouble();
        }

        double turunan_persuku[] = new double[k.length - 1];
        double turunan_total = 0;
        x = a;
        for (int i = 0; i < turunan_persuku.length; i++) {
            turunan_persuku[i] = (k.length - 1 - i) * k[i] * Math.pow(x, turunan_persuku.length - 1 - i);
            turunan_total = turunan_total + turunan_persuku[i];
        }
        System.out.println("f'("+a+") = " + turunan_total);
    }
    // =================================================================================================


    // Fitur Menu Fungsi Trigonometri ==================================================================
    public static void trigonometri() {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih fungsi trigonometri yang akan dicari turunannya\n" +
                "1. Fungsi sinus\n" +
                "2. Fungsi cosinus\n" +
                "3. Fungsi tangen\n" +
                "4. Fungsi cotagen\n" +
                "5. Fungsi cosecan\n" +
                "6. Fungsi secan\n" +
                "   Menu pilihan anda:");

        menu_trigonometri = input.nextInt();
        switch (menu_trigonometri) {
            case 1:
                System.out.println("---------------FUNGSI SINUS---------------\n\n" +
                        "Bentuk umum fungsi sinus:\n" +
                        "f(x) = A * sin{k*(x-p)} + q");
                sinus();
                break;

            case 2:
                System.out.println("--------------FUNGSI COSINUS--------------\n\n" +
                        "Bentuk umum fungsi cosinus:\n" +
                        "f(x) = A * cos{k*(x-p)} + q");
                cosinus();
                break;

            case 3:
                System.out.println("--------------FUNGSI  TANGEN--------------\n\n" +
                        "Bentuk umum fungsi tangen: \n" +
                        "f(x) = A * tan{k*(x-p)} + q");
                tangen();
                break;

            case 4:
                System.out.println("-------------FUNGSI COTANGEN-------------\n\n" +
                        "Bentuk umum fungsi cotangen: \n" +
                        "f(x) = A * cot{k*(x-p)} + q");
                cotangen();
                break;

            case 5:
                System.out.println("-------------FUNGSI  COSECAN-------------\n\n" +
                        "Bentuk umum fungsi cosecan: \n" +
                        "f(x) = A * csc{k*(x-p)} + q");
                cosecan();
                break;

            case 6:
                System.out.println("---------------FUNGSI SECAN---------------\n\n" +
                        "Bentuk umum fungsi secan: \n" +
                        "f(x) = A * cos{k*(x-p)} + q");
                secan();
                break;

            default:
                System.out.println("Maaf, menu anda tidak tersedia!");
        }
    }
    // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void sinus (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai s yang memenuhi a = s*π ");
        s = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        a=s*Math.PI;
        x=a;
        fungsi_awal = A * Math.sin(k*(x-p)) + q;
        System.out.println("f("+s+"π) = "+fungsi_awal);
        turunan_total = A * k * Math.cos(k*(x-p));
        System.out.println("f'("+s+"π) = "+turunan_total);
    }
    // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void cosinus (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai s yang memenuhi a = s*π ");
        s = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        a=s*Math.PI;
        x=a;
        fungsi_awal = A * Math.cos(k*(x-p)) + q;
        System.out.println("f("+s+"π) = "+fungsi_awal);
        turunan_total = A * k * -Math.sin(k*(x-p));
        System.out.println("f'("+s+"π) = "+turunan_total);
    }
    // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void tangen (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai s yang memenuhi a = s*π ");
        s = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        a=s*Math.PI;
        x=a;
        // Dari tidak boleh k*(x-p) = 2*n*Pi +- 0.5*Pi .................................................
        if ( ((k*(x-p))/(0.5*Math.PI)) %4==1 || ((k*(x-p))/(0.5*Math.PI)) %4==-1) {
            System.out.println("f'("+s+"π) tidak ada");
        }else {
            fungsi_awal = A * Math.tan(k * (x - p)) + q;
            System.out.println("f("+s+"π) = " + fungsi_awal);
            turunan_total = A * k / Math.pow(Math.cos(k * (x - p)) , 2);
            System.out.println("f'("+s+"π) = " + turunan_total);
        }
    }
    // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void cotangen (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai s yang memenuhi a = s*π ");
        s = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        a=s*Math.PI;
        x=a;
        // Dari tidak boleh k*(x-p) = 2*n*Pi ...........................................................
        if ( ((k*(x-p))/(Math.PI)) %2==0) {
            System.out.println("f'("+s+"π) tidak ada");
        }else {
            fungsi_awal = A / Math.tan(k * (x - p)) + q;
            System.out.println("f("+s+"π) = " + fungsi_awal);
            turunan_total = A * k / -Math.pow(Math.sin(k * (x - p)), 2);
            System.out.println("f'("+s+"π) = " + turunan_total);
        }
    }
    // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void cosecan (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai s yang memenuhi a = s*π ");
        s = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        a=s*Math.PI;
        x=a;
        // Dari tidak boleh k*(x-p) = 2*n*Pi ...........................................................
        if ( ((k*(x-p))/(Math.PI)) %2==0) {
            System.out.println("f'("+s+"π) tidak ada");
        }else {
            fungsi_awal = A / Math.sin(k * (x - p)) + q;
            System.out.println("f("+s+"π) = " + fungsi_awal);
            turunan_total = A * k / -(Math.sin(k * (x - p))*Math.tan(k * (x - p)));
            System.out.println("f'("+s+"π) = " + turunan_total);
        }
    }
    // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void secan (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai s yang memenuhi a = s*π ");
        s = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        a=s*Math.PI;
        x=a;
        // Dari tidak boleh k*(x-p) = 2*n*Pi +- 0.5*Pi .................................................
        if ( ((k*(x-p))/(0.5*Math.PI)) %4==1 || ((k*(x-p))/(0.5*Math.PI)) %4==-1 ) {
            System.out.println("f'("+s+"π) tidak ada");
        }else {
            fungsi_awal = A / Math.cos(k * (x - p)) + q;
            System.out.println("f("+s+"π) = " + fungsi_awal);
            turunan_total = A * k * Math.tan(k * (x - p)) / Math.cos(k * (x - p));
            System.out.println("f'("+s+"π) = " + turunan_total);
        }
    }
    // =================================================================================================


    // Fitur Menu Fungsi Eksponensial ==================================================================
    public static void eksponensial (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai a");
        a = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        x=a;
        fungsi_awal = A * Math.pow(k, (x-p)) + q;
        System.out.println("f("+a+") = "+fungsi_awal);
        //ingat : ln(a) = Math.log(a)
        turunan_total = A * Math.pow(k, (x - p)) * Math.log(a);
        System.out.println("f'("+a+") = "+turunan_total);
    }
    // =================================================================================================


    // Fitur Menu Fungsi Logaritma =====================================================================
    public static void logaritma (){
        System.out.println("Untuk mencari f'(a), maka masukkan nilai a");
        a = input.nextDouble();

        System.out.print("Masukkan nilai-nilai berikut sesuai dengan bentuk umum fungsi diatas:\n");
        System.out.print("A = "); A = input.nextDouble();
        System.out.print("k = "); k = input.nextDouble();
        System.out.print("p = "); p = input.nextDouble();
        System.out.print("q = "); q = input.nextDouble();

        x=a;
        if (x-p <=0){
            System.out.println("f'(" + a + ") tidak ada\n");
        } else {
            //ingat : (k)log(x - p) = ln(x - p)/ln(k)//
            fungsi_awal = A * Math.log(x - p) / Math.log(k) + q;
            System.out.println("f(" + a + ") = " + fungsi_awal);
            turunan_total = A / (x - p) * 1 / Math.log(k);
            System.out.println("f'(" + a + ") = " + turunan_total);
        }
    }
    // =================================================================================================
}
