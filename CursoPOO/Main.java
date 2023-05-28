import Animais.Cachorro;

public class Main{

    public static void main(String[] args){
        
        // Cachorro cachorro1;
        // cachorro1 = new Cachorro();

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marron", 25, 5.5, 5, "nada");

        // cachorro1.nome = "Puppy";
        // cachorro1.cor = "Marron";
        // cachorro1.altura = 25;
        // cachorro1.peso = 5.5;
        // cachorro1.tamanhoDoRabo = 5;

        // cachorro1.setNome("Puppy");
        // cachorro1.setCor("Marron");
        // cachorro1.setAltura(25);
        // cachorro1.setPeso(5.5);
        // cachorro1.setTamanhoDoRabo(5);

        // System.out.println(cachorro1);

        //cachorro1.latir();
        //cachorro1.pegar();
        //System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.interagir("Vai dormir!"));
        System.out.println("O cachorro esta " + cachorro1.interagir("Pisar na patinha"));
        

        //+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

        // System.out.println("Hello World!");

        // byte variavelByte = -127;
        // System.out.println(variavelByte);

        // //short -32768 a 32767
        // //char 0 a 65535
        // //int -2bi a 2bi
        // //long -9tri a 9tri

        // int variavelInt = 2940123;
        // System.out.println(variavelInt);

    }

}