package id.co.blogspot.diansano.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btnTekan, mPindah;
TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.text);
        btnTekan = findViewById(R.id.btntekan);
        mPindah = findViewById(R.id.btnpindah);
        btnTekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText("selamat pagi");
            }
        });
        mPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah = new Intent(MainActivity.this,Persegi.class);
                startActivity(iPindah);
            }
        });
    }
}
