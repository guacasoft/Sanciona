package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "estrato")
public class Estrato implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "ESTRATO_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "estrato_idestrato_seq", allocationSize = 1, name = "ESTRATO_ID_GENERATOR")
   @org.kie.api.definition.type.Description("id estrato")
   private java.lang.Long idestrato;

   @org.kie.api.definition.type.Label("numero estrato")
   private Long numeroestrato;

   public Estrato()
   {
   }

   public java.lang.Long getIdestrato()
   {
      return this.idestrato;
   }

   public void setIdestrato(java.lang.Long idestrato)
   {
      this.idestrato = idestrato;
   }

   public java.lang.Long getNumeroestrato()
   {
      return this.numeroestrato;
   }

   public void setNumeroestrato(java.lang.Long numeroestrato)
   {
      this.numeroestrato = numeroestrato;
   }
   
   public String toString()
   {
      return "[idestrato= " + this.idestrato + " - numeroestrato= " + this.numeroestrato + "]";
   }

   public Estrato(java.lang.Long idestrato, java.lang.Long numeroestrato)
   {
      this.idestrato = idestrato;
      this.numeroestrato = numeroestrato;
   }

}