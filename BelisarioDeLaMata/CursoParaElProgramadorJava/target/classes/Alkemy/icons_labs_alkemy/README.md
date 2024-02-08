# icons_labs_alkemy

## SQL
### Create DB
CREATE SCHEMA `icon` DEFAULT CHARACTER SET utf8 ;

## Consult End Point
POST - crear continente - http://localhost:8080/continentes
```
{
    "imagen": "/usr/tmp/ejemplo5.jpg",
    "denominacion": "America"
}
```

GET - consultar continentes - http://localhost:8080/continentes
