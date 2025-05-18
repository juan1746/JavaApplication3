// objeto_acceso_datos/IBaseDAO.java
package objeto_acceso_datos;

public interface IBaseDAO<T> {
    void crear(T entidad);
    T leer(int id);
    void actualizar(T entidad);
    void eliminar(int id);
    // Add other methods as needed (e.g., getAll(), findByName())
}