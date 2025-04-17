package com.mycompany.utspbo;

/**
 *
 * @author alvin
 */
public class UtsPbo_SoalNo4_Balok{
    private int panjang;
    private int lebar;
    private int tinggi;
                
    UtsPbo_SoalNo4_Balok(int panjangBaru, int lebarBaru, int tinggiBaru){
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public String toString() {
    return "Balok dengan panjang : " + panjang + ", lebar : " + lebar + " dan tinggi : " + tinggi +
           ". Luasnya : " + getLuas() + ", sedangkan kelilingnya : " + getKeliling() +
           " dan volumenya : " + getVolume();
    }
}