package api;

public interface DiccionarioMultipleTDA {

    void InicializarDiccionario(); // sin precondiciones

    void Agregar(int clave, int valor); // diccionario inicializado

    void Eliminar(int clave); // diccionario inicializado

    void EliminarValor(int clave, int valor); // diccionario inicializado

    ConjuntoTDA Recuperar(int clave); // diccionario inicializado

    ConjuntoTDA Claves(); // diccionario inicializado
}