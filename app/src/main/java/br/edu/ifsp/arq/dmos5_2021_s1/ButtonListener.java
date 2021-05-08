package br.edu.ifsp.arq.dmos5_2021_s1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ButtonListener implements View.OnClickListener {

    private TextView textoentrada;
    private float calculoadicao;
    private float calculosubtracao;
    int tamanho;
    //String array[] = new String[tamanho];
    float[] saldo = new float[10];

    public ButtonListener(TextView mtexto) {

        textoentrada = mtexto;
    }
    public void iniciajogador(){

       if(int i:saldo[tamanho])
           saldo[tamanho] = 15000;

    }

    @Override
    public void onClick(View v) {
        Button b1 = (Button) v;
        
        if (b1.getText().equals("Jogadores")) {
            switch (Integer.parseInt(textoentrada.getText().toString())) {
                case 2:
                    tamanho = 2;
                    break;
                case 3:
                    tamanho = 3;
                    break;
                case 4:
                    tamanho = 4;
                    break;
                case 5:
                    tamanho = 5;
                    break;
                case 6:
                    tamanho = 6;
                    break;

            }
            textoentrada.setText("");
        }

        if(b1.getText().equals("Jogador")) {
            iniciajogador();
            textoentrada.setText("");
                if (Integer.parseInt(textoentrada.getText().toString()) >= tamanho) {
                    textoentrada.setText("Jogador Inexistente");
                } else {

                    if (b1.getText().equals("+")) {


                        if (b1.getText().equals("M")) {
                            calculoadicao = Float.parseFloat(textoentrada.getText().toString());

                            saldo[tamanho] += (int) (calculoadicao * 1000);
                            textoentrada.setText("" + saldo[tamanho]);
                        }
                        if (b1.getText().equals("K")) {
                            calculoadicao = Float.parseFloat(textoentrada.getText().toString());
                            saldo[tamanho] += (int) (calculoadicao);
                            textoentrada.setText("" + saldo[tamanho]);
                        }

                        if (b1.getText().equals("➡️")) {
                            calculoadicao = Float.parseFloat(textoentrada.getText().toString());
                            saldo[tamanho] += 2000;
                            textoentrada.setText("" + saldo[tamanho]);
                        }
                    }
                    else {
                        if (b1.getText().equals("-")) {

                            if (b1.getText().equals("M")) {
                                calculosubtracao = Float.parseFloat(textoentrada.getText().toString());
                                saldo[tamanho] -= (int) (calculoadicao * 1000);
                                textoentrada.setText("" + saldo[tamanho]);
                            }
                            if (b1.getText().equals("K")) {
                                calculosubtracao = Float.parseFloat(textoentrada.getText().toString());
                                saldo[tamanho] -= (int) calculosubtracao;
                                textoentrada.setText("" + saldo[tamanho]);
                            }
                        }

                    }
                }


            }
        textoentrada.append(b1.getText());
        if (b1.getText().equals("?")) {
            textoentrada.setText("mensagem aleatório sobre o jogo");
        }
        if (b1.getText().equals("C")) {
            textoentrada.setText("");
        }
        }

    }

