package Main;
    import Usuario.Usuario;
    import Usuario.UsuarioFree;
    import Usuario.UsuarioPremium;

    import Criador.Criador;
    import Criador.Artista;
    import Criador.Banda;
    import Criador.PodCaster;

    import Conjunto.Conjunto;
    import Conjunto.Album;
    import Conjunto.Playlist;
    import Conjunto.Temporada;

    import Conteudo.Conteudo;
    import Conteudo.Musica;
    import Conteudo.Podcast;

    import Cobranca.Cobranca;
    import Cobranca.Cartao;
    import Cobranca.Boleto;


public class Main {
    public static void main (String[] args) {
        // criando users
        String nome ="userfree";
        String dtNascimento ="1234";
        UsuarioFree usuario1 = new UsuarioFree("asd", "asd");

        nome ="userpre1";
        dtNascimento ="1234";
        double mensalidade =1234;
        String vencimento ="1234";
        UsuarioPremium usuariopre1 = new UsuarioPremium(nome, dtNascimento);

        nome ="userpre2";
        dtNascimento ="1234";
        mensalidade =1234;
        vencimento ="1234";
        UsuarioPremium usuariopre2 = new UsuarioPremium(nome, dtNascimento);


        //criadores de conteudo
        nome ="podcaster1";
        String urlImagem= "123.com";
        String dtCriacao= "12345";
        PodCaster caster1= new PodCaster(nome, urlImagem, dtCriacao);
        nome ="banda1";
        urlImagem = "1234.com";
        dtCriacao ="12345";
        Banda banda1= new Banda(nome, urlImagem, dtCriacao);
        nome ="artista1";
        urlImagem = "1234.com";
        dtNascimento ="12345";
        Artista artista1= new Artista(nome, urlImagem, dtNascimento);

        //conteudos da plataforma

        nome ="musica1";
        dtCriacao="1234";
        String urlConteudo = "1234.com";
        urlImagem ="12345.com";

        Musica mus1= new Musica(nome, dtCriacao, urlConteudo, urlImagem, artista1, banda1);

        nome ="podcast1";
        dtCriacao="1234";
        urlConteudo = "1234.com";
        urlImagem ="12345.com";
        Podcast podcast1= new Podcast(nome, dtCriacao, urlConteudo, urlImagem, caster1 );

        // conjuntos de conteudos
        nome ="album1";
        String descricao = "novo album1";
        String urlConjunto ="conjunto.com";
        urlImagem ="img.com";
        String listaDeConteudo = "lista1";
        Album album1= new Album(nome, descricao, urlConjunto, urlImagem, listaDeConteudo, banda1);

        nome ="playlist1";
        descricao = "nova playlist1";
        urlConjunto ="conjunto.com";
        urlImagem ="img.com";
        listaDeConteudo = "lista1";
        Playlist playlist1= new Playlist(nome, descricao, urlConjunto, urlImagem, listaDeConteudo, usuario1);

        nome ="temp1";
        descricao = "nova temp1";
        urlConjunto ="conjunto.com";
        urlImagem ="img.com";
        listaDeConteudo = "lista1";
        Temporada temporada1= new Temporada(nome, descricao, urlConjunto, urlImagem, listaDeConteudo, caster1);

        // metodos de cobranca
        String valor ="123";
        String numeroCartao ="12354";
        String cvv =  "1234";
        String numero = "1234";
        nome= "nomecartao1";
        String validade= "12345";
        Cartao cartao1= new Cartao(valor, usuariopre1, numeroCartao, cvv, numero, nome, validade);

        valor ="123";

        String numeroBoleto = "12345";
        String validadeBoleto = "12345";
        String prazoCairBoleto = "12345";
        String valorDocumento = "12345";

        Boleto boleto1= new Boleto(valor, usuariopre2, numeroBoleto, validadeBoleto, prazoCairBoleto, valorDocumento);










    }
}
