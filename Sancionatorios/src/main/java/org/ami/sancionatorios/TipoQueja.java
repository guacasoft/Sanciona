package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "tipoqueja")
public class TipoQueja implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "idtipoqueja_seq")
   @javax.persistence.SequenceGenerator(allocationSize = 1, sequenceName = "tipoqueja_idtipoqueja_seq", name = "idtipoqueja_seq")
   @javax.persistence.Id
   @org.kie.api.definition.type.Label("Identificador del tipo de queja")
   private Long idtipoqueja;

   @org.kie.api.definition.type.Label("nombre para la identificacion de la Queja u Oficio con el que se inicia el proceso")
   private String nombrequeja;

   public TipoQueja()
   {
   }

   public String getNombrequeja()
   {
      return this.nombrequeja;
   }

   public void setNombrequeja(String nombrequeja)
   {
      this.nombrequeja = nombrequeja;
   }

   public java.lang.Long getIdtipoqueja()
   {
      return this.idtipoqueja;
   }
   
   public String toString()
   {
      return "[nombrequeja= " + this.nombrequeja + " - idtipoqueja= " + this.idtipoqueja + "]";
   }

   public void setIdtipoqueja(java.lang.Long idtipoqueja)
   {
      this.idtipoqueja = idtipoqueja;
   }

   public TipoQueja(java.lang.Long idtipoqueja, java.lang.String nombrequeja)
   {
      this.idtipoqueja = idtipoqueja;
      this.nombrequeja = nombrequeja;
   }

}