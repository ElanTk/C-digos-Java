import br.inatel.cdg.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setCpf(2105421920);
        cliente1.setNome("Marquinhos da Quadrilha");
        cliente1.conta.setNumero(321);
        cliente1.conta.setLimite(3000);

        cliente1.conta.deposita(50000);
        System.out.println(cliente1.getNome() + " dono da conta " + cliente1.conta.getNumero());
        System.out.println("Saldo: " + cliente1.conta.getSaldo());
        cliente1.conta.sacar(2200);
        System.out.println("Saldo: " + cliente1.conta.getSaldo());

    }
}