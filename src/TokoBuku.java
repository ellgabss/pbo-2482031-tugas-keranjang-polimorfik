public class TokoBuku {

    public static void main(String[] args) {
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);

        Buku[] keranjang = { cetak1, cetak2 };
        // Percobaan: Buku b = new Buku("X", "Y", 1); menghasilkan
        // Pesan error: Buku is abstract; cannot be instantiated
        // Baris percobaan dijadikan komentar supaya program bisa di-compile lagi.

        System.out.println("=============== KERANJANG ===============");
        for (Buku buku : keranjang) {
            buku.tampilkanInfo();
        }
    }
}