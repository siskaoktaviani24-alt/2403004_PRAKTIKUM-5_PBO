class Matematika {

   public String namaOperasi;  
   public int hasilTerakhir;   


    public int tambah(int a, int b) {
        hasilTerakhir = a + b;
        namaOperasi = "Penjumlahan 2 bilangan int";
        return hasilTerakhir;
    }

    public int tambah(int a, int b, int c) {
        hasilTerakhir = a + b + c;
        namaOperasi = "Penjumlahan 3 bilangan int";
        return hasilTerakhir;
    }

    public double tambah(double a, double b) {
        hasilTerakhir = (int)(a + b);
        namaOperasi = "Penjumlahan 2 bilangan double";
        return a + b;
    }

    public void info() {
        System.out.println("Operasi terakhir: " + namaOperasi);
        System.out.println("Hasil terakhir  : " + hasilTerakhir);
    }
}