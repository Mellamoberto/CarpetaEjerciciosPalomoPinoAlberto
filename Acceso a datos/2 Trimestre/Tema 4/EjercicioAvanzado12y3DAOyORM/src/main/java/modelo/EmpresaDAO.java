package modelo;

import java.util.List;
import modelo.Empresa;

public interface EmpresaDAO {
    void insertarEmpresa(Empresa empresa);
    void modificarEmpresa(Empresa empresa);
    void eliminarEmpresa(int id);
    Empresa mostrarEmpresa(int id);
    List<Empresa> mostrarTodasLasEmpresas();
}
