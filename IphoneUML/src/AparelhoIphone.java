public class AparelhoIphone implements AparelhoIpod, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no iPhone.");
    }
    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no iPhone.");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no iPhone.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador.");
    }
    @Override
    public void pesquisarPagina() {
        System.out.println("Pesquisando página no navegador.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador.");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Fazendo ligação no Iphone.");
    }
    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação no Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone.");
    }

    public static void main(String[] args) {
        AparelhoIphone iphone = new AparelhoIphone();
        
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        iphone.exibirPagina();
        iphone.pesquisarPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.fazerLigacao();
        iphone.atenderLigacao();
        iphone.iniciarCorreioVoz();
    }
}

