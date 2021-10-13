import java.util.ArrayList

// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################


/*  val n = 7
  for (i in 0..10) {
      println("$n x $i = ${n * i}")
  }
*/

fun main() {
    // Declaración de variables
    var entrada: String
    val miNombre = println("JOSE MARIA SANCHEZ JIMENEZ")
    var edad: Byte
    var mes: Byte


    // Aqui tienes que definir las variables que se utilizan

    // Leo desde teclado la edad del alumno y el mes acutal
    println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
    entrada = readLine() ?: ""
    var listaEntrada = entrada.split(",")


    // Linea Inicial de programa
    println("*".repeat(80))
    println("PROGRAMA DE GENERACIÓN DE TABLAS: $miNombre")


    // Linea inicio cabecera
    println("_".repeat(80))

    if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
    {
        println("La entrada no es correcta")
        println("_".repeat(80))
    } else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
        edad = try {
            listaEntrada[0].trim().toByte()
        } catch (_: Exception) {
            -1
        }
        mes = try {
            listaEntrada[1].trim().toByte()
        } catch (_: Exception) {
            -1
        }

        if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        } else //Sino, continuo
        {
            //TODO("Aquí el código de la cabecera")
            println("Edad: $edad. El alumno está dentro del rango ")

            when {

                edad in 6..8 && mes % 2 == 0 -> {
                    println("Mes: $mes. El mes es par")
                    println("TABLA DEL 2")
                    println("************")
                    for (i in 0..10) {

                        println("2 x $i = ${2 * i}")
                        println()
                    }
                    println("TABLA DEL 4")
                    println("************")
                    for (i in 0..10) {

                        println("4 x $i = ${4 * i}")
                        println()
                    }

                }
            }


        }

        when {
            edad in 6..8 && mes % 2 != 0 -> {

                println("TABLA DEL 1")
                println("************")
                for (i in 0..10) {

                    println("1 x $i = ${1 * i}")


                }
                println("TABLA DEL 3")
                println("************")
                for (i in 0..10) {
                    println("3 x $i = ${3 * i}")
                }

                println("TABLA DEL 5")
                println("************")
                for (i in 0..10) {
                    println("5 x $i = ${5 * i}")
                }

            }
        }
        when {
            edad in 8..10 && mes % 2 != 0 -> {

                println("TABLA DEL 7")
                println("************")
                for (i in 0..10) {

                    println("7 x $i = ${7 * i}")


                }
                println("TABLA DEL 9")
                println("************")
                for (i in 0..10) {
                    println("9 x $i = ${9 * i}")
                }

                println("TABLA DEL 5")
                println("************")
                for (i in 0..10) {
                    println("5 x $i = ${5 * i}")
                }

            }
        }
        when {
            edad in 8..10 && mes % 2 == 0 -> {
                println("Mes: $mes. El mes es par")
                println("TABLA DEL 6")
                println("************")
                for (i in 0..10) {

                    println("6 x $i = ${6 * i}")


                }
                println("TABLA DEL 8")
                println("************")
                for (i in 0..10) {
                    println("8 x $i = ${8 * i}")
                }

                println("TABLA DEL 10")
                println("************")
                for (i in 0..10) {
                    println("10 x $i = ${10 * i}")
                }

            }
        }
            when {
                edad in 11..13 -> {

                    println("TABLA DEL 11")
                    println("************")
                    for (i in 0..10) {

                        println("11 x $i = ${11 * i}")


                    }
                    println("TABLA DEL 12")
                    println("************")
                    for (i in 0..10) {
                        println("12 x $i = ${12 * i}")
                    }

                    println("TABLA DEL 13")
                    println("************")
                    for (i in 0..13) {
                        println("13 x $i = ${13 * i}")
                    }
                }

        }

        println("La edad es $edad y el mes es $mes")

                    // Linea final cabecera
                    println ("_".repeat(80))

            //Imprime las las tablas en función de
            //TODO("Aquí las tablas")


    }

// Linea final de programa
                        println("*".repeat(80))  }