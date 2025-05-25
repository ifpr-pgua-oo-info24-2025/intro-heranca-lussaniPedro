public class Moto extends Veiculo {
    private String tipoDeGuidao;

    /* Getters */
    public String getTipoDeGuidao(){
        return tipoDeGuidao;
    }

    /* Setters */
    public void setTipoDeGuidao(String tipoDeGuidao){
        this.tipoDeGuidao = tipoDeGuidao;
    }

    /* Methods */
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo de guidao: " + tipoDeGuidao);
    }
}