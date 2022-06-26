package test;

import java.util.Scanner;

public class CALCULATOR {

	//Se encapsulan y se crean las variables
	private int count1;// se crea una variable contador que nos permite ingresar primero un numero que un digito
	private double num1;//variable numerica para las operaciones
	private double num2;//variable numerica para las operaciones
	private double numfinal;//variable que sera utilizada siempre  despues de generar una operacion
	private String signo;//variable para obtener el signo ingresado por el usuario
	private double resultado;//variable la cual va almacenar el resultado de las variables  segune el signo
	private double temporal;//variable que va trabajar como acumulador del resultado para la proxima operacion
	private boolean flag;//variable utilizada para detener el programa 
	Scanner teclado = new Scanner(System.in);// se crea un objeto de la clase scanner para leer los datos ingresados por el usuario

	public void calculator() { // metodo para relizar operaciones
		flag = true;// Inicializando variables para el ingreso finito al bucle
		count1 = 0;

		while (flag) {//  mientras la bandera sea verdadera pediremos al usuario finitad veces los datos

			if (count1 == 0) {// condicional para ingresar directamente a digitar numeros ya que la segunda vez 
						// el proceso pide un digito
						
				//Pedidos datos al usuario		
				System.out.println("ingrese un numero");
				num1 = teclado.nextDouble();
				teclado.nextLine();//reiniciamos el objeto escaner ya que este si no es limpiado conserva un \n
				System.out.println("Ingrese signo");//capturamos el signo  de la operacion a realizar
				signo = teclado.nextLine();

				
				switch (signo) { // segun sea el signo escojido por el usuario, realizara las operaciones

					case "+":
						System.out.println("ingrese numero");// requerimos el numero 2 para completar la operacion
						num2 = teclado.nextDouble();
						resultado = num1 + num2; // realizamos la operacion e imprimos el resultado 
						System.out.println(" EL resultado es: " + resultado);// hasta el momento
						//mostramos resultado
						temporal = resultado;// en una variable temporal almacenaremos lo que nos
									// genero la  operacion realizada anteriormente
						break;
						
						//realizamos los mismos pasos anteriores pero realizando una resta
					case "-":
							System.out.println("ingrese numero");
							num2 = teclado.nextDouble();
							resultado = num1 - num2;
							System.out.println("El resultado es: " + resultado);
							temporal = resultado;
							break;

							//realizamos los mismos pasos anteriores exeptuando 
					case "/":	// si el valor es cero 0 ya que la diviciones por 0 no existen
							System.out.println("ingrese numero");
							num2 = teclado.nextDouble();
							if (num2 == 0) {//descartamos si el valor es cero y lanzamos un anuncio
								System.out.println("No se puede realizar la divicion por el numero 0");
								break;
							} else {
								resultado = num1 / num2;
								System.out.println("El resultado es: " + resultado);
								temporal = resultado;
								break;

							}
							//se realizan los mismos pasos anteriores excepto validacion del 0
					case "*":
							System.out.println("ingrese numero");
							num2 = teclado.nextDouble();
							resultado = num1 * num2;
							System.out.println("El resultado es: " + resultado);
							temporal = resultado;
							break;
							// se realizan los mismos pasos  pero confirmamos no generar divisiones
					case "%":	// con el numero 0 ya que estas no existen
							System.out.println("ingrese numero");
							num2 = teclado.nextDouble();
							if (num2 == 0) {
								System.out.println("No se puede realizar la divicion por el numero 0");
								break;
							} else {
								resultado = num1 % num2;
								System.out.println("El resultado es: " + resultado);
								temporal = resultado;
								break;

							}

				}

				count1 += 1; // incrementamos el contador para que el siguiente paso sea pedir un signo y no 
				// pedir un numero ya que este fue el ultimo paso que realizo el usuario
			} else {
				
				teclado.nextLine(); // limpiamos el escaner para no contener saltos de line \n
				System.out.println("ingrese signo");
				signo = teclado.nextLine();
				if (signo == "=") {// si el usuario ingresa el signo = se mostrara lo acumulado hasta el momento
					
					// se imprime acumulado y se frena el ciclo con la bandera
					System.out.println("EL RESULTADO FINAL ES: "+ temporal);
					flag=false;

				} else { // condicional si el usuario sigue en el programa y no digita el signo igual
					switch (signo) { // se realizan las mismas operaciones 
						//excepto que solo se utilizara y se pedira al usuario un solo numero
						// ya que el primero se ingreso al inicio del programa
						case "+":
							// se aplican los mismos procedimientos 
							//excepto que la temporal en todad las operaciones sera nuestra
							//variable operadora y acumuladora
							System.out.println("ingrese numero");
							numfinal = teclado.nextDouble();
							resultado = temporal + numfinal;
							System.out.println("El resultado es: " + resultado);
							temporal = resultado;

							break;
							// se aplican los mismos procedimientos 
							//excepto que la temporal en todad las operaciones sera nuestra
							//variable operadora y acumuladora
							
						case "-":
							System.out.println("ingrese numero");
							numfinal = teclado.nextDouble();
							resultado = temporal - numfinal;
							System.out.println("El resultado es: " + resultado);
							temporal = resultado;
							break;
							// se aplican los mismos procedimientos 
							//excepto que la temporal en todad las operaciones sera nuestra
							//variable operadora y acumuladora
							// se verifica las divisiones por cero exceptuandolas ya que no existen
						case "/":
							System.out.println("ingrese numero");
							numfinal = teclado.nextDouble();
							if (numfinal == 0) {
								System.out.println("No se puede realizar la divicion por el numero 0");
								break;
							} else {
								resultado = temporal / numfinal;
								System.out.println("El resultado es: " + resultado);
								temporal = resultado;
								break;

							}
							// se aplican los mismos procedimientos 
							//excepto que la temporal en todad las operaciones sera nuestra
							//variable operadora y acumuladora
							
						case "*":
							System.out.println("ingrese numero");
							numfinal = teclado.nextDouble();
							resultado = temporal * numfinal;
							System.out.println("El resultado es: " + resultado);
							temporal = resultado;
							break;
							// se aplican los mismos procedimientos 
							//excepto que la temporal en todad las operaciones sera nuestra
							//variable operadora y acumuladora
							// se verifica las divisiones por cero exceptuandolas ya que no existen
						case "%":
							System.out.println("ingrese numero");
							numfinal = teclado.nextDouble();
							if (numfinal == 0) {
								System.out.println("No se puede realizar la divicion por el numero 0");
								break;
							} else {
								resultado = temporal % numfinal;
								System.out.println("El resultado es: " + resultado);
								temporal = resultado;
								break;

							}
							
							
						case "=": 
							
							flag=false;
							break;
							
						default:
							System.out.println("ingrese un signo valido");

					}

				}

			}
		}

	}
}
