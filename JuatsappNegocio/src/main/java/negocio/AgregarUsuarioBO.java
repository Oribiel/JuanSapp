/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import colecciones.UsuarioColeccion;
import static convertidores.ConvertidorUsuario.convertirDTOAColeccion;
import daos.UsuarioDAO;
import dtos.UsuarioDTO;
import excepciones.PersistenciaException;
import interfaces.IAgregarUsuario;
import interfaces.IUsuarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author filor
 */
public class AgregarUsuarioBO implements IAgregarUsuario{
    private IUsuarioDAO usuarioDAO;

    public AgregarUsuarioBO() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
//    public AgregarUsuarioBO() {
//        this.usuarioDAO = new UsuarioDAO();
//    }
    
    
    
    @Override
    public void agregarUsuarioBO(UsuarioDTO usuarioDTO){
        UsuarioColeccion usuario;
        try {
            usuario = convertirDTOAColeccion(usuarioDTO);
            usuarioDAO.crearUsuario(usuario);
        } catch (PersistenciaException ex) {
            Logger.getLogger(AgregarUsuarioBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
