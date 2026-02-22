# Game App Backend

Backend desarrollado en **Spring Boot** con **Kotlin** y **Maven** para una aplicación de juegos móvil.

## Descripción

Este proyecto proporciona una API REST que implementa la lógica de varios juegos:

- **Lotería**: Genera números aleatorios
- **Adivina el Número**: El usuario intenta adivinar un número secreto
- **Piedra, Papel o Tijeras**: El usuario juega contra el servidor

## Tecnologías

- **Java/Kotlin**: Lenguaje de programación
- **Spring Boot 3.5.0**: Framework web
- **Maven**: Gestor de dependencias
- **REST API**: Arquitectura de servicios

## Instalación

### Requisitos previos

- Java 17 o superior
- Maven 3.6 o superior

### Pasos de instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/anaflrs4/game-app-backend.git
cd game-app-backend
```

2. Compilar el proyecto:
```bash
./mvnw clean install
```

3. Ejecutar la aplicación:
```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`

## Endpoints

### Piedra, Papel o Tijeras

**Endpoint:** `GET /play/rock-paper-scissors`

**Parámetros:**
- `playerMove` (requerido): El movimiento del jugador. Valores: `ROCK`, `PAPER`, `SCISSORS`

**Ejemplo de solicitud (curl):**
```bash
curl "http://localhost:8080/play/rock-paper-scissors?playerMove=ROCK"
```

**Ejemplo de respuesta:**
```json
{
  "playerMove": "ROCK",
  "serverMove": "SCISSORS",
  "result": "WIN"
}
```

**Valores de resultado:**
- `WIN`: El jugador gana
- `LOSE`: El jugador pierde
- `DRAW`: Empate

## Estructura del Proyecto

```
game-app-backend/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── com/example/gameappbackend/
│   │   │       ├── GameAppBackendApplication.kt
│   │   │       └── GameController.kt
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
└── README.md
```

## Despliegue

El backend está desplegado en Render en la siguiente URL:

```
https://game-app-backend.onrender.com
```

### Ejemplo de solicitud al servidor en producción:
```bash
curl "https://game-app-backend.onrender.com/play/rock-paper-scissors?playerMove=PAPER"
```

## Desarrollo

Para realizar cambios en el código:

1. Editar los archivos en `src/main/kotlin/`
2. Compilar con `./mvnw clean install`
3. Ejecutar pruebas con `./mvnw test`
4. Hacer push a GitHub

## Licencia

Este proyecto es de código abierto bajo la licencia MIT.

## Autor

Desarrollado por Ana Paula Flores Escobar
