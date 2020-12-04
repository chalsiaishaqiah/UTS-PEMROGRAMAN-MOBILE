package com.example.alatelektronik;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.alatelektronik.model.Alat;

import java.util.List;



public class GaleriActivity extends AppCompatActivity {

    List<Alat> alats;
    int indeksTampil = 0;
    String jenisAlat;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txDeskripsi,txJudul,txNama;
    ImageView ivFotoAlat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        jenisAlat= intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        alats = DataProvider.getAlatsByTipe(this, jenisAlat);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> alatPertama());
        btnTerakhir.setOnClickListener(view -> alatTerakhir());
        btnSebelumnya.setOnClickListener(view -> alatsSebelumnya());
        btnBerikutnya.setOnClickListener(view -> alatBerikutnya());

        txNama = findViewById(R.id.txNama);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoAlat = findViewById(R.id.gambarAlat);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Jenis-Jenis "+jenisAlat);
    }

    private void tampilkanProfil() {
        Alat p = alats.get(indeksTampil);
        Log.d("KIPAS","Menampilkan kipas"+p.getJenis());
        txNama.setText(p.getNama());
        txDeskripsi.setText(p.getDeskripsi());
        ivFotoAlat.setImageDrawable(this.getDrawable(p.getDrawableRes()));
    }

    private void alatPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void alatTerakhir() {
        int posAkhir = alats.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi_terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void alatBerikutnya() {
        if (indeksTampil == alats.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();

        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void alatsSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();

        }
    }
}
