public class Equipe {
    private Carro carro;
    private Piloto piloto[] = new Piloto[4];
    private Piloto pilotoAtual;
    private String nome;

    private boolean trocarPilotoAtual(int pilotoid){
        for(int i = 0; i < piloto.length; i++){
            if(piloto[i] != null && piloto[i].getId() == pilotoid){
                pilotoAtual = piloto[i];
                return true;
            }
        }
        return false;
    }
    
    private boolean trocarPneu(int tipoDePneu){
        if(tipoDePneu > 0 && tipoDePneu < 6){
            this.carro.settipoDePneu(tipoDePneu);
            return true;
        }
        else{
            return false;
        }
    }

    public void pitStop(int tipoDePneu, int pilotoid){
        if(trocarPilotoAtual(pilotoid) == true && trocarPneu(tipoDePneu) == true){
            System.out.println("Operação foi um sucesso!");
        }
        else{
            System.out.println("Operação falhou!");
        }
    }
    
    public boolean adicionarPiloto(Piloto piloto){
        for (int i = 0; i < this.piloto.length; i++){
            if(this.piloto[i] == null){
                this.piloto[i] = piloto;
                pilotoAtual = piloto;
                this.piloto[i].setidGeral();
                return true;
            }
        }
        return false;
    }

    public boolean retirarPiloto(int pilotoid){
        for(int i = 0; i < piloto.length; i++){
            if(piloto[i] != null && piloto[i].getId() == pilotoid){
                piloto[i].setDownIdGeral();
                piloto[i] = null;
                return true;
            }
        }
        return false;
    }

    public Equipe(String nome, int tipoPneu, int potencia, boolean turb){
        this.nome = nome;
        carro = new Carro(tipoPneu, potencia, turb);
    }
     
    public void getPilotoAtual() {
        System.out.println(pilotoAtual.getNome());;
    }

    public void mostrarPilotos(){
        for (int i = 0; i < piloto.length; i++){
            if(piloto[i] != null){
                System.out.println(piloto[i].getNome());
            }
        }
    }

    public void showTeam(){
        System.out.println("Pilotos na Equipe: ");
        for (int i = 0; i < this.piloto.length; i++){
            if(piloto[i] != null){
                System.out.println(this.piloto[i].getNome());
            }
        }
        System.out.println("Nome da Equipe: " + this.nome);
        
        System.out.println("Tipo de pneu do carro: " + this.carro.getTipoDePneu());
        System.out.println("Motor: ");
        this.carro.mostrarMotor();
    }
}