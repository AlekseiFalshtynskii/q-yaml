# Библиотека работы с yaml конфигурациями

#### 3.4.0

Поддерживает Spring Boot 3.4.7, JDK 21

## Описание работы

Библиотека содержит фабрику-загрузчик yaml свойств

#### 1. Добавить в зависимости библиотеку

~~~
implementation "ru.b.q:q-yaml"
~~~

#### 2. Использовать фабрику в @PropertySource

~~~
@PropertySource(value = "classpath:your.yml", factory = YamlPropertyLoaderFactory.class, encoding = "UTF-8")
~~~

