
package com.rifkkimaulana.program;

/**
 *
 * @author Rifki Maulana
 */

public class RunUpdateBarang {

    public static void main(String[] args) {
        barang pensil = new barang();
        pensil.update("P001", "PENSIL 2B", 20, 2500);
        pensil.update("P002", "SPIDOL", 50, 2000);
        barang buku = new barang();
        buku.update("B001", "BUKU TULIS", 30, 3000);
        buku.update("B002", "BUKU GAMBAR", 40, 3500);
    }
    
}
