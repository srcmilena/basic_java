package programacao_basica.m7_orientacao_a_objetos_e_java.aula_32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public String getMarca() { // pega o valor do atributo marca
        return this.marca;
    }

    public void setMarca(String marca) { // todos os métodos set são void pois não possuem retorno, já que vamos atribuir
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

}
