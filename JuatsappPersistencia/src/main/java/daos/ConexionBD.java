/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import interfaces.IConexionBD;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author filor
 */
public class ConexionBD implements IConexionBD {
    private final MongoDatabase dataBase;
    
    public ConexionBD() {
        // Configura el proveedor de códecs para trabajar con objetos Java y MongoDB
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

        // Combina el proveedor de códecs POJO con el registro de códecs predeterminado de MongoDB
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        // Configura la cadena de conexión a la base de datos MongoDB local
        ConnectionString cadenaConexion = new ConnectionString("mongodb://localhost/27017");

        // Configura los ajustes del cliente MongoDB, incluyendo la cadena de conexión y el registro de códecs
        MongoClientSettings clientsSettings = MongoClientSettings.builder()
                .applyConnectionString(cadenaConexion)
                .codecRegistry(codecRegistry)
                .build();

        // Crea un cliente MongoDB utilizando los ajustes configurados
        MongoClient dbServer = MongoClients.create(clientsSettings);

        // Obtiene la base de datos específica ("Juansapp") del cliente MongoDB
        this.dataBase = dbServer.getDatabase("Juansapp");
    }

    
    @Override
    public MongoDatabase obtenerMongoDatabase() {
        if (this.dataBase == null) {
            throw new IllegalStateException("MongoDatabse no esta inicializado.");
        }
        return this.dataBase;
    }

    @Override
    public void cerrarMongoDatabase() {
        {
            
        }
        
    }
    
}
