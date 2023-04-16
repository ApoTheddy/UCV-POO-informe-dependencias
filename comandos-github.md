<h5>Comandos de github</h5>

Obtener las ultimas modificaciones del proyecto y actualizarlas
```
git pull
```

Observar los cambios que ha tenido el proyecto mas no actualizarlas
```
git fetch
```

Eliminar un commit
```
git reset --soft HEAD~<numero de commits a eliminar>
```

Verificiar cuantas ramas hay en el proyecto, si la rama esta en color verde, es porque estamos en esa rama
```
git branch
```

Eliminar una rama
```
git branch -d <nombre de la rama>
```

Crear una rama
```
git branch <nombre de la rama>
```

Cambiarse de rama
```
git checkout <nombre de la rama>
```

Crear una rama y cambiarse de forma automatica
```
git checkout -b <nombre de la rama>
```

Verificar los 'commits' del proyecto
```
git log
```
o de forma mas resumida
```
git log --oneline
```

Subir una rama al repositorio de github
```
git push --set-upstream origin <nombre de la rama>
```

Subir los cambios realizados en el proyecto a la rama 'main(rama principal)'(No se aconseja subir en esta rama)
```
git push
```

