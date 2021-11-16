# Introducción
A través de un API Rest desarrollamos una aplicación web de gestión de ítems en una ToDoList dinámica.
En esta aplicación web podemos trabajar con más de una lista y con los items.
Creando, eliminando y modificando listas
Dando una lista, añadimos un item, lo marcamos como hecho o no, reordenación de los items, eliminarlos o modificarlos

# Acciones
## Ver todas las listas
Usando **/todoList** acedemos a un listado de todas las listas disponibles


## Crear listas.
Podemos obtener un POST de una lista con el end-point **/todoList**

## Ver lista.
Para obtener el GET del la lista que hemos creado usamos el end-point **/todoList/{idTodoList}**

## Modificar listas.
Para obtener una actualizacion de una lista es usamos el end-point **/todoList/{idTodoList}**

## Eliminar listas.
Para obtener el DELETE de una lista usamos el end-point **/todoList/{idTodoList}**


## Ver todos los items
Para ver todos los items de las listas usamos el end-point **/todoList/todoItem**

## Añadir un item a una lista.
Para obtener el POST de un item en una lista usamos el end-point **/todoList/{idTodoList}/todoItem**

## Consultar todos los items de una lista.
Para obtener el GET de los items en una lista por su ID usamos el end-point **/todoList/{idTodoList}/todoItem**

## Marcar y desmarcar un item.
Para actualizar el estado del item con un POST usamos el end-point **/todoList/todoItem/{idTodoItem}**

## Consultar un item.
Para obtener el GET de un item por su ID **/todoList/todoItem/{idTodoItem}**

## Eliminar item de una lista.
Para obtener el DELETE de un item usamos el end-point **/todoList/todoItem/{idTodoItem}**
