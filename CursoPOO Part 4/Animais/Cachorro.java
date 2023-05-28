package Animais;

public class Cachorro extends Animal{

    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    // public Cachorro(){} //pattern constructor

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros ++;
    }

    public int getNumeroDeCachorros(){
        return numeroDeCachorros;
    }

    public void setNumeroDeCachorros(int numeroDeCachorros){
        this.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome.equals("lily")){
            this.nome = null;
        }
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito(){
        return this.estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito){
        this.estadoDeEspirito = estadoDeEspirito;
    }




    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        
        switch(acao){
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "Vai dormir!": this.estadoDeEspirito = "Bravo"; break;
            case "Pisar na patinha": this.estadoDeEspirito = "Triste"; break;
            default: this.estadoDeEspirito = "Neutro";
        }

        return this.estadoDeEspirito;
    }

    @Override
    public String toString(){
        return "Cachorro{" +
            "nome='" + nome + '\'' +
            '}';
    }

    @Override
    public void soar(){
        System.out.println("AU AU!!");
    }

}