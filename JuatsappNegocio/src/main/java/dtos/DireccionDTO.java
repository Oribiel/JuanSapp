/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import org.bson.types.ObjectId;

/**
 *
 * @author filor
 */
public class DireccionDTO {
    private ObjectId id;
    private String ciudad;
    private String colonia;
    private String calle;
    private String numero;

    public DireccionDTO() {
    }

    public DireccionDTO(String ciudad, String colonia, String calle, String numero) {
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DireccionDTO{" + "id=" + id + ", ciudad=" + ciudad + ", colonia=" + colonia + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
}
