package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_46;

public interface SqlDDL {

    void create(String query);
    void alter(String query);
    void drop(String query);
}
