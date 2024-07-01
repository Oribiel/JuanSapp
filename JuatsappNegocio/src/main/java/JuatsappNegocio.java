
import colecciones.DireccionColeccion;
import colecciones.UsuarioColeccion;
import daos.ConexionBD;
import daos.UsuarioDAO;
import dtos.DireccionDTO;
import dtos.UsuarioDTO;
import interfaces.IAgregarUsuario;
import interfaces.IConexionBD;
import interfaces.IUsuarioDAO;
import java.util.Date;
import negocio.AgregarUsuarioBO;

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
        DireccionDTO direccion = new DireccionDTO("Obregon","San anselmo","calle x","12c");
        Date fecha = new Date();
        
        UsuarioDTO usuarioDTO = new UsuarioDTO("Maria","contraseña","+526444321921","Ninja",direccion, fecha);
        IAgregarUsuario agregar = new AgregarUsuarioBO();
        
        agregar.agregarUsuarioBO(usuarioDTO);
    }
}
