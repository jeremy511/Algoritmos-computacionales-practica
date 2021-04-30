Algoritmo practica_pseint
	Definir valor_numerico_global,rows,columns,numb Como Entero
	Definir opcion_menu Como Entero
	numb <- 4
	Dimension matrix[numb,numb]
	Mientras opcion_menu<>5 Hacer
		Escribir 'Elija un numero del 1 al 5'
		Escribir ''
		Escribir '1 - Capturar Valor '
		Escribir '2 - Generar Tabla de Multiplicar*'
		Escribir '3 - Determinar Si es Primo o No Primo*'
		Escribir '4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal y Secundaria'
		Escribir '5 - Salir del Programa'
		Escribir ''
		Leer opcion_menu // lee el numero a elegir del menu
		Segun opcion_menu  Hacer
			1:
				Borrar Pantalla
				Escribir '¿Que numero te gustaria usar como base para el programa?'
				Escribir i
				Leer valor_numerico_global
				Escribir 'El numero seleccionado como base del programa es el:'+ConvertirATexto(valor_numerico_global)
			2:
				ProcedimientoTablaMultiplicar(valor_numerico_global)
			3:
				ProcedimientoMostrarEvaluacionPrimo(valor_numerico_global)
			4:
				ProcedimientoDiagonalesMatriz(matrix,numb,rows,columns)
			De Otro Modo:
				Escribir 'Fin del programa'
		FinSegun
	FinMientras
FinAlgoritmo

// SUB PROCESOS
// proceso Para Mostrar tabla de multiplicar
Funcion ProcedimientoTablaMultiplicar (valor_numerico_global)
	Borrar Pantalla
	Escribir 'Tabla de multiplicar del: '+ConvertirATexto(valor_numerico_global)
	Escribir i
	Para x<-1 Hasta 12 Hacer
		Escribir valor_numerico_global,' * ',x,' = ',valor_numerico_global*x
	FinPara
	Escribir 'pulse enter para volver al menu'
	Esperar Tecla
	Borrar Pantalla
FinFuncion

// procedimiento para mostrar si es primo o no
Funcion ProcedimientoMostrarEvaluacionPrimo (valor_numerico_global)
	Borrar Pantalla
	Escribir '3 - Determinar Si es Primo o No Primo*'
	Para iter<-1 Hasta valor_numerico_global Hacer // ciclo for para determinar si el valor_numerico_global es divisible entre si mismo
		Si valor_numerico_global MOD iter=0 Entonces
			cont <- cont+1
		FinSi
	FinPara
	Si cont=2 Entonces
		Escribir 'El: ',valor_numerico_global,' es primo'
	SiNo
		Escribir 'El: ',valor_numerico_global,' no es primo'
	FinSi
	Escribir 'pulse enter para volver al menu'
	Esperar Tecla
	Borrar Pantalla
FinFuncion

// procedimiento para mostrar la matrix
Funcion ProcedimientoDiagonalesMatriz(matrix,numb,rows,columns)
	Escribir '4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal* y Secundaria*'
	Para rows<-1 Hasta numb Hacer
		Para columns<-1 Hasta numb Hacer
			matrix[rows,columns]<-azar(100)
		FinPara
	FinPara
	Para rows<-1 Hasta numb Hacer
		Para columns<-1 Hasta numb Hacer
			Escribir matrix[rows,columns],' ' Sin Saltar
		FinPara
		Escribir ' '
	FinPara
	Escribir 'La diagonal principal de la matriz es '
	Para rows<-1 Hasta numb Hacer
		Escribir matrix[rows,rows]
	FinPara
	Escribir ''
	Escribir 'Muestra solo la diagonal secundaria'
	Escribir '************************'
	Para rows<-1 Hasta numb Hacer
		Para columns<-1 Hasta 4 Hacer
			Si rows+columns=4+1 Entonces
				Escribir matrix[rows,columns]
			FinSi
		FinPara
		Escribir ' '
	FinPara
	Escribir 'pulse enter para volver al menu'
	Esperar Tecla
	Borrar Pantalla
FinFuncion
