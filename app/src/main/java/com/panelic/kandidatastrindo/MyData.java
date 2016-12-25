package com.panelic.kandidatastrindo;

/**
 * Created by Sholihin on 25/12/2016.
 */

public class MyData {

    private int no;
    private String judul, tgl, isi, gambar;

    public MyData(int no, String judul, String tgl, String isi, String gambar ) {
        this.no = no;
        this.judul = judul;
        this.tgl = tgl;
        this.isi = isi;
        this.gambar = gambar;
    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tgl;
    }

    public void setTanggal(String tgl) {
        this.tgl = tgl;
    }

    public String getImage_link() {
        return gambar;
    }

    public void setImage_link(String gambar) {
        this.gambar = gambar;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
