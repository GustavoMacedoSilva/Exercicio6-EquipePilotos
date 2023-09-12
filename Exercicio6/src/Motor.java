public class Motor {
    private int potencia;
    private boolean turbo;

    Motor(int potencia, boolean turbo){
        this.potencia = potencia;
        this.turbo = turbo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean getTurbo(){
        return turbo;
    }
}
