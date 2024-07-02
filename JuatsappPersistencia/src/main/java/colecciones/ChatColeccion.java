/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author filor
 */
public class ChatColeccion {
    private ObjectId id;
    private List<MensajeColeccion> mensajes;
    private String participante1;
    private String participante2;

    public ChatColeccion() {
    }

    public ChatColeccion(String participante1, String participante2) {
        this.participante1 = participante1;
        this.participante2 = participante2;
    }

    public ChatColeccion(List<MensajeColeccion> mensajes, String participante1, String participante2) {
        this.mensajes = mensajes;
        this.participante1 = participante1;
        this.participante2 = participante2;
    }
    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<MensajeColeccion> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<MensajeColeccion> mensajes) {
        this.mensajes = mensajes;
    }

    public String getParticipante1() {
        return participante1;
    }

    public void setParticipante1(String participante1) {
        this.participante1 = participante1;
    }

    public String getParticipante2() {
        return participante2;
    }

    public void setParticipante2(String participante2) {
        this.participante2 = participante2;
    }
    
    
}
