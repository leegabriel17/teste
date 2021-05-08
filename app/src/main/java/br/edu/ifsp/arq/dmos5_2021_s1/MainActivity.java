package br.edu.ifsp.arq.dmos5_2021_s1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mjogador;
    private Button macrescentar;
    private Button mdescontar;
    private Button mjogadores;
    private TextView mtexto;
    private Button mK;
    private Button mM;
    private Button mInterrogacao;
    private Button m9;
    private Button m8;
    private Button m7;
    private Button m6;
    private Button m5;
    private Button m4;
    private Button m3;
    private Button m2;
    private Button m1;
    private Button m0;
    private Button mC;
    private Button mPonto;
    private Button mSetafrente;
    private ButtonListener btlistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setlayout();

        btlistener = new ButtonListener(mtexto);

        mSetafrente.setOnClickListener(btlistener);
        m0.setOnClickListener(btlistener);
        m1.setOnClickListener(btlistener);
        m2.setOnClickListener(btlistener);
        m3.setOnClickListener(btlistener);
        m4.setOnClickListener(btlistener);
        m5.setOnClickListener(btlistener);
        m6.setOnClickListener(btlistener);
        m7.setOnClickListener(btlistener);
        m8.setOnClickListener(btlistener);
        m9.setOnClickListener(btlistener);
        mC.setOnClickListener(btlistener);
        mM.setOnClickListener(btlistener);
        mK.setOnClickListener(btlistener);
        mPonto.setOnClickListener(btlistener);
        mInterrogacao.setOnClickListener(btlistener);
        macrescentar.setOnClickListener(btlistener);
        mjogador.setOnClickListener(btlistener);
        mjogadores.setOnClickListener(btlistener);
        mdescontar.setOnClickListener(btlistener);


    }

    public void setlayout(){

        mtexto = findViewById(R.id.textsaida);
        m0 = findViewById(R.id.button0);
        m1 = findViewById(R.id.button1);
        m2 = findViewById(R.id.button2);
        m3 = findViewById(R.id.button3);
        m4 = findViewById(R.id.button4);
        m5 = findViewById(R.id.button5);
        m6 = findViewById(R.id.button6);
        m7 = findViewById(R.id.button7);
        m8 = findViewById(R.id.button8);
        m9 = findViewById(R.id.button9);
        mM = findViewById(R.id.buttonM);
        mK = findViewById(R.id.buttonK);
        mC = findViewById(R.id.buttonC);
        mInterrogacao = findViewById(R.id.buttoninterrogacao);
        mPonto = findViewById(R.id.buttonponto);
        mSetafrente = findViewById(R.id.buttonseta);
        macrescentar = findViewById(R.id.buttonacrescentar);
        mjogador = findViewById(R.id.buttonjogador);
        mdescontar = findViewById(R.id.buttondescontar);
        mjogadores=findViewById(R.id.buttonjogadores);
    }

}