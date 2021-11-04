# Factorial de un numero usando la recursividad
def factorial(number):
   if number == 1:
       return number
   else:
       return number * factorial(number - 1)

number = 5

# Comprueba si el número es negativo
if number < 0:
   print("No existe factorial para los números negativos.")
elif number == 0:
   print("El factorial de 0 es 1.")
else:
   print(f"El factorial de {number}, es {factorial(number)}")