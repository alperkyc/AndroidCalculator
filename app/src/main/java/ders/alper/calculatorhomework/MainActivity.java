package ders.alper.calculatorhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.spec.ECField;

public class MainActivity extends AppCompatActivity {

    EditText result;
    Button btn7, btn8, btn9, btn4, btn5, btn6, btn1, btn2, btn3, btn0, btnC, btnBölme, btnCarpma, btnCikarma,
            btnToplama, btnEsittir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.etEkran);
        btnC = findViewById(R.id.btnC);
        btnBölme = findViewById(R.id.btnBölme);
        btnCarpma = findViewById(R.id.btnCarpma);
        btnCikarma = findViewById(R.id.btnCikarma);
        btnToplama = findViewById(R.id.btnToplama);
        btnEsittir = findViewById(R.id.btnEsit);


    }

    String number = null;

    public void clickNumber(View v) {
        if (number == null) {

            number = v.getTag().toString();

        } else {
            number = number + v.getTag().toString();
        }


        result.setText(number);


    }

    public void temizle(View v) {
        number = null;
        result.setText(String.valueOf(0));
        sayi1 = 0;
        sayi2 = 0;


    }

    int sayi1 = 0;
    int sayi2 = 0;
    int id = 0;

    public void topla(View v) {



        //birinci sayı
        if (sayi1 == 0) {
            sayi1 = Integer.parseInt(result.getText().toString());
        }
        //ikinci sayi
        else {
            sayi2 = Integer.parseInt(result.getText().toString());
        }

        sayi2 = sayi1 + sayi2;
        sayi1 = sayi2;
        result.setText(String.valueOf(sayi2));
        sayi2 = 0;
        number = null;
        id = v.getId();


    }

    public void Cikar(View v) {
        //birinci sayı
        if (sayi1 == 0) {
            sayi1 = Integer.parseInt(result.getText().toString());
        }
        //ikinci sayi
        else {
            sayi2 = Integer.parseInt(result.getText().toString());
        }

        sayi2 = sayi1 - sayi2;
        sayi1 = sayi2;
        result.setText(String.valueOf(sayi2));
        sayi2 = 0;
        number = null;
        id = v.getId();

    }


    public void carp(View v) {
        sayi2 = 1;
        //birinci sayı
        if (sayi1 == 0) {
            sayi1 = Integer.parseInt(result.getText().toString());
        }
        //ikinci sayi
        else {
            sayi2 = Integer.parseInt(result.getText().toString());
        }


        sayi2 = sayi1 * sayi2;
        sayi1 = sayi2;
        result.setText(String.valueOf(sayi2));
        sayi2 = 1;
        number = null;
        id = v.getId();

    }

    public void böl(View v) {

        sayi2 = 1;
        //birinci sayı
        if (sayi1 == 0) {
            sayi1 = Integer.parseInt(result.getText().toString());
        }
        //ikinci sayi
        else {
            sayi2 = Integer.parseInt(result.getText().toString());
        }


        try {

            result.setText(String.valueOf(0));


            sayi2 = sayi1 / sayi2;
            sayi1 = sayi2;
            result.setText(String.valueOf(sayi2));

            number = null;
            id = v.getId();

        } catch (Exception exception) {
            result.setText(String.valueOf("0 'a Bölünemez"));
        }


    }


    public void esittir(View v) {
        switch (id) {
            case R.id.btnToplama:
                topla(btnToplama);
                id=0;
                break;
            case R.id.btnCarpma:
                carp(btnCarpma);
                id=0;
                break;
            case R.id.btnCikarma:
                Cikar(btnCikarma);
                id=0;
                break;
            case R.id.btnBölme:
                böl(btnBölme);
                id=0;
                break;
        }

    }

}
