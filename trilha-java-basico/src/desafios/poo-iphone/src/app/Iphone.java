package app;

import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        //Reprodutor Musical
        System.out.println("-----REPRODUTOR MUSICAL----");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("The Scientist");

        System.out.println();
        System.out.println("-----APARELHO TELEFÔNICO----");
        //Aparelho Telefonico
        iphone.ligar("(73) 98474-4374");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();
        System.out.println("-----NAVEGADOR----");
        //Navegador de internet
        iphone.exibirPagina("www.google.com");
        iphone.abriNovaAba();
        iphone.atualizarPagina();
    }




    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void abriNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada " + musica);
    }
}
