/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import colecciones.MensajeColeccion;
import com.mongodb.client.MongoCollection;
import interfaces.IConexionBD;

/**
 *
 * @author filor
 */
public class MensajeDAO {
    private IConexionBD conexionBD;

    public MensajeDAO() {
        this.conexionBD = new ConexionBD();
    }

    public MensajeDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    public void agregarMensaje(MensajeColeccion mensajeInsert){
        MongoCollection<MensajeColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("mensajes", MensajeColeccion.class);
        
        coleccion.insertOne(mensajeInsert);
        
        System.out.println("El mensaje fue agregado correctamente: " + mensajeInsert);
    }
}
