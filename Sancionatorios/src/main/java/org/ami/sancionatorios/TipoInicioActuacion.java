package org.ami.sancionatorios;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "tipoiniactuacion")
public class TipoInicioActuacion implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("identificacion del area asociada al inicio de actuacion")
   private java.lang.Long idarea;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "TIPOINICIOACTUACION_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(allocationSize = 1, sequenceName = "inicioactuacion_idinicioactuacion_seq", name = "TIPOINICIOACTUACION_ID_GENERATOR")
   @org.kie.api.definition.type.Label("Identificador del tipo de inicio de actuacion")
   private java.lang.Long idtipoiniactuacion;

   @org.kie.api.definition.type.Label("nombre del tipo de inicio de actuacion")
   private java.lang.String nombretipoiniactuacion;

   public TipoInicioActuacion()
   {
   }

   public java.lang.Long getIdarea()
   {
      return this.idarea;
   }

   public void setIdarea(java.lang.Long idarea)
   {
      this.idarea = idarea;
   }

   public String toString()
   {
      return "[nombretipoiniactuacion= " + this.nombretipoiniactuacion + " - idarea= " + this.idarea + " - idtipoiniactuacion= " + this.idtipoiniactuacion + "]";
   }

   public java.lang.Long getIdtipoiniactuacion()
   {
      return this.idtipoiniactuacion;
   }

   public void setIdtipoiniactuacion(java.lang.Long idtipoiniactuacion)
   {
      this.idtipoiniactuacion = idtipoiniactuacion;
   }

   public java.lang.String getNombretipoiniactuacion()
   {
      return this.nombretipoiniactuacion;
   }

   public void setNombretipoiniactuacion(java.lang.String nombretipoiniactuacion)
   {
      this.nombretipoiniactuacion = nombretipoiniactuacion;
   }

   public TipoInicioActuacion(java.lang.Long idarea,
         java.lang.Long idtipoiniactuacion,
         java.lang.String nombretipoiniactuacion)
   {
      this.idarea = idarea;
      this.idtipoiniactuacion = idtipoiniactuacion;
      this.nombretipoiniactuacion = nombretipoiniactuacion;
   }

}