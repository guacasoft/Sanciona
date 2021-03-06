package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Localidad implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "LOCALIDAD_ID_GENERATOR")
   @javax.persistence.Id
   @org.kie.api.definition.type.Label("Id Localidad")
   @javax.persistence.SequenceGenerator(allocationSize = 1, sequenceName = "localidad_idlocalidad_seq", name = "LOCALIDAD_ID_GENERATOR")
   private Long idlocalidad;

   @org.kie.api.definition.type.Label("Nombre de  Localidad")
   private java.lang.String nombrelocalidad;

   public Localidad()
   {
   }

   public java.lang.String getNombrelocalidad()
   {
      return this.nombrelocalidad;
   }

   public void setNombrelocalidad(java.lang.String nombrelocalidad)
   {
      this.nombrelocalidad = nombrelocalidad;
   }

   public String toString()
   {
      return "[nombrelocalidad= " + this.nombrelocalidad + " - idlocalidad= " + this.idlocalidad + "]";
   }

   public java.lang.Long getIdlocalidad()
   {
      return this.idlocalidad;
   }

   public void setIdlocalidad(java.lang.Long idlocalidad)
   {
      this.idlocalidad = idlocalidad;
   }

   public Localidad(java.lang.Long idlocalidad, java.lang.String nombrelocalidad)
   {
      this.idlocalidad = idlocalidad;
      this.nombrelocalidad = nombrelocalidad;
   }
}