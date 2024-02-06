1. Что такое веб-приложение?

Веб-приложение - это программное обеспечение, которое доступно через веб-браузер и предназначено для выполнения определенных функций или решения определенных задач пользователем через интернет.

2. Назовите основные плюсы веб-приложений?

Основные плюсы веб-приложений включают:
- Универсальный доступ через интернет из любого устройства с браузером.
- Централизованное обновление и управление приложением на сервере.
- Возможность работы с данными в реальном времени.
- Возможность интеграции с другими веб-сервисами и API.
- Кросс-платформенная совместимость.

3. Как называется архитектура веб-приложения?

Архитектура веб-приложения часто называется клиент-серверной архитектурой.

4. За какой функционал отвечает серверная часть клиентского приложения?

Серверная часть клиентского приложения отвечает за обработку запросов от клиента, выполнение бизнес-логики, доступ к базам данных и предоставление клиенту необходимых данных или ресурсов.

5. Что такое Spring?

Spring - это фреймворк для разработки Java-приложений, который облегчает создание и поддержку больших и сложных приложений, предоставляя множество функций и инструментов для управления конфигурацией, обработки данных, безопасности и других аспектов разработки.

6. Что такое Inversion of Control?

Inversion of Control (IoC) - это принцип разработки программного обеспечения, при котором контроль над исполнением программы переключается из приложения на фреймворк или контейнер, что позволяет разработчикам более гибко управлять зависимостями и конфигурацией.

7.  Что такое Dependency Injection?

Dependency Injection (DI) - это методология внедрения зависимостей, при которой объекты получают свои зависимости из внешних источников, таких как конфигурационные файлы или контейнеры управления, вместо того чтобы создавать их самостоятельно внутри класса.

8. Какие модули Spring’a вы знаете?

Некоторые из модулей Spring включают:
- Spring Core
- Spring MVC
- Spring Security
- Spring Data
- Spring Boot
- Spring Cloud

9. В чем отличие Spring и Spring Boot?

Spring - это обширный фреймворк для разработки приложений на Java, в то время как Spring Boot - это надстройка над Spring, которая упрощает создание и настройку приложений, предоставляя автоматическую конфигурацию и управление зависимостями.

10. Как создать свое Spring Boot приложение?

Для создания Spring Boot приложения можно использовать инструмент Spring Initializr, который позволяет выбрать необходимые зависимости и генерирует начальную структуру проекта.

11. Какие есть правила в наименовании group и artifactId для проектов?

Правила для group и artifactId включают использование обратного доменного имени в качестве значения group и уникального идентификатора для вашего проекта в качестве значения artifactId.

12. Что такое контроллер?

Контроллер в Spring - это компонент приложения, который обрабатывает входящие запросы от клиентов, выполняет необходимую логику и возвращает результат в виде HTTP-ответа.

13. Для чего используется аннотация `@RestController`?

Аннотация `@RestController` используется для пометки класса в Spring, который представляет собой контроллер и обрабатывает запросы от клиентов, возвращая данные в формате, удобном для RESTful веб-сервисов (например, JSON или XML).

14. Для чего используется аннотация `@GetMapping`?

Аннотация `@GetMapping` используется для маппинга HTTP GET запросов на определенные методы контроллера в Spring, определяя адрес URL, по которому этот метод будет доступен.

15. Для чего используется аннотация `@RequestParam`?

Аннотация `@RequestParam` используется в Spring для извлечения параметров запроса из URL или запроса и передачи их в метод контроллера в качестве аргументов.