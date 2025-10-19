*
Un tema relacionado con la salud que ha estado últimamente en las noticias es la computarización de los
registros médicos. Esta posibilidad se está tratando con mucho cuidado, debido a las delicadas cuestiones
de privacidad y seguridad, entre otras cosas. [Trataremos esas cuestiones en ejercicios posteriores].
La computarización de los registros médicos puede facilitar a los pacientes el proceso de compartir
sus perfiles e historiales médicos con los diversos profesionales de la salud que consulten.
Esto podría mejorar la calidad del servicio médico, ayudar a evitar conflictos de fármacos
y prescripciones erróneas, reducir los costos y, en emergencias, podría ayudar a salvar vidas.
En este ejercicio usted diseñará una clase “inicial” llamada PerfilMedico para una 100 Capítulo 3
Introducción a las clases, los objetos, los métodos y las cadenas persona. Los atributos de la clase
deben incluir el primer nombre de la persona, su apellido, sexo, fecha de nacimiento (que debe consistir
de atributos separados para el día, mes y año de nacimiento), altura (en centímetros) y peso (en kilogramos).
Su clase debe tener un constructor que reciba estos datos. Para cada atributo, debe proveer los métodos establecer
y obtener. La clase también debe incluir métodos que calculen y devuelvan la edad del usuario en años,
la frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada (vea el ejercicio 3.16),
además del índice de masa corporal (BM). Escriba una aplicación de Java que pida la información de la persona,
cree una instancia de un objeto de la clase PerfilMedico para esa persona e imprima la información de ese objeto
(incluyendo el primer nombre de la persona, apellido, sexo, fecha de nacimiento, altura y peso),
y que después calcule e imprima la edad de esa persona en años, junto con el BMI, la frecuencia cardiaca
máxima y el rango de frecuencia cardiaca esperada. También debe mostrar la tabla de valores del
BMI VALORES DE BMI Bajo peso: menos de 18.5 Normal: entre 18.5 y 24.9 Sobrepeso: entre 25 y 29.9 Obeso: 30 o más
 */
void main() {

    int opc;
    int anioAc = 2025;

    Scanner sc= new Scanner(System.in);
    PerfilMedico perfil1 = new PerfilMedico();


    do {
        System.out.println("\n--- MENU DE CONSULTA MEDICA ---");
        System.out.println("Seleccione una opcion:");
        System.out.print("1.Ingresar los datos personales del paciente\n");
        System.out.print("2.Mostrar Datos del paciente\n");
        System.out.print("3.Mostrar Datos de frecuencia caridaca\n");
        System.out.print("4.Mostrar Valores de la tabla BMI\n");
        System.out.print("5.Salir\n");
        System.out.print(">>>>>");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                System.out.print("Ingrese el primer nombre del paciente:\n ");
                String nombre = sc.nextLine().trim();
                perfil1.setNombre(nombre);

                System.out.print("Ingrese el apellido del paciente:\n ");
                String apellido = sc.nextLine().trim();
                perfil1.setApellido(apellido);

                System.out.print("Ingrese el sexo del paciente M/F :\n ");
                String sexo = sc.nextLine().trim();
                perfil1.setSexo(sexo);

                System.out.print("Ingrese el dia de nacimiento del paciente:\n ");
                int dia = Integer.parseInt(sc.nextLine().trim());
                perfil1.setDia(dia);

                System.out.print("Ingrese el mes de nacimiento del paciente:\n ");
                int mes = Integer.parseInt(sc.nextLine().trim());
                perfil1.setMes(mes);

                System.out.print("Ingrese el año de nacimiento del paciente:\n ");
                int anio = Integer.parseInt(sc.nextLine().trim());
                perfil1.setAnio(anio);

                System.out.print("Ingrese la altura del paciente en metros:\n ");
                double altura = Double.parseDouble(sc.nextLine().trim());
                perfil1.setAltura(altura);

                System.out.print("Ingrese el peso del paciente (kg):\n ");
                double peso = Double.parseDouble(sc.nextLine().trim());
                perfil1.setPeso(peso);
                break;
            case 2:
                perfil1.ImprimirDatosPaciente();

                break;

            case 3:
                perfil1.mostrarFrecuenciaCardiaca(anioAc);

                break;
            case 4:
                perfil1.ImprimirDatosBMI();
                break;
        }
    } while (opc != 5);





}

}
