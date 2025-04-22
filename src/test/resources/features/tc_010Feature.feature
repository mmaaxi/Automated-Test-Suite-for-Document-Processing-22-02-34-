Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given el usuario ha subido los documentos necesarios
    When el sistema procesa los documentos
    Then se genera el 'Slip de salida'
    And los documentos originales y los datos extraídos se guardan en el historial de la solicitud