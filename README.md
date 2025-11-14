# Proyecto de Automatización - Spotify 🛒

Este proyecto implementa **pruebas automatizadas** utilizando **Serenity BDD** con el patrón **Screenplay**.  
El objetivo principal es automatizar escenarios [Spotify](https://open.spotify.com/intl-es/)
validando funcionalidades como agregar productos al carrito y verificar el total.

---

## 🚀 Tecnologías utilizadas

- **Java 17+**
- **Gradle**
- **Serenity BDD**
- **Screenplay Pattern**
- **JUnit**
- **Cucumber**


---

## 📂 Estructura del Proyecto

src
├── main
│ └── java
│ └── com.spotify
│ ├── hooks # Configuración inicial y final (Before/After)
│ ├── interactions # Interacciones personalizadas con la UI
│ ├── questions # Consultas al estado de la aplicación
│ ├── tasks # Acciones principales que ejecutan los actores
│ ├── ui # Mapeo de elementos de interfaz de usuario (Targets)
│ └── utils # Clases utilitarias y helpers
└── test
├── java # Step Definitions y Runners
└── resources # Archivos de configuración y Features (.feature)

## ⚙️ Configuración

### 1. Clonar el proyecto

```bash
git https://github.com/julimon80/CastorReto.git
cd Plantilla-main

```

### 2. Ejecutar el test

Esta Ejecucion se hace con la dependencia de Boni Garcia, se recomienda tener chrome instalado.

```bash
./gradlew clean test aggregate
```
o gradle ya que el build tiene seteado por default las demas task 

```bash
gradle
```

### 📝 Escenarios automatizado -Ejemplo
--el antencedente es una precondicion que se cumple antes de ejecutar el escenario
--la tag es para identificar el escenario

Característica: Login - Inicion de sesión:

  Antecedentes:
    Dado que estoy en la página principal de Spotify Web.

  @loginIncorrecto
  Escenario: Login Incorrecto
    Cuando que estoy en la página de login.
    Y ingreso un correo ficticio y contraseña inválida.
    Entonces debería mostrarse un mensaje de error.

### ✅ Reportes

target/site/serenity/index.html

### 📌 Autor

Julian Casafus

QA Automation Engineer

✉️ casafus1995@gmail.com
