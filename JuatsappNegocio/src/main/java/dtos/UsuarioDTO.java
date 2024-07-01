package dtos;

import colecciones.UsuarioColeccion;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class UsuarioDTO {
    private ObjectId id;
    private String usuario;
    private String contraseña;
    private String telefono;
    private String sexo;
    private DireccionDTO direccion;
    private Date fechaNacimiento;
    private String fotoPerfil;
    private List<String> contactos;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String usuario, String contraseña, String telefono, String sexo, DireccionDTO direccion, Date fechaNacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.sexo = sexo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fotoPerfil = fotoPerfil;
        this.contactos = contactos;
    }

    public UsuarioDTO(UsuarioColeccion usuarioColeccion) {
        this.id = usuarioColeccion.getId();
        this.usuario = usuarioColeccion.getUsuario();
        this.contraseña = usuarioColeccion.getContraseña();
        this.telefono = usuarioColeccion.getTelefono();
        this.sexo = usuarioColeccion.getSexo();
        this.direccion = new DireccionDTO(usuarioColeccion.getDireccion());
        this.fechaNacimiento = usuarioColeccion.getFechaNacimiento();
        this.fotoPerfil = usuarioColeccion.getFotoPerfil();
        this.contactos = usuarioColeccion.getContactos();
    }

    // Getters y setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public DireccionDTO getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDTO direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public List<String> getContactos() {
        return contactos;
    }

    public void setContactos(List<String> contactos) {
        this.contactos = contactos;
    }
}

