public class App {
    public static void main(String[] args) throws Exception {
        Equipe equipe1 = new Equipe("Equipe Mario", 2, 120, true);
        Piloto piloto1 = new Piloto("Mario", 32, "Italiano", 6);
        Piloto piloto2 = new Piloto("Luigi", 32, "Italiano", 9);

        //adiciona os pilotos
        equipe1.adicionarPiloto(piloto1);
        equipe1.adicionarPiloto(piloto2);

        System.out.print("Piloto atual: ");
        equipe1.getPilotoAtual();

        System.out.println(); //pula uma linha no terminal

        equipe1.pitStop(3, 6);//troca o tipo de pneu e o piloto

        System.out.print("Piloto atual: ");
        equipe1.getPilotoAtual();

        System.out.println();
        System.out.println("Id geral da Equipe: " + piloto1.getidGeral());

        equipe1.retirarPiloto(9); //retira um piloto

        
        System.out.println("Mostrando todos os pilotos da equipe:");
        equipe1.mostrarPilotos();

        System.out.println();
        System.out.println("Id geral da Equipe: " + piloto1.getidGeral());

        //

        equipe1.showTeam();
    }
}
