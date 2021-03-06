package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Norma implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "NORMA_ID_GENERATOR")
   @javax.persistence.Id
   @org.kie.api.definition.type.Description("Identificador de la norma que aplica al expediente según el año en que se realizó la queja")
   @org.kie.api.definition.type.Label("Identificador de la norma")
   @javax.persistence.SequenceGenerator(allocationSize = 1, sequenceName = "norma_idnorma_seq", name = "NORMA_ID_GENERATOR")
   private Long idnorma;

   @org.kie.api.definition.type.Label("Nombre de la norma")
   private java.lang.String nombrenorma;

   public Norma()
   {
   }

   public java.lang.String getNombrenorma()
   {
      return this.nombrenorma;
   }

   public void setNombrenorma(java.lang.String nombrenorma)
   {
      this.nombrenorma = nombrenorma;
   }

   public java.lang.Long getIdnorma()
   {
      return this.idnorma;
   }
   public String toString()
   {
      return "[nombrenorma= " + this.nombrenorma + " - idnorma= " + this.idnorma + "]";
   }
  
   public void setIdnorma(java.lang.Long idnorma)
   {
      this.idnorma = idnorma;
   }

   public Norma(java.lang.Long idnorma, java.lang.String nombrenorma)
   {
      this.idnorma = idnorma;
      this.nombrenorma = nombrenorma;
   }

}