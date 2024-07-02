/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import colecciones.ChatColeccion;
import colecciones.MensajeColeccion;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Updates;
import interfaces.IChatDAO;
import interfaces.IConexionBD;
import java.util.List;
import org.bson.conversions.Bson;

/**
 *
 * @author filor
 */
public class ChatDAO implements IChatDAO{
    private IConexionBD conexionBD;

    public ChatDAO() {
        this.conexionBD = new ConexionBD();
    }

    public ChatDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public void crearChat(ChatColeccion chatInsert){
        MongoCollection<ChatColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("chats", ChatColeccion.class);
        
        coleccion.insertOne(chatInsert);
        
        System.out.println("El chat fue agregado correctamente: " + chatInsert);
    }
    
    public void agregarMensaje(List<MensajeColeccion> mensajes, String emisor, String receptor){
        MongoCollection<ChatColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("chats", ChatColeccion.class);
          
        Bson filtro = Filters.and(
                Filters.eq("participante1", emisor),
                Filters.eq("participante2", receptor));

//        Bson filtro = Filters.eq("participante1", emisor);
        
        coleccion.updateOne( filtro ,Updates.set("mensajes", mensajes));
    }
}
