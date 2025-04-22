Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir un archivo PDF o DOCX válido y verificar la vista previa
    Given el usuario está en la página de carga de archivos
    When el usuario selecciona un archivo "sample.pdf" en formato válido
    Then el archivo debería cargarse correctamente
    And la vista previa debe mostrar el nombre "sample.pdf", tamaño y tipo