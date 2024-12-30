/*Java record represents an immutable class -its used for classes that only store and show data-
 only has variables, constructor printing methods getters **NO setters** - not functionalities
immutable classes: used  key word final on its declaration and variables
        public final class xxx{  //this assures that class cannot be inherited
        private final var;}      // "" "" once initialized its value cannot be changed
*variables can only be assigned in class constructor
*it is possible to have  @override hashCode method, to generate hash code bases on variables
*as well as @override equals method, to verify if 2 objects of the class are the same

    e.g.     public boolean equals(Object obj) {if (this == obj) {return true;
                 } else if (!(obj instanceof Telefono)) {
                  return false;} else {Telefono other = (Telefono) obj;
                       return Objects.equals(codigoDeArea, other.codigoDeArea)
                            && Objects.equals(numero, other.numero);    }  } */
//classes String Integer Boolean are immutable -- Los String son comúnmente usados como claves en estructuras como HashMap. Si fueran mutables, cambiar su valor después de usarlos como clave afectaría su capacidad para recuperar el valor asociado.
//enhance performance security concurrence-- paralelism
package Exchange;

public record JsonDto(String usd, String eur,String jpy,String gbp,String aud) {
}
