
import colecciones.UsuarioColeccion;
import daos.ConexionBD;
import daos.UsuarioDAO;
import interfaces.IConexionBD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author oribi
 */
public class JuatsappNegocio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        IConexionBD conexionBD = new ConexionBD();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexionBD);
        UsuarioColeccion usuario = new UsuarioColeccion("Mario","0987");
        
        usuarioDAO.crearUsuario(usuario);
    }
}
