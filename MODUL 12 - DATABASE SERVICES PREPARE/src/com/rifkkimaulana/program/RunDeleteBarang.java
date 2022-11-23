
package com.rifkkimaulana.program;

/**
 *
 * @author Rifki Maulana
 */

public class RunDeleteBarang {

    public static void main(String[] args) {
        barang pensil = new barang();
        pensil.delete("P001");
        pensil.delete("P002");
        barang buku = new barang();
        buku.delete("B001");
        buku.delete("B002");
    }
    
}
