import Cobranca.Cobranca;
import Conteudo.Conjunto.Album;
import Conteudo.Conjunto.Playlist;
import Conteudo.Criador.Artista;
import Conteudo.Criador.Banda;
import Conteudo.Criador.PodCaster;
import Conteudo.Midia.Musica;
import Conteudo.Midia.Podcast;
import Pagamento.Pagamento;
import Plano.Plano;
import Usuario.Usuario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Main {
    public static void main (String[] args) throws Exception {

        //criando planos
        Plano planoFree = new Plano("free", 0);
        Plano planoPrem = new Plano("prem", 60);

        // criando usuarios
        Usuario artur = new Usuario("artur", Calendar.getInstance(), planoFree);
        Usuario aikau = new Usuario("aikau", Calendar.getInstance(), planoPrem);


        //cobrando plano de usuarios 
        Cobranca cobranca1 = new Cobranca(artur, 12);
        Cobranca cobranca2 = new Cobranca(aikau, 12);

        //pagando cobrancas
        Pagamento pag1 = new Pagamento(cobranca1, Calendar.getInstance(), 0);
        Pagamento pag2 = new Pagamento(cobranca2, Calendar.getInstance(), 0);


        //CONTEUDO

        //criadores
        Artista ozzy = new Artista(Calendar.getInstance(), "ozzy", "ozzy.com", "ozzy.jpg", "vocalista sabbath");
        Artista iommy = new Artista(Calendar.getInstance(), "iommy", "iommy.com", "iommy.jpg", "guitarrista sabbath");

        List<Artista> integrantesSabbath = new ArrayList<Artista>();
        integrantesSabbath.add(ozzy);
        integrantesSabbath.add(iommy);

        Banda sabbath = new Banda(Calendar.getInstance(), "black sabbath", "sabbath.com", "sabbath.jp", "creators of the metal");

        PodCaster dioLinux = new PodCaster(Calendar.getInstance(), "Diolinux", "diolinux.com", "tux.jpg", "podcast sobre linux e jogos");

        //Album, playlist
        Album paranoid = new Album(Calendar.getInstance(), "Paranoid", sabbath, integrantesSabbath);

        Playlist playlistRock = new Playlist(Calendar.getInstance(), "PlayRock", artur);

        //midia
        Musica warPigs = new Musica(Calendar.getInstance(), "War Pigs", Calendar.getInstance(), "1hora", sabbath, paranoid);

        Podcast fNvida= new Podcast(Calendar.getInstance(), "F* you Nvidia", Calendar.getInstance(), "1hora", dioLinux);


        //avaliando
        paranoid.exibe();
        artur.avalia(true, warPigs);
        aikau.avalia(false, fNvida);

        playlistRock.addMusica(warPigs);
        playlistRock.addMusica(warPigs);


    }
}
