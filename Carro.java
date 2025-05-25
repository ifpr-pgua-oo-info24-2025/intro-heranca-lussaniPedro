public class Carro extends Veiculo {
    private int numeroDePortas;

    /* Getters */
    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    /* Setters */
    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    /* Methods */
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Numero de portas: " + numeroDePortas);
    }
}