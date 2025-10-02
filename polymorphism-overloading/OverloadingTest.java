public class OverloadingTest {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        System.out.println("Tambah 2 int: " + mtk.tambah(5, 6));
        mtk.info();

        System.out.println("\nTambah 3 int: " + mtk.tambah(2, 8, 3));
        mtk.info();

        System.out.println("\nTambah 2 double: " + mtk.tambah(5.7, 8.1));
        mtk.info();
    }
}