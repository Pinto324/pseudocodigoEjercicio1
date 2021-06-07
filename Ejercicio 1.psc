Algoritmo NoEntero
	Escribir "Ingrese cuantos numeros desea generar"
	Leer Num
	AcumPar = 0
	AcumIpar = 0
	Para i<-0 Hasta Num Con Paso 1 Hacer
		R = Aleatorio(1,100)
		Si R mod 2 == 0 Entonces
		AcumPar = AcumPar + 1	
		SiNo
		AcumIpar = AcumIpar + 1
		Fin Si
	Fin Para
	Escribir "Los numeros pares fueron: ",AcumPar
	Escribir "Los numeros impares fueron: ",AcumIpar
FinAlgoritmo
