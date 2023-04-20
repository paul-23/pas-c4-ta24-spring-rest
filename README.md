# PAS - C4 - TA24 - SPRING REST

![image](https://user-images.githubusercontent.com/62121921/231734154-d9d63a11-426d-428d-87b9-23d921a30fde.png)

![image](https://user-images.githubusercontent.com/62121921/231734458-e25b4747-2fdb-4f80-bdb1-f4f27a0a09ee.png)

# Empleados

### Listar todos los empleados

**GET** ``` localhost:8181/api/empleados ```

### Listar empleados por trabajo

**GET** ```localhost:8181/api/empleados/trabajo/{nombretrabajo}```

```
localhost:8181/api/empleados/trabajo/PROGRAMADOR
```

### Añadir empleados

**POST** ```localhost:8181/api/empleados```

```
{
    "nombre": "Nombre Empleado",
    "trabajo": "PROGRAMADOR"
}
```

### Listar empleado por id

**GET** ```localhost:8181/api/empleados/{id}```

```
localhost:8181/api/empleados/1
```

### Actualizar empleado

**PUT** ```localhost:8181/api/empleados/{id}```

```
localhost:8181/api/empleados/1
```

```
{
    "nombre": "Nombre Empleado",
    "trabajo": "PROGRAMADOR"
}
```

### Eliminar empleado

**DELETE** ```localhost:8181/api/empleados/{id}```

```
localhost:8181/api/empleados/1
```
