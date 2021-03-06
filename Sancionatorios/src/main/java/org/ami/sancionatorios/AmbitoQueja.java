package org.ami.sancionatorios;

import java.math.BigInteger;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "ambitoqueja")
public class AmbitoQueja implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "AMBITOQUEJA_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "ambitoqueja_idambitoqueja_seq", name = "AMBITOQUEJA_ID_GENERATOR")
   @org.kie.api.definition.type.Label("Id Ambito Queja")
   private Long idambitoqueja;

   @org.kie.api.definition.type.Label("Nombre del  ambito de la queja por area deficiencias constructivas, arrendamientos o seguimiento")
   private java.lang.String nombreambitoqueja;

   @org.kie.api.definition.type.Label("identificador del ambito del a queja asociados al area que corresponde deficiencias constructivas, arrendamientos o seguimiento")
   private Long idarea;

   public AmbitoQueja()
   {
   }

   public java.lang.String getNombreambitoqueja()
   {
      return this.nombreambitoqueja;
   }

   public void setNombreambitoqueja(java.lang.String nombreambitoqueja)
   {
      this.nombreambitoqueja = nombreambitoqueja;
   }

   public java.lang.Long getIdarea()
   {
      return this.idarea;
   }

   public void setIdarea(java.lang.Long idarea)
   {
      this.idarea = idarea;
   }

   public java.lang.Long getIdambitoqueja()
   {
      return this.idambitoqueja;
   }
   
   public String toString()
   {
      return "[nombreambitoqueja= " + this.nombreambitoqueja + " - idarea= " + this.idarea + " - idambitoqueja= " + this.idambitoqueja + "]";
   }

   public void setIdambitoqueja(java.lang.Long idambitoqueja)
   {
      this.idambitoqueja = idambitoqueja;
   }

   public AmbitoQueja(java.lang.Long idambitoqueja,
         java.lang.String nombreambitoqueja, java.lang.Long idarea)
   {
      this.idambitoqueja = idambitoqueja;
      this.nombreambitoqueja = nombreambitoqueja;
      this.idarea = idarea;
   }

}