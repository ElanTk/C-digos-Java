public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        piloto1.nome = "Bowser";
        piloto1.vilao = true;
        Piloto piloto2 = new Piloto();
        piloto2.nome = "Yoshi";


        Kart kart1 = new Kart();
        kart1.nome = "koopaKingThrone";
        kart1.dono = piloto1;
        kart1.motor.cilindradas = "13.5";
        kart1.motor.velocidadeMaxima = 100;
        Kart kart2 = new Kart();
        kart2.nome = "eggMobile";
        kart2.dono = piloto2;
        kart2.motor.cilindradas = "15.5";
        kart2.motor.velocidadeMaxima = 170;
        Kart kart3 = new Kart();
        kart3.nome = "randomKart";
        kart3.motor.cilindradas = "2.5";
        kart3.motor.velocidadeMaxima = 12;

        piloto1.soltaSuperPoder();
        kart2.pular();
        kart2.fazerDrift();
        kart1.soltarTurbo();
        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();
    }
}