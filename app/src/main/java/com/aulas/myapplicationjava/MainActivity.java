package com.aulas.myapplicationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] funcionarios = {0123, 0231, 0321, 0322};
        System.out.println(funcionarios[1]);

        String[] nomes = {"Pedro", "Henrique", "Vieira"};
        System.out.println(nomes[2]);

        int v1 = 2;

        switch (v1) {
            case 1:
                System.out.println("Falar com atendente ");
                break;
            case 2:
                System.out.println("Verificar saldo ");
                break;
            default:
                System.out.println("Opcao in valida ");
                break;
        }

    }
}