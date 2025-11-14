#language: es
Característica: Búsqueda de canciones/artistas:

  Como usuario
  Quiero buscar canciones/artistas

  Antecedentes:
    Dado que estoy en la página principal de Spotify Web.

  @searchSongArtist
  Esquema del escenario: Buscar canciones o artistas
    Cuando busco el término <cancionArtista>.
    Entonces debería visualizar resultados relacionados con <cancionArtista>.
    Ejemplos:
      | cancionArtista |
      | coldplay       |
