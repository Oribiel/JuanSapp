/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author filor
 */
public interface IConexionBD {
    public MongoDatabase obtenerMongoDatabase();

    public void cerrarMongoDatabase();
}
