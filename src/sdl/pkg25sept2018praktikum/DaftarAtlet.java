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
public class DaftarAtlet implements Comparable {

    private String nama;
    private String negara;
    private double waktu;

    public DaftarAtlet(String nama, String negara, double waktu) {
        this.nama = nama;
        this.negara = negara;
        this.waktu = waktu;
    }

    public DaftarAtlet() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    @Override
    public int compareTo(Object o) {
        DaftarAtlet daftar = (DaftarAtlet) o;
        if (this.getWaktu() < daftar.getWaktu()) {
            return -1;
        } else if (this.getWaktu() > daftar.getWaktu()) {
            return 1;
        } else {
            return 0;
        }
    }
}
