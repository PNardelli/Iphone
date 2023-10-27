package com.dio.Iphone.useCase;

import com.dio.Iphone.interfaces.AparelhoTelefonico;
import com.dio.Iphone.interfaces.NavegadorInternet;
import com.dio.Iphone.interfaces.ReprodutorMusical;

public class Iphone {

    ReprodutorMusical reprodutorMusical = new ReprodutorMusical() {
        @Override
        public void tocar() {

        }

        @Override
        public void pausar() {

        }

        @Override
        public void selecionarMusica() {

        }
    };

    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico() {
        @Override
        public void ligar() {

        }

        @Override
        public void atender() {

        }

        @Override
        public void inciarCorreioVoz() {

        }
    };

    NavegadorInternet navegadorInternet = new NavegadorInternet() {
        @Override
        public void exibirPagina() {

        }

        @Override
        public void adicionarNovaAba() {

        }

        @Override
        public void atualizarPagina() {

        }
    };
}
