public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        piloto1.nome = "Bowser";
        piloto1.vilao = true;
        Piloto piloto2 = new Piloto();
        piloto2.nome = "Yoshi";

        Motor motorMk1 = new Motor();
        motorMk1.cilindradas = "13.5";
        motorMk1.velocidadeMaxima = 100;
        Motor motorMk2 = new Motor();
        motorMk2.cilindradas = "15.5";
        motorMk2.velocidadeMaxima = 170;
        Motor motorMeiaBomba = new Motor();
        motorMeiaBomba.cilindradas = "2.5";
        motorMeiaBomba.velocidadeMaxima = 12;

        Kart kart1 = new Kart();
        kart1.nome = "koopaKingThrone";
        kart1.dono = piloto1;
        kart1.motor = motorMeiaBomba;
        Kart kart2 = new Kart();
        kart2.nome = "eggMobile";
        kart2.dono = piloto2;
        kart2.motor = motorMk2;
        Kart kart3 = new Kart();
        kart3.nome = "randomKart";
        kart3.motor = motorMk1;

        piloto1.soltaSuperPoder(piloto2);
        kart2.pular();
        kart2.fazerDrift();
        kart1.soltarTurbo();
        motorMk2.mostraInfo();
        motorMeiaBomba.mostraInfo();
    }
}