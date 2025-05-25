public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2001);
        carro.setNumeroDePortas(2);

        moto.setMarca("Honda");
        moto.setModelo("CB 500");
        moto.setAno(2022);
        moto.setTipoDeGuidao("Esportivo");

        Util.clear();
        carro.exibirDetalhes();

        System.out.println();

        moto.exibirDetalhes();
    }
}