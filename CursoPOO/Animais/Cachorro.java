package Animais;

public class Cachorro{

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Cachorro(){} //pattern constructor

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
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




    public void comer(){

    }

    public void latir(){
        System.out.println("AU AU");
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

        // if(acao.equals("carinho")){
        //     this.estadoDeEspirito = "Feliz";
        // } else if(acao.equals("Vai dormir!")){
        //     this.estadoDeEspirito = "Bravo";
        // } else if(acao.equals("Pisar na patinha")){
        //     this.estadoDeEspirito = "Triste";
        // } else {
        //     this.estadoDeEspirito = "Neutro";
        // }

        // return estadoDeEspirito;

    }

}