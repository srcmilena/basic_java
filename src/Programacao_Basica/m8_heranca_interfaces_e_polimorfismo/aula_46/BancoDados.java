package programacao_basica.m8_heranca_interfaces_e_polimorfismo.aula_46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();
    void fecharConexao();
}
