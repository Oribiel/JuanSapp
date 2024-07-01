/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import colecciones.UsuarioColeccion;
import com.mongodb.client.MongoCollection;
import interfaces.IConexionBD;
import interfaces.IUsuarioDAO;

/**
 *
 * @author filor
 */
public class UsuarioDAO implements IUsuarioDAO{
    private IConexionBD conexionBD;

    public UsuarioDAO() {
        this.conexionBD = new ConexionBD();
    }

    public UsuarioDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public void crearUsuario(UsuarioColeccion usuarioInsert){
        MongoCollection<UsuarioColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("usuarios", UsuarioColeccion.class);
        
        coleccion.insertOne(usuarioInsert);
        
        System.out.println("La persona fue agregada correctamente: " + usuarioInsert);
    }
}
