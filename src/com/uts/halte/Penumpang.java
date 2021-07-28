package com.uts.halte;

import java.util.*;

public class Penumpang extends Bis {
    int noKursi, usia;
    String nama, tujuan;
    private String getnoKursi, setnoKursi;

    public Penumpang(int noKursi, int usia, String nama, String tujuan) {
        this.noKursi = noKursi;
        this.usia = usia;
        this.nama = nama;
        this.tujuan = tujuan;
    }
    public int getnoKursi(){
        return noKursi;

    }
    public void setnoKursi(int noKursi){
        this.noKursi = noKursi;
    }

    @Override

    public String toString() {
        return "Penumpang{ " + noKursi + " " +
                usia + " " + nama + " " +  tujuan +'}';
    }

    static class PenumpangSortingComparator implements Comparator<Penumpang> {

        @Override
        public int compare(Penumpang penumpang1, Penumpang penumpang2) {

            // Comparing
            // int noKursiCompare = penumpang1.setnoKursi.compareTo(penumpang2.getnoKursi);
            return 0;
        }
    }
    public static void main(String[] args) {
        Penumpang penumpang1 = new Penumpang(1, 30, "Rahman", "Jakarta");
        Penumpang penumpang2 = new Penumpang(5, 31, "Bagas", "Jakarta");
        Penumpang penumpang3 = new Penumpang(3, 34, "Budi", "Halte C");
        Penumpang penumpang4 = new Penumpang(8, 33, "Agung", "Halte B");
        Penumpang penumpang5 = new Penumpang(4, 32, "Ratna", "Halte A");


        List<Penumpang> penumpang = new ArrayList();
        penumpang.add(penumpang1);
        penumpang.add(penumpang2);
        penumpang.add(penumpang3);
        penumpang.add(penumpang4);
        penumpang.remove(penumpang5);
        Penumpang penumpang6 = new Penumpang(4, 27, "Rahma", "Halte C");
        penumpang.add(penumpang6);

        // Halte A
        System.out.println("Di Halte A");
        for (Penumpang obj : penumpang)
            System.out.println(obj.noKursi + " " + obj.usia + " " + obj.nama + " " + obj.tujuan);
        // Halte B
        penumpang.remove(penumpang4);
        Penumpang penumpang7 = new Penumpang(10, 35, "Andi", "Jakarta");
        Penumpang penumpang8 = new Penumpang(8, 16, "Tono", "Jakarta");
        penumpang.add(penumpang7);
        penumpang.add(penumpang8);

        //Iterator<Penumpang> noKursiIterator = penumpang.iterator();

        //System.out.println("Before Sorting: ");

        //while (noKursiIterator.hasNext()) {
        //    System.out.println(noKursiIterator.next());
        //}

        Collections.sort(penumpang, new PenumpangSortingComparator());

        System.out.println(" ");
        System.out.println("Di Halte B");
        for (Penumpang sortnoKursi : penumpang){
            System.out.println(sortnoKursi);
        }
        // Halte C
        penumpang.remove(penumpang3);
        Penumpang penumpang9 = new Penumpang(2,23, "Bayu","Jakarta");
        Penumpang penumpang10 = new Penumpang(6,22,"Ayu","Jakarta");
        Penumpang penumpang11 = new Penumpang(3,40,"Bani", "Jakarta");
        penumpang.add(penumpang9);
        penumpang.add(penumpang10);
        penumpang.add(penumpang11);

        Collections.sort(penumpang, new PenumpangSortingComparator());

        System.out.println(" ");
        System.out.println("Di Halte C");
        for (Penumpang sortnoKursi : penumpang){
            System.out.println(sortnoKursi);
        }

        // Halte D
        Penumpang penumpang12 = new Penumpang(7,33,"Dimas", "Jakarta");
        Penumpang penumpang13 = new Penumpang(9,32,"Angga","Jakarta");
        penumpang.add(penumpang12);
        penumpang.add(penumpang13);
        Collections.sort(penumpang, new PenumpangSortingComparator());

        System.out.println(" ");
        System.out.println("Di Halte D");
        for (Penumpang sortnoKursi : penumpang){
            System.out.println(sortnoKursi);
        }
        // Jakarta
        penumpang.removeAll(penumpang);
        Collections.sort(penumpang, new PenumpangSortingComparator());

        System.out.println(" ");
        System.out.println("Di Jakarta");
        for (Penumpang sortnoKursi : penumpang){
            System.out.println(sortnoKursi);
        }






    }
}
