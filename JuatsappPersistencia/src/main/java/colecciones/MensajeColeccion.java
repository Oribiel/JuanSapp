/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author filor
 */
public class MensajeColeccion {
    private ObjectId id;
    private String texto;
    private String imagen;
    private Date fechaHora;
    private String emisor;
    private String receptor;

    public MensajeColeccion() {
    }    

    public MensajeColeccion(String texto, Date fechaHora, String emisor, String receptor) {
        this.texto = texto;
        this.fechaHora = fechaHora;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }
    
    
}
