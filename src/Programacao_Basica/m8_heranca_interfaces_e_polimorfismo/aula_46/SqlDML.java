package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_46;

public interface SqlDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}
