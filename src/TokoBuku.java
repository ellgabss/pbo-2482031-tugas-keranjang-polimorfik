public class TokoBuku {

    static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku buku : keranjang) {
            total += buku.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);

        Buku[] keranjang = { cetak1, cetak2, digital };
        BisaDiunduh[] unduhan = { digital };
        // Percobaan: Buku b = new Buku("X", "Y", 1); menghasilkan
        // Pesan error: Buku is abstract; cannot be instantiated
        // Baris percobaan dijadikan komentar supaya program bisa di-compile lagi.

        System.out.println("=============== KERANJANG ===============");
        for (Buku buku : keranjang) {
            buku.tampilkanInfo();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar   : " + Buku.formatRupiah(hitungTotal(keranjang)));


        System.out.println();
        System.out.println("============== LINK UNDUH ===============");
        for (BisaDiunduh unduh : unduhan) {
            System.out.println(unduh.linkUnduh());
        }
    }
}