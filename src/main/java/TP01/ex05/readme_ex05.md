### Bug corrigé
- La boucle `for (i <= symbols.length)` provoque un dépassement d’indice.
  ➤ Corrigée en `i < symbols.length`.