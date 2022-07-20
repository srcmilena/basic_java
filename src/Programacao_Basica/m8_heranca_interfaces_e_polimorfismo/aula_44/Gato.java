package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
