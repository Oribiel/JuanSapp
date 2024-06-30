/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidores;

import colecciones.UsuarioColeccion;
import dtos.DireccionDTO;
import dtos.UsuarioDTO;
import encriptacion.Encriptacion;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author filor
 */
public class ConvertidorUsuario {

    public ConvertidorUsuario() {
    }
    
    
    /**
     * Convierte coleccion a dto
     * @param usuarioColeccion
     * @return
     * @throws PersistenciaException 
     */ 
    public static UsuarioDTO convertirEntidadADTO(UsuarioColeccion usuarioColeccion) throws PersistenciaException {
        UsuarioDTO usuarioDTO = new UsuarioDTO();

        // Asignar atributos simples
        asignarAtrivutosColeccionADTO(usuarioDTO, usuarioColeccion);

       

        // Desencriptar el nombre antes de asignarla al DTO
        String contraseña = Encriptacion.desencriptar(usuarioColeccion.getContraseña());
        usuarioDTO.setContraseña(contraseña);
        
        return usuarioDTO;
    }
    
    /**
     * 
     * @param usuarioDTO
     * @param usuarioColeccion 
     */
    public static void asignarAtrivutosColeccionADTO(UsuarioDTO usuarioDTO, UsuarioColeccion usuarioColeccion){
        usuarioDTO.setId(usuarioColeccion.getId());
        usuarioDTO.setUsuario(usuarioColeccion.getUsuario());
        usuarioDTO.setContraseña(usuarioColeccion.getContraseña());
        usuarioDTO.setTelefono(usuarioColeccion.getTelefono());
        usuarioDTO.setSexo(usuarioColeccion.getSexo());
        
        DireccionDTO direccion = new DireccionDTO(usuarioColeccion.getDireccion().getCiudad(),
        usuarioColeccion.getDireccion().getColonia(),
        usuarioColeccion.getDireccion().getCalle(),
        usuarioColeccion.getDireccion().getNumero());
        
        usuarioDTO.setDireccion(direccion);
        usuarioDTO.setContactos(usuarioColeccion.getContactos());
        usuarioDTO.setFotoPerfil(usuarioColeccion.getFotoPerfil());
        usuarioDTO.setFechaNacimiento(usuarioColeccion.getFechaNacimiento());
        
    }
    
    public static void asignarAtributosDTOAColeccion(UsuarioColeccion usuarioColeccion, UsuarioDTO usuarioDTO){
        
        usuarioColeccion.setContraseña(Encriptacion.encriptar(usuarioDTO.getContraseña()));
        
        usuarioColeccion.setUsuario(usuarioDTO.getUsuario());
        usuarioColeccion.setId(usuarioDTO.getId());
        usuarioColeccion.setSexo(usuarioDTO.getSexo());
        usuarioColeccion.setTelefono(usuarioDTO.getTelefono());
        usuarioColeccion.setFotoPerfil(usuarioDTO.getFotoPerfil());
        usuarioColeccion.setFechaNacimiento(usuarioDTO.getFechaNacimiento());
        
        
    }
}
