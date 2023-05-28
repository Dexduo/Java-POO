import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Animais.Animal;
import Lojas.Petshop;

public class Main{

    public static void main(String[] args){

        // Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 10.5, 5, "nada");

        Gato gato1 = new Gato("Felix", "Preto", 2.5);
        Animal gato2 = new Gato("Felix", "Preto", 2.5);
        // Gato gato3 = new Animal("Felix", "Preto", 2.5); //Esta errado
        // Animal gato4 = new Animal("Felix", "Preto", 2.5); //Errado pois animal agora é abstrata
        Animal passaro1 = new Passaro("Felix", "Preto", 2.5);

        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 10.5, 5, "nada");
        Gato gato3 = new Gato("Felix", "Preto", 2.5);
        Passaro passaro2 = new Passaro("Felix", "Preto", 2.5);

        cachorro1.soar();
        gato3.soar();
        passaro2.soar();


        // Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        // petshop.darBanho(gato1);
        // System.out.println(gato1.getEstadoDeEspirito());

        // petshop.tosar(passaro1);
        // System.out.println(passaro1.getEstadoDeEspirito());

    }

}