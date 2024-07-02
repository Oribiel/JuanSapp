/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package juatsapppersistencia;

import colecciones.ChatColeccion;
import colecciones.DireccionColeccion;
import colecciones.MensajeColeccion;
import colecciones.UsuarioColeccion;
import daos.ChatDAO;
import daos.ConexionBD;
import daos.UsuarioDAO;
import interfaces.IConexionBD;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author oribi
 */
public class JuatsappPersistencia {

    public static void main(String[] args) {
        IConexionBD conexionBD = new ConexionBD();
//        UsuarioDAO usuarioDAO = new UsuarioDAO(conexionBD);
//        UsuarioColeccion usuario = new UsuarioColeccion("Marcos","2231");
//        DireccionColeccion direccion = new DireccionColeccion("Obregon","Miravalle","Armagedon","2721");
//        usuario.setDireccion(direccion);
//        usuarioDAO.crearUsuario(usuario);
        
        ChatDAO chatDAO = new ChatDAO();
//        List<MensajeColeccion> mensajes = new ArrayList<>();
//        ChatColeccion chat = new ChatColeccion(mensajes,"6441711500","6442746400");
//        
//        chatDAO.crearChat(chat);
        
        MensajeColeccion mensaje = new MensajeColeccion("hola3", new Date(),"6441711586","6442746423");
        MensajeColeccion mensaje2 = new MensajeColeccion("buenas", new Date(),"6441711586","6442746423");
        List<MensajeColeccion> mensajes = new ArrayList<>();
        mensajes.add(mensaje);
        mensajes.add(mensaje2);
        chatDAO.agregarMensaje(mensajes, mensaje.getEmisor(), mensaje.getReceptor());
    }
}
