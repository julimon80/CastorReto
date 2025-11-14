#language:es
Característica: Login - Inicion de sesión:

  Antecedentes:
    Dado que estoy en la página principal de Spotify Web.

  @loginIncorrecto
  Escenario: Login Incorrecto
    Cuando que estoy en la página de login.
    Y ingreso un correo ficticio y contraseña inválida.
    Entonces debería mostrarse un mensaje de error.