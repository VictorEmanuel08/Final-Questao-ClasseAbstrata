package entities;

public class Locadora {
    public static void main(String[] args) {
        Veiculo estoque[];

        estoque = new Veiculo[5];

        estoque[0] = new Carro("CAMARO", "PSG 0290", 50f);
        estoque[1] = new Moto("FAN", "PSL 3325", 20f, 5f);
        estoque[2] = new Moto("BROSS", "PTP 3134", 15f, 3f);
        estoque[3] = new Carro("STRADA", "KDB 9658", 60f);
        estoque[4] = new Carro("GOL", "CRM 4356", 45f);

        for (Veiculo v: estoque){
            System.out.println("Veiculo v = " + v.getModelo() + " / Aluguel = R$ " + v.valorAluguel(5));
        }
    }
}
