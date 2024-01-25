/**
 * Ejercicio 4.1
 * Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro. Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.
 *
 * Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)
 *
 * En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.
 */
class Rectangulo( val base: Double, val altura: Double){

    init {
        require(this.base > 0 && this.altura > 0) {"la base y la altura deben de ser mayor a 0"}
    }

    fun area( base: Double, altura: Double) = base * altura


    fun perimetro(base: Double, altura: Double) = 2*(base+altura)

    override fun toString() = "El area del retangulo es ${area(base, altura)} y el perimetro es ${perimetro(base, altura)}"
}