public class Carro {
    private Motor motor;
    private int tipoDePneu;

    void correr(){
        System.out.println("Carro correu!");
    }

    public void settipoDePneu(int num_novo_pneu){
        this.tipoDePneu = num_novo_pneu;
    }

    public int getTipoDePneu() {
        return tipoDePneu;
    }

    Carro(int tipoDePneu, int potencia, boolean turbo){
        this.motor = new Motor(potencia, turbo);
        this.tipoDePneu = tipoDePneu;
    }

    public void mostrarMotor(){
        System.out.println("Potencia do motor: " + this.motor.getPotencia());
        System.out.print("Possui turbo: ");
        if(this.motor.getTurbo() == true){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
    }
}
