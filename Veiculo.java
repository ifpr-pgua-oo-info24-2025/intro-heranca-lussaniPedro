public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    /* Getters */
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    /* Setters */
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    /* Methods */
    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}