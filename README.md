# RetirosAutomatic
Retiros Automaticos
-- Catalogo Edad Maxima para Estudio Dengue ***
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_EDAD_MAX_DENGUE', NULL, NULL, NULL, '1', 0, '0', 'Catalogo Edad Maxima Estudio DENGUE');
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_EDAD_MAX_DENGUE_MAX', '1', 'CAT_EDAD_MAX_DENGUE', NULL, '0', 1, '0', '18');

-- Catalogo Edad Maxima para Estudio Influenza***
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_EDAD_MAX_INFLUENZA', NULL, NULL, NULL, '1', 0, '0', 'Catalogo Edad Maxima Estudio INFLUENZA');
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_EDAD_MAX_INFLUENZA_MAX', '1', 'CAT_EDAD_MAX_INFLUENZA', NULL, '0', 1, '0', '15');

-- Catalogo Edad Maxima para Estudio UO1***
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_EDAD_MAX_UO1', NULL, NULL, NULL, '1', 0, '0', 'Catalogo Edad Maxima Estudio UO1');
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_EDAD_MAX_UO1_MAX', '1', 'CAT_EDAD_MAX_UO1', NULL, '0', 1, '0', '15');

-- Catalogo Fecha de ejecucion y tiempo de Repeticion del THREAD***
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_TIEMPO_DESPERTAR_RETIRO_AUTOMATIC', NULL, NULL, NULL, '1', 0, '0', 'Catalogo Fecha y Hora Ejecución Thread');
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_TIEMPO_DESPERTAR_RETIRO_AUTOMATIC_datetime', '1', 'CAT_TIEMPO_DESPERTAR_RETIRO_AUTOMATIC', NULL, '0', 1, '0', '10/06/2022 03:00:00');
INSERT INTO `mensajes` (`messageKey`, `catKey`, `catRoot`, `en`, `isCat`, `orden`, `catPasive`, `es`) VALUES ('CAT_TIEMPO_DESPERTAR_RETIRO_AUTOMATIC_repeticion', '2', 'CAT_TIEMPO_DESPERTAR_RETIRO_AUTOMATIC', NULL, '0', 2, '0', '86400000');

-- falta file CAT_METADATOS_RETIRO_AUTOMATIC
