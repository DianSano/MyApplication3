package id.co.blogspot.diansano.myapplication3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Persegi extends AppCompatActivity {
    EditText etpanjang, etlebar, etHasil;
    TextView tvhasil;
    Button mbtnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        Random random = new Random();
        int panjang = random.nextInt(10) + 2;
        int lebar = random.nextInt(panjang);
        etpanjang = findViewById(R.id.edpanjang);
        etlebar = findViewById(R.id.edlebar);
        etHasil = findViewById(R.id.ethasil);
        etpanjang.setText("" + panjang);
        etlebar.setText(""+lebar);
        tvhasil = findViewById(R.id.tv_hasil);
        mbtnhitung = findViewById(R.id.btnhitung);
        mbtnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spanjang = etpanjang.getText().toString();
                String slebar = etlebar.getText().toString();
                String sHasil = etHasil.getText().toString();
                if (sHasil.equals("")) {
                    Toast.makeText(getApplicationContext(), "Ada kesalahan hasil [kosong]?", Toast.LENGTH_SHORT).show();
                    return;
                }
                int panjang = Integer.parseInt(spanjang);
                int lebar = Integer.parseInt(slebar);
                int hasil = Integer.parseInt(sHasil);
                int luas = panjang * lebar;

                if (hasil == luas) {
                    tvhasil.setText("Benar!");
                } else {
                    tvhasil.setText("Belum Benar!");
                }


            }
        });
    }

}
