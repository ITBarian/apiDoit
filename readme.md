# API DOIT

## INTRODUCCIÓN
A través de un API Rest desarrollamos una aplicación web de gestión de ítems en una ToDoList dinámica.
En esta aplicación web podemos trabajar con más de una lista y con los items.
Creando, eliminando y modificando listas
Dando una lista, podemos añadir un ítem, marcarlo como hecho o no, reordenarlos, eliminarlos o modificarlos.

## ACCIONES
### *Ver todas las listas*
Usando el end-point **/todoList** acedemos a un listado de todas las listas disponibles


### *Crear listas.*
Podemos obtener un POST de una lista con el end-point **/todoList**


### *Ver lista.*
Para obtener el GET del la lista que hemos creado usamos el end-point **/todoList/{idTodoList}**


### *Modificar listas.*
Para obtener una actualizacion POST de una lista usamos el end-point **/todoList/{idTodoList}**


### *Eliminar listas.*
Para obtener el DELETE de una lista usamos el end-point **/todoList/{idTodoList}**


### *Ver todos los items*
Para ver todos los items de las listas usamos el end-point **/todoList/todoItem**


### *Añadir un ítem a una lista.*
Para obtener el POST de un ítem en una lista usamos el end-point **/todoList/{idTodoList}/todoItem**


### *Consultar todos los items de una lista.*
Para obtener el GET de los items en una lista por su ID usamos el end-point **/todoList/{idTodoList}/todoItem**


### *Marcar y desmarcar un ítem o actualizar descripción.*
Para actualizar el estado del ítem con un POST usamos el end-point **/todoList/todoItem/{idTodoItem}**


### *Consultar un ítem.*
Para obtener el GET de un ítem por su ID **/todoList/todoItem/{idTodoItem}**


### *Eliminar ítem de una lista.*
Para obtener el DELETE de un ítem usamos el end-point **/todoList/{idTodoList}/todoItem/{idTodoItem}**


## API-REST
### *Heroku*
Heroku es un contenedor base PaaS (Platform as a Service) el cual nos permite desarrolar y escalar aplicaciones modernas

### *Spring Boot*
Es una herramienta que hace que el desarrollo de aplicaciones web y microservicios con Spring Framework sea más rápido y fácil a través de tres capacidades principales:
- Autoconfiguración.
- Un enfoque obstinado de la configuración.
- La capacidad de crear aplicaciones independientes.


## Base de datos
### *PostgreSQL*
Se ha realizado una migración de la base de datos de H2 a PostgreSQL.
