package com.uts.axa;

public class AXA implements Mesin, Warna{
    public static class Abstrak extends Veyron {
        @Override
        void Panjang() {
        }

        @Override
        void Lebar() {
        }

        @Override
        void Ceper() {
        }
        static String panjang = "1 meter lebih panjang";
        static String lebar = "lebih kecil 1 meter";

        public static void main(String[] args) {
            System.out.println("Mobil AXA mengambil bentuk "
                    + panjang + " dari Buggati Veyron dan lebarnya " + lebar
                    + ". Untuk warna, mobil AXA berwarna " + tipeWarna +
                    " dengan cc mobil sebesar "+ tipeMesin);
        }
    }

    public static void jumlah_ban(){
        int ban = 4;
    }
    public static void jumlah_pintu() {
        int pintu = 2;
    }
}
