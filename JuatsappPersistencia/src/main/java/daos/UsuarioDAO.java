/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import colecciones.UsuarioColeccion;
import com.mongodb.client.MongoCollection;
import interfaces.IConexionBD;

/**
 *
 * @author filor
 */
public class UsuarioDAO {
    private IConexionBD conexionBD;

    public UsuarioDAO() {
    }

    public UsuarioDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    public void crearUsuario(UsuarioColeccion usuarioInsert){
        MongoCollection<UsuarioColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("usuarios", UsuarioColeccion.class);
        
        coleccion.insertOne(usuarioInsert);
        
        System.out.println("La persona fue agregada correctamente: " + usuarioInsert);
    }
}
