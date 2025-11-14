#language:es
Característica: Navegación a playlists populares:

  Antecedentes:
    Dado que estoy en la página principal de Spotify Web.

  @top50
  Escenario: playlists populares
    Cuando  que estoy logueado
    Y navego a “Explorar → Top listas”.
    Entonces debería visualizar playlists públicas como “Top 50 – Global”.

