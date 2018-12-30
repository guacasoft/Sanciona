package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Hecho implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "HECHO_ID_GENERATOR")
   @javax.persistence.Id
   @org.kie.api.definition.type.Label("identificador del hecho")
   @javax.persistence.SequenceGenerator(allocationSize = 1, sequenceName = "hecho_idhecho_seq", name = "HECHO_ID_GENERATOR")
   private java.lang.Long idhecho;

   @org.kie.api.definition.type.Label("fecha de programacion de la visita")
   private java.util.Date fechavisita;

   @org.kie.api.definition.type.Label("codigo de identificacion del concepto tecnico o informe tecnico")
   private java.lang.String codigoconceptotecnico;

   @org.kie.api.definition.type.Label("cantidad de desmejoras encontradas")
   private java.lang.Long cantidaddesmejoramientos;

   @org.kie.api.definition.type.Label("identificador del expediente")
   private java.lang.Long idexpediente;

   public Hecho()
   {
   }

   public java.lang.Long getIdhecho()
   {
      return this.idhecho;
   }

   public void setIdhecho(java.lang.Long idhecho)
   {
      this.idhecho = idhecho;
   }

   public java.util.Date getFechavisita()
   {
      return this.fechavisita;
   }

   public void setFechavisita(java.util.Date fechavisita)
   {
      this.fechavisita = fechavisita;
   }

   public java.lang.String getCodigoconceptotecnico()
   {
      return this.codigoconceptotecnico;
   }

   public void setCodigoconceptotecnico(java.lang.String codigoconceptotecnico)
   {
      this.codigoconceptotecnico = codigoconceptotecnico;
   }

   public java.lang.Long getCantidaddesmejoramientos()
   {
      return this.cantidaddesmejoramientos;
   }

   public void setCantidaddesmejoramientos(
         java.lang.Long cantidaddesmejoramientos)
   {
      this.cantidaddesmejoramientos = cantidaddesmejoramientos;
   }

   public java.lang.Long getIdexpediente()
   {
      return this.idexpediente;
   }

   public void setIdexpediente(java.lang.Long idexpediente)
   {
      this.idexpediente = idexpediente;
   }

   public Hecho(java.lang.Long idhecho, java.util.Date fechavisita,
         java.lang.String codigoconceptotecnico,
         java.lang.Long cantidaddesmejoramientos, java.lang.Long idexpediente)
   {
      this.idhecho = idhecho;
      this.fechavisita = fechavisita;
      this.codigoconceptotecnico = codigoconceptotecnico;
      this.cantidaddesmejoramientos = cantidaddesmejoramientos;
      this.idexpediente = idexpediente;
   }

}