package com.example.aplikasisemester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void pesanBodyguard(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+"+6287889893241"+"&text="+"Saya Membutuhkan Jasa BodyGuard Anda Sekarang"));
        startActivity(intent);

    }

    public void pesanDukun(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+"+6287889893241"+"&text="+"Saya Membutuhkan Jasa Santet Anda Sekarang"));
        startActivity(intent);
    }

    public void pesanMontir(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + "+6287889893241" + "&text=" + "Saya Membutuhkan Jasa Montir Anda Sekarang"));
        startActivity(intent);
    }
}