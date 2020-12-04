package com.example.alatelektronik;

import android.content.Context;


import com.example.alatelektronik.model.Alat;
import com.example.alatelektronik.model.Kipas;
import com.example.alatelektronik.model.Kulkas;
import com.example.alatelektronik.model.Tv;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Alat> alats = new ArrayList<>();


    private static List<Kulkas> initDataKulkas(Context ctx) {
        List<Kulkas> kulkases = new ArrayList<>();
        kulkases.add(new Kulkas("Polytron",
                "Kulkas ini selain canggih juga dilengkapi material desain berupa tempered glass yang membuat kulkas tak mudah tergores dan rusak.\n" +
                        "\n" +
                        "Ada juga fitur canggih bernama fast cooling yang sangat mempermudah proses pendinginan dan pengawetan makanan.\n" +
                        "\n" +
                        "Dengan konsumsi listrik yang hanya 65 watt saja, kulkas hemat listrik ini dapat Anda tebus seharga Rp1,8 jutaan saja!", R.drawable.kulkas_polytron));
        kulkases.add(new Kulkas("PANASONIC",
                "Produk Panasonic NR-AF17AN-SS hadir dengan fitur canggih bernama Fast & Efficient Cooling yang dapat membuat ikan dan daging tetap segar untuk waktu lama.\n" +
                        "\n" +
                        "Selain itu, ada juga fitur jumbo vegetable case dengan ukuran kompartemen lebih besar serta metal door design yang membuat pintu kulkas menarik dan tahan lama.\n" +
                        "\n" +
                        "Kulkas ini dengan semua fitur canggihnya tersebut hanya perlu Anda tebus dengan harga Rp1,7 jutaan.", R.drawable.k_panasonic));
        kulkases.add(new Kulkas("Sharp Shine",
                "produk Sharp Shine Series SJ-195MD-SR/SG yang dilengkapi fitur automatic defrost system serta LED lamp canggih.\n" +
                        "\n" +
                        "Fitur automatic defrost system berguna untuk mencairkan bunga es secara otomatis sehingga tak menutupi freezer dan merusak kulkas.\n" +
                        "\n" +
                        "Ada juga LED lamp yang berguna untuk menerangi seluruh isi kulkas dan satu lagi, kapasitas kulkas ini cukup besar, mencapai 34 liter!\n" +
                        "\n" +
                        "Berapa harga kulkas ini? Cukup murah, hanya Rp2,49 jutaan saja.", R.drawable.sharpshine));
        kulkases.add(new Kulkas("Toshiba",
                "Toshiba GR-WG66ED merupakan salah satu merk kulkas terbaik yang hadir dengan desain elegan dan kapasitas penyimpanan yang lumayan besar.\n" +
                        "\n" +
                        "Tak tanggung-tanggung, ukuran total kulkas ini mencapai 608 liter, di mana 163 liter dialokasikan untuk freezer dan 445 sisanya untuk kompartemen biasa.", R.drawable.kulkas_toshiba));
        kulkases.add(new Kulkas("Samsung",
                "Twin cooling plus! Ini adalah fitur dua pendingin terpisah di dalam satu kulkas.\n" +
                        "\n" +
                        "Dengan fitur pendingin terpisah ini, makanan di dalam kulkas terjaga kesegarannya dua kali lebih lama dari pada kulkas biasa.\n" +
                        "\n" +
                        "Selain itu, ada juga fitur smart conversion yang menyediakan lima mode pengaturan untuk lima fungsi freezer yang berbeda.", R.drawable.kulkas_samsung));
        kulkases.add(new Kulkas("Modena Centurion",
                "roduk Modena Centurion RF 2241 S yang mana salah satu keunggulan produk ini yaitu tidak menggunakan kompresor berbahan CFC (klorofluorokarbon).\n" +
                        "\n" +
                        "Dengan kata lain, kulkas tanpa CFC ini tak merusak lapisan ozon sehingga jauh lebih ramah lingkungan.\n" +
                        "\n" +
                        "Bahkan, Modena Centurion RF 2241 S juga telah dilengkapi electronik control panel yang dapat digunakan untuk mengatur suhu dan cahaya dalam kulkas.", R.drawable.kulkas_modenacenturion));
        return kulkases;
    }
    private static List<Kipas> initDataKipas(Context ctx) {
        List<Kipas> kipases = new ArrayList<>();
        kipases.add(new Kipas("Maspion",
                "Merk asli Indonesia ini sudah berpengalaman dalam memproduksi kipas angin berkualitas tinggi. Varian yang tersedia dari Kipas Angin Maspion sangat beragam, cocok untuk berbagai keperluanmu.", R.drawable.kipas_maspion));
        kipases.add(new Kipas("Cosmos Wadesta",
                "merk kipas angin satu ini, yang menampilkan Kipas Angin Cosmos Wadesta yang menempel di dinding, meja, dan lantai. Dengan slogannya sebagai kipas yang bisa ditempel di mana saja, produk kipas angin Cosmos Wadesta menawarkan fleksibilitas luas bagi penggunanya.", R.drawable.cosmoswadesta));
        kipases.add(new Kipas("Stand Miyako",
                "Varian kipas stand dari Miyako ini berdaya lebih kuat karena posisi berdirinya membuat kipas bekerja lebih stabil, meminimalisir fluktuasi angin.", R.drawable.miyako));
        kipases.add(new Kipas("Sekai",
                "Type HDO 615-S\n" +
                        "-\tKipas angin high velocity 15 cm (6”)\n" +
                        "-\tBaling baling dari Plastik\n" +
                        "-\t2 pengatur kecepatan\n" +
                        "-\tHembusan angin kencang\n" +
                        "-\tHemat listrik\n" +
                        "-\tTidak berisik\n" +
                        "-\tDilengkapi sekring pengaman\n" +
                        "-\tGaransi 3 tahun\n" +
                        "-\tDaya 20 W, 220 VAC, 50 Hz",R.drawable.kipas_sekai));
        kipases.add(new Kipas("National Plus",
                "Deskripsi Produk\n" +
                        "WALL FAN NATIONAL PLUS / N.PLUS 16 INCH\n" +
                        "HARGA TERMURAH LANGSUNG DARI PABRIK\n" +
                        "ANGIN TERJAMIN KENCANG DENGAN 3 TINGKAT KECEPATAN \n" +
                        "2 TALI TARIKAN LEBIH MUDAH DI OPERASIKAN\n" +
                        "KUALITAS PREMIUM HARGA TERBAIK\n" +
                        "BANDINGKAN HARGA  TOKO SEBELAH\n" +
                        "SNI DAN KAWAT MESIN TEMBAGA LEBIH AWET.", R.drawable.kipas_nationalplus));
        kipases.add(new Kipas("Panasonic",
                "Deskripsi Produk\n" +
                        "Product model: P9\n" +
                        "Main material: aluminum + ABS plastic + silicon steel sheet (motor) + PP material (fan blade)\n" +
                        "Battery type: lithium battery 18650\n" +
                        "Battery capacity: 3.7V 7200mAh\n" +
                        "Product size (approx.): closed state: 197*197*92.5mm/7.76*7.76*3.64in, unfolded state: 197*197*974mm/7.76*7.76*38.35in\n" +
                        "Wind speed gear: 3+1\n" +
                        "Product color: cherry powder, white,\n" +
                        "Power cord length (approx.): 1.5m/4.92ft \n" +
                        "Net weight of single product: 829.5g\n" +
                        "Control method: push button\n" +
                        "Air supply principle: air circulation\n" +
                        "Wind mode: 1st gear: soft wind/2 files: refreshing wind / 3 files: strong wind / 4 files: natural wind\n" +
                        "Working time: 4-10 hours\n" +
                        "Applicable scene: outdoor camping, car, office, home, kitchen, etc.",R.drawable.kipas_panasonic));
        return kipases;
    }
    private static List<Tv> initDataTv(Context ctx) {
        List<Tv> tvs = new ArrayList<>();
        tvs.add(new Tv("SONY",
                "Deskripsi\n" +
                        "Ukuran: 40 inch\n" +
                        "Resolusi: 1920 x 1080 (Full HD)\n" +
                        "Clear Resolution Enhancer\n" +
                        "X-Protection PRO\n" +
                        "Konektivitas: HDMI/USB", R.drawable.tv_sony));
        tvs.add(new Tv("Toshiba",
                "Deskripsi\n" +
                        "Ukuran: 40 inch\n" +
                        "Resolusi: 1366 x 768\n" +
                        "Audio: Dolby Digital\n" +
                        "Tuner: Digital & Analog\n" +
                        "Konektivitas: HDMI/USB\n" +
                        "Sound Mode : Standard; Music; Movie; Sports;User", R.drawable.toshiba));
        tvs.add(new Tv("PHILIPS",
                "Deskripsi\n" +
                        "32\"\n" +
                        "Slim LED TV\n" +
                        "Digital Crystal Clear\n" +
                        "Resolusi : 1366 x 768p\n" +
                        "HDMI\n" +
                        "USB", R.drawable.philips));
        tvs.add(new Tv("NIKO",
                        "Ukuran : 39 Inch\n" +
                        "Resolusi: 1366 x 768 (HD Ready)\n" +
                        "Konsumsi Daya: 65 Watt\n" +
                        "Tegangan: 220 Volt\n" +
                        "AV Mode\n" +
                        "Plug and play USB movie\n" +
                        "Multiple Input", R.drawable.niko));
        tvs.add(new Tv("COOCAA",
                "Deskripsi\n" +
                        "Ukuran : 24 Inch\n" +
                        "Resolusi Layar : 1366 x 768\n" +
                        "Dolby Audio\n" +
                        "Konektifitas : HDMI; USB\n" +
                        "Panel IPS", R.drawable.coocaa));
        tvs.add(new Tv("CHANGHONG",
                "Deskripsi\n" +
                        "Ukuran: 32 inch\n" +
                        "Resolusi: 1366 x 768 (HD Ready)\n" +
                        "Konektivitas: HDMI/USB/VGA\n" +
                        "Slim Bezzel\n" +
                        "Eco Friendly\n" +
                        "UC Pro Engine\n" +
                        "WCG", R.drawable.changhong));
        return tvs;
    }
    private static void initAllAlats(Context ctx) {
        alats.addAll(initDataKipas(ctx));
        alats.addAll(initDataKulkas(ctx));
        alats.addAll(initDataTv(ctx));

    }

    public static List<Alat> getAllAlat(Context ctx) {
        if (alats.size() == 0) {
            initAllAlats(ctx);
        }
        return  alats;
    }

    public static List<Alat> getAlatsByTipe(Context ctx, String jenis) {
        List<Alat> alatsByType = new ArrayList<>();
        if (alatsByType.size() == 0) {
            initAllAlats(ctx);
        }
        for (Alat o : alats) {
            if (o.getJenis().equals(jenis)) {
                alatsByType.add(o);
            }
        }
        return alatsByType;
    }

}







