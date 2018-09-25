/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.pkg25sept2018praktikum;

/**
 *
 * @author basisb15
 */
public class soal2 {

    public static void main(String[] args) {
        DaftarAtlet[] atlet = {
            new DaftarAtlet("To Kenneth", "Hong Kong", 22.54),
            new DaftarAtlet("Teong", "Singapore", 22.59),
            new DaftarAtlet("Yu Hexin", "China", 22.11),
            new DaftarAtlet("Nakamura", "Japan", 22.20),
            new DaftarAtlet("Mussin", "Kazakhstan", 22.64),
            new DaftarAtlet("Nakao", "Japan", 22.46),
            new DaftarAtlet("Lin", "Taipei", 22.67),
            new DaftarAtlet("Khade", "India", 22.47)
        };
        soal2 sortObj = new soal2();
        atlet = sortObj.bubbleSort(atlet);
        
        System.out.println("MENGGUNAKAN DATA ASCENDING");
        System.out.println("Daftar Peraih Juara  Atlet Renang Asian Games");
        System.out.println("=========================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        for (int i = 1; i < atlet.length; i++) {
            System.out.printf("%-15s", atlet[i].getNegara());
            System.out.printf("%-15s", atlet[i].getNama());
            System.out.printf("%.2f", atlet[i].getWaktu());
            System.out.println("");
        }
        System.out.println("=========================================");
        System.out.println("");

        soal2 sortObj2 = new soal2();
        atlet = sortObj2.selectionSort(atlet);
        
        System.out.println("Daftar Peraih Juara  Atlet Renang Asian Games");
        System.out.println("=========================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        for (int i = 1; i < atlet.length; i++) {
            System.out.printf("%-15s", atlet[i].getNegara());
            System.out.printf("%-15s", atlet[i].getNama());
            System.out.printf("%.2f", atlet[i].getWaktu());
            System.out.println("");
        }
        System.out.println("=========================================");
        System.out.println("");
        
        soal2 sortObj3 = new soal2();
        atlet = sortObj3.InsertionSort(atlet);
        
        System.out.println("Daftar Peraih Juara  Atlet Renang Asian Games");
        System.out.println("=========================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        for (int i = 1; i < atlet.length; i++) {
            System.out.printf("%-15s", atlet[i].getNegara());
            System.out.printf("%-15s", atlet[i].getNama());
            System.out.printf("%.2f", atlet[i].getWaktu());
            System.out.println("");
        }
        System.out.println("=========================================");
        System.out.println(""); 
        
        //data DESCENDING
        soal2 sortDESC = new soal2();
        atlet = sortDESC.bubbleSortDES(atlet);
        
        System.out.println("MENGGUNAKAN DATA DESCENDING");
        System.out.println("Daftar Peraih Juara  Atlet Renang Asian Games");
        System.out.println("=========================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        for (int i = 1; i < atlet.length; i++) {
            System.out.printf("%-15s", atlet[i].getNegara());
            System.out.printf("%-15s", atlet[i].getNama());
            System.out.printf("%.2f", atlet[i].getWaktu());
            System.out.println("");
        }
        System.out.println("=========================================");
        System.out.println("");

        soal2 sortDESC1 = new soal2();
        atlet = sortDESC1.selectionSortDES(atlet);
        
        System.out.println("Daftar Peraih Juara  Atlet Renang Asian Games");
        System.out.println("=========================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        for (int i = 1; i < atlet.length; i++) {
            System.out.printf("%-15s", atlet[i].getNegara());
            System.out.printf("%-15s", atlet[i].getNama());
            System.out.printf("%.2f", atlet[i].getWaktu());
            System.out.println("");
        }
        System.out.println("=========================================");
        System.out.println("");
        
        soal2 sortDESC2 = new soal2();
        atlet = sortDESC2.InsertionSortDES(atlet);
        
        System.out.println("Daftar Peraih Juara  Atlet Renang Asian Games");
        System.out.println("=========================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-15s", "Waktu");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("");

        for (int i = 1; i < atlet.length; i++) {
            System.out.printf("%-15s", atlet[i].getNegara());
            System.out.printf("%-15s", atlet[i].getNama());
            System.out.printf("%.2f", atlet[i].getWaktu());
            System.out.println("");
        }
        System.out.println("=========================================");
        System.out.println(""); 
    }
    public DaftarAtlet[] bubbleSort(DaftarAtlet[] daftarAtlet) {
        boolean ulang = false;
        do {
            ulang = false;
            for (int i = 0; i < daftarAtlet.length - 1; i++) {
                if (daftarAtlet[i].compareTo(daftarAtlet[i + 1]) > 0) {
                    daftarAtlet = swap(daftarAtlet, i, i + 1);
                    ulang = true;
                }
            }
        } while (ulang);
        return daftarAtlet;
    }


    public DaftarAtlet[] swap(DaftarAtlet[] daftarAtlet, int index1, int index2) {
        DaftarAtlet temp = daftarAtlet[index1];
        daftarAtlet[index1] = daftarAtlet[index2];
        daftarAtlet[index2] = temp;
        return daftarAtlet;
    }

    public DaftarAtlet[] selectionSort(DaftarAtlet[] daftarAtlet) {
        for (int i = 0; i < daftarAtlet.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < daftarAtlet.length; j++) {
                if (daftarAtlet[j].compareTo(daftarAtlet[min]) < 0) {
                    min = j;
                }
            }
            DaftarAtlet swap = daftarAtlet[i];
            daftarAtlet[i] = daftarAtlet[min];
            daftarAtlet[min] = swap;
        }
        return daftarAtlet;
    }

    public DaftarAtlet[] InsertionSort(DaftarAtlet[] daftarAtlet) {
        for (int i = 1; i < daftarAtlet.length; i++) {
            DaftarAtlet point = daftarAtlet[i];
            int j = i - 1;
            while ((j > -1) && (daftarAtlet[j].compareTo(point) > 0)) {
                daftarAtlet[j + 1] = daftarAtlet[j];
                j--;
            }
            daftarAtlet[j + 1] = point;
        }
        return daftarAtlet;
    }
    
    //Menggunakan DESCENDING
    public DaftarAtlet[] bubbleSortDES(DaftarAtlet[] daftarAtlet) {
        boolean ulang = false;
        do {
            ulang = false;
            for (int i = 0; i < daftarAtlet.length - 1; i++) {
                if (daftarAtlet[i].compareTo(daftarAtlet[i + 1]) < 0) {
                    daftarAtlet = swap(daftarAtlet, i, i + 1);
                    ulang = true;
                }
            }
        } while (ulang);
        return daftarAtlet;
    }

    public DaftarAtlet[] selectionSortDES(DaftarAtlet[] daftarAtlet) {
        for (int i = 0; i < daftarAtlet.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < daftarAtlet.length; j++) {
                if (daftarAtlet[j].compareTo(daftarAtlet[min]) > 0) {
                    min = j;
                }
            }
            DaftarAtlet swap = daftarAtlet[i];
            daftarAtlet[i] = daftarAtlet[min];
            daftarAtlet[min] = swap;
        }
        return daftarAtlet;
    }

    public DaftarAtlet[] InsertionSortDES(DaftarAtlet[] daftarAtlet) {
        for (int i = 1; i < daftarAtlet.length; i++) {
            DaftarAtlet point = daftarAtlet[i];
            int j = i - 1;
            while ((j > -1) && (daftarAtlet[j].compareTo(point) < 0)) {
                daftarAtlet[j + 1] = daftarAtlet[j];
                j--;
            }
            daftarAtlet[j + 1] = point;
        }
        return daftarAtlet;
    }
}


