package controller;

import java.util.List;

/**
 *
 * @author Rony VC
 */
public interface MetodosDAO_AsesoriasUCSS {
    public String Agregar_a_BD(Object obj);
    public String Eliminar_de_BD(Object obj);
    public String Actulizar_en_BD(Object obj);
    public  List<?> getRegistros_de_BD();
    public  String getCancionFiltro(String CODCAN);
}
