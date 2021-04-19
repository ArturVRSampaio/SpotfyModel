import Cobranca.Cobranca;
import Conteudo.Conjunto.Album;
import Conteudo.Conjunto.Playlist;
import Conteudo.Conjunto.Temporada;
import Conteudo.Conteudo;
import Conteudo.Criador.Banda;
import Conteudo.Criador.PodCaster;
import Conteudo.Midia.Midia;
import Conteudo.Midia.Musica;
import Conteudo.Midia.Podcast;
import Pagamento.Pagamento;
import Plano.Plano;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


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






        //CONTEUDO

        //criadores
        Artista ozzy = new Artista("ozzy", "ozzy.com", Calendar.getInstance());
        Artista iommy = new Artista("iommy", "iommy.com", Calendar.getInstance());

        List<Artista> integrantesSabbath = new ArrayList<Artista>();
        integrantesSabbath.add(ozzy);
        integrantesSabbath.add(iommy);

        Banda sabbath = new Banda("blackSabbath", "sabbath.com", Calendar.getInstance());

        PodCaster PodCaster1 = new PodCaster("null", "null", Calendar.getInstance());

        //Album, temporada
        Album paranoid = new Album("paranoid", "", "urlImagem.com", sabbath, integrantesSabbath);
        Temporada primeiraTemp = new Temporada("nome", "descricao", "urlImagem", PodCaster1);


        //midia
        Midia ironMan = new Musica("iron man", Calendar.getInstance(), "ironMan.com", paranoid, integrantesSabbath);







        Playlist playlistRock = new Playlist("minhas favoritas", "Definitivamente escute", "escutandoMusicaBoa.jpg", user1);

        



        List<Temporada> tempoaradaPodcast = new ArrayList<Temporada>();
        tempoaradaPodcast.add(primeiraTemp);

        Conteudo podcast1= new Podcast("nome", Calendar.getInstance(), "urlImagem.jpg",PodCaster1, listaTemporada, descricao)

        
        //avaliando
        ironMan.exibe();
        user1.avalia(true, ironMan);
        user1.avalia(true, podcast1);
        

        
        




    }
}
