package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TipoDeficiencia implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "TIPODEFICIENCIA_ID_GENERATOR")
   @javax.persistence.Id
   @org.kie.api.definition.type.Label("id del tipo de deficiencia constructiva")
   @javax.persistence.SequenceGenerator(allocationSize = 1, sequenceName = "tipodeficiencia_idtipodeficiencia_seq", name = "TIPODEFICIENCIA_ID_GENERATOR")
   private java.lang.Long idtipodeficiencia;

   @org.kie.api.definition.type.Label("nombre del tipo de deficiencia constructiva")
   private java.lang.String nombretipodeficiencia;

   public TipoDeficiencia()
   {
   }

   public java.lang.Long getIdtipodeficiencia()
   {
      return this.idtipodeficiencia;
   }

   public void setIdtipodeficiencia(java.lang.Long idtipodeficiencia)
   {
      this.idtipodeficiencia = idtipodeficiencia;
   }

   public java.lang.String getNombretipodeficiencia()
   {
      return this.nombretipodeficiencia;
   }

   public void setNombretipodeficiencia(java.lang.String nombretipodeficiencia)
   {
      this.nombretipodeficiencia = nombretipodeficiencia;
   }

   public String toString()
   {
      return "[nombretipodeficiencia= " + this.nombretipodeficiencia +  " - idtipodeficiencia= " + this.idtipodeficiencia + "]";
   }

   public TipoDeficiencia(java.lang.Long idtipodeficiencia,
         java.lang.String nombretipodeficiencia)
   {
      this.idtipodeficiencia = idtipodeficiencia;
      this.nombretipodeficiencia = nombretipodeficiencia;
   }

}