# MP - Práctica obligatoria
Para la realización de esta práctica proponemos una aplicación para encriptar y desencriptar mensajes utilizando distintos métodos de cifrado.

## Integrantes del grupo
| Nombre y apellidos | Correo | Github |
| ---------- | ---------- | ---------- |
| Enrique Garrido González | e.garridogon@alumnos.urjc.es | kikegg |
| Raúl Hernández del Amo | r.hernandezdel@alumnos.urjc.es | RaulHernandezdelAmo |
| Daniel Alexander Juan Moreno | da.juan@alumnos.urjc.es | dajm92 |
| Daniel Lahera Esteban | d.lahera@alumnos.urjc.es | DaniL97 |
| Víctor López Rodríguez | v.lopezrodr@alumnos.urjc.es | Victorlopezro |
| Guillermo Martín García | g.martingarcia@alumnos.urjc.es | Wilhelm-mar |
| Daniel Moreno Godoy | d.moreno.2016@alumnos.urjc.es | Danielmg21  |
| Víctor Alfonso Pajuelo Aguirre | va.pajuelo@alumnos.urjc.es | alfonsopajueloaguirre |
| Carlos Palomares Becerra | c.palomaresb@alumnos.urjc.es | carlospabe |

## Ambiciones
Muchos miembros del grupo estamos también matriculados en la asignatura de Seguridad Informática. Una de las partes de la misma trata sobre los sistemas criptográficos. Esto nos llevó a plantearnos cómo haríamos una aplicación para poner en práctica todo lo aprendido, aparte de poder investigar e indagar en campos que todavía no habíamos explorado.

## Método de trabajo
Como equipo, hemos decidido que lo mejor sería aplicar lo aprendido en la asignatura de Procesos Software. Esto conlleva adaptarse a un entorno de "trabajo ágil", con división del trabajo y gestión de historias de usuario con la aplicación Trello. Siendo un equipo mayormente multifuncional, cada integrante se ha enfocado en la parte que tenía más conocimientos pero sin olvidarse de la de los demás, siguiendo la filosofía T-Skills.

## Documento de Requerimientos del Software
En la carpeta del proyecto podrás encontrar el documento **mp_srs.pdf**.

## Instrucciones de uso
### Cómo iniciar la aplicación
1.	Es necesario tener java 8 instalado en el ordenador.
2.	Ejecutar la clase Main.java situada en la dirección src/com/Company/Main.java que se encuentra dentro de la carpeta del proyecto.

### Uso de la aplicación
#### Inicio de sesión
Lo primero que nos encontramos es el login. Disponemos de 3 opciones (si no se introduce un número válido, se vuelve a pedir que se introduzca una opción):
  1. Iniciar sesión.
  2. Añadir usuario.
  3. Actualizar usuario.

En caso de que salte un error (usuario no existente, contraseña incorrecta, etc.), se nos pedirá de nuevo que introduzcamos un número para seleccionar una opción de las mencionadas anteriormente.

Aparte, se comprobará el rol al iniciar sesión y, en caso de ser usuario VIP, saltará aviso de que en efecto lo eres.
