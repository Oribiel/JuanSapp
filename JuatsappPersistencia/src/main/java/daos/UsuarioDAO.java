package daos;

import colecciones.UsuarioColeccion;
import dtos.UsuarioDTO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import interfaces.IConexionBD;
import interfaces.IUsuarioDAO;
import org.bson.conversions.Bson;

public class UsuarioDAO implements IUsuarioDAO {
    private IConexionBD conexionBD;

    public UsuarioDAO() {
        this.conexionBD = new ConexionBD();
    }

    public UsuarioDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void crearUsuario(UsuarioColeccion usuarioInsert) {
        MongoCollection<UsuarioColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("usuarios", UsuarioColeccion.class);
        coleccion.insertOne(usuarioInsert);
        System.out.println("La persona fue agregada correctamente: " + usuarioInsert);
    }

    public UsuarioDTO iniciarSesion(String usuario, String contrasena) {
        MongoCollection<UsuarioColeccion> coleccion = conexionBD.obtenerMongoDatabase().getCollection("usuarios", UsuarioColeccion.class);
        Bson filtro = Filters.and(Filters.eq("usuario", usuario), Filters.eq("contrasena", contrasena));
        UsuarioColeccion usuarioEncontrado = coleccion.find(filtro).first();

        if (usuarioEncontrado != null) {
            return new UsuarioDTO(usuarioEncontrado);
        } else {
            return null;
        }
    }
}


