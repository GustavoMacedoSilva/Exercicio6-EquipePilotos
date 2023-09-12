public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral = 0;
    private int id;

    void correr(Carro carro){
        carro.correr();
    }

   Piloto(String nome, int idade, String nacionalidade, int id){
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.id = id;
    }

    public void setidGeral() {
        Piloto.idGeral += 1;
    }

    public void setDownIdGeral(){
        Piloto.idGeral -= 1;
    }

    public int getId(){
        return id;
    }
    
    public int getidGeral(){
        return idGeral;
    }

    

    public String getNome() {
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
}