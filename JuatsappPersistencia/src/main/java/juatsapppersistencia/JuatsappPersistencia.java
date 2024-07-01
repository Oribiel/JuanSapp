/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package juatsapppersistencia;

import colecciones.DireccionColeccion;
import colecciones.UsuarioColeccion;
import daos.ConexionBD;
import daos.UsuarioDAO;
import interfaces.IConexionBD;

/**
 *
 * @author oribi
 */
public class JuatsappPersistencia {

    public static void main(String[] args) {
        IConexionBD conexionBD = new ConexionBD();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexionBD);
        UsuarioColeccion usuario = new UsuarioColeccion("Marcos","2231");
        DireccionColeccion direccion = new DireccionColeccion("Obregon","Miravalle","Armagedon","2721");
        usuario.setDireccion(direccion);
        usuarioDAO.crearUsuario(usuario);
    }
}
