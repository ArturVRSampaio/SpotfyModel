package Main;
    import Usuario.Usuario;

    import Plano.Plano;

    import Criador.Criador;
    import Criador.Artista;
    import Criador.Banda;
    import Criador.PodCaster;

    import Conteudo.Conteudo;
    import Conteudo.Musica;
    import Conteudo.Podcast;

    import Conjunto.Conjunto;
    import Conjunto.Album;
    import Conjunto.Playlist;
    import Conjunto.Temporada;

    import Cobranca.Cobranca;
    import Cobranca.Cartao;
    import Cobranca.Boleto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Avaliacao.Avaliacao;
import Avaliacao.AvaliacaoAlbum;
import Avaliacao.AvaliacaoArtista;
import Avaliacao.AvaliacaoMusica;
import Avaliacao.AvaliacaoPlaylist;
import Pagamento.Pagamento;


public class Main {
    public static void main (String[] args) {

        //criando planos
        Plano planoFree = new Plano("free", 0);
        Plano planoPrem = new Plano("prem", 60);

        // criando usuarios
        Usuario user1 = new Usuario("usuario1", Calendar.getInstance(), planoFree);
        Usuario user2 = new Usuario("usuario2", Calendar.getInstance(), planoPrem);


        //cobrando plano de usuarios 
        Cobranca cobranca1 = new Cobranca(user1, 12);
        Cobranca cobranca2 = new Cobranca(user2, 12); 

        //pagando cobrancas
        Pagamento pag1 = new Pagamento(cobranca1, Calendar.getInstance(), 0);
        Pagamento pag2 = new Pagamento(cobranca2, Calendar.getInstance(), 0);

        
        Artista artista1 = new Artista("ozzy", "ozzy.com", Calendar.getInstance());
        Artista artista2 = new Artista("iommy", "iommy.com", Calendar.getInstance());
        Banda banda1 = new Banda("blackSabbath", "sabbath.com", Calendar.getInstance());
        
        List<Artista> integrantesSabbath = new ArrayList<Artista>();
        integrantesSabbath.add(artista1);
        integrantesSabbath.add(artista2);

        Album album1 = new Album("paranoid", "", "urlImagem.com", banda1, integrantesSabbath);

        Musica musica1 = new Musica("iron man", Calendar.getInstance(), "ironMan.com", album1, integrantesSabbath);

        Playlist playlist1 = new Playlist("minhas favoritas", "Definitivamente escute", "escutandoMusicaBoa.jpg", user1); 

        //avaliando
        AvaliacaoMusica avMus = new AvaliacaoMusica(user1, true, musica1);

        AvaliacaoPlaylist avPlay = new AvaliacaoPlaylist(user1, true, playlist1);

        AvaliacaoArtista avArt = new AvaliacaoArtista(user1, true, artista1);

        AvaliacaoAlbum avAlb = new AvaliacaoAlbum(user1, true, album1);



        
        




    }
}
