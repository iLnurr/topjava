# Онлайн проекта <a href="https://github.com/JavaWebinar/topjava06">Topjava</a>

- **Напоминаю, что cвой код пишете только в ветках HWxx. Код в ветке MASTER трогать нельзя!
Модификация кода только через патчи в материалах урока (Apply Patch), иначе придется мержить код.
Все патчи объязательны и применяются по порядку. Если при применении патча предлагается мержд, cмотрите <a href="https://github.com/JavaOPs/topjava/wiki/Git#patch-%D0%BD%D0%B5-%D0%BD%D0%B0%D0%BA%D0%B0%D1%82%D1%8B%D0%B2%D0%B0%D0%B5%D1%82%D1%81%D1%8F-%D0%BF%D1%80%D0%B5%D0%B4%D0%BB%D0%B0%D0%B3%D0%B0%D0%B5%D1%82-merge">GIT Wiki, Patch не накатывается</a>.**

- **Делать Apply Patch лучше по одному непосредственно перед видео на эту тему - тогда при просмотре вы сразу сможете отслеживать изменения кода проекта.** После патча часто полезно запустить и посмотреть на работу приложения.

- **Код проекта постоянно модифицируется, поэтому в видео вы можете увидеть старую версию кода. Иногда это способствует лучшему пониманию кода и вы видете, каким образом проект развивался**

- **Не надо подробно читать все ссылки занятия, иначе времени не останется на ДЗ, что гораздо важнее. Пусть ссылки будут Вашим справочником, к которым вы в любое время можете обратиться.**

- **<a href="https://github.com/JavaOPs/topjava/wiki/Git">Подсказка по работе с патчами (GIT Wiki)</a>**

## <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFfm5hSHEtbmxmN2kxb0NocVRwWl9KanowWXVCVXRZTlhaM09wQUswZkRidTA">Материалы 1-го урока</a>

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW0:
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFOGU0a3ZUbFo3Skk">Optional: реализация getFilteredMealsWithExceeded через Stream API</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFcUp4Z3d0Rk93TzQ">1-1-HW0-stream.patch</a>**

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFdTJIQUExajZWWkE">Работа с git в IDEA. Реализация через цикл.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFaGJwVXh2eFlTWW8">1-2-HW0-cycle.patch</a>**

> Изменения в проекте: `map.getOrDefault` земенил на `map.merge`, `for` заменены на `forEach`

## Занятие 1:
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRmo0YkVVaDJPTVE">Обзор используемых в проекте технологий. Интеграция ПО.</a>
-  <a href="http://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-for-2014/">Обзор популярности инструментов и технологий Java за 2014 г.</a>
-  <a href="http://www.youtube.com/watch?v=rJZHerwi8R0">Видео "Приложение Spring Pet Clinic"</a> 
-  Приложение <a href="https://github.com/spring-projects/spring-petclinic">Spring Pet Clinic</a>. 
-  Demo <a href="http://petclinic.cloudapp.net/">Spring Pet Clinic</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFSlZMTXBJRXJpakU">Maven.</a>
- Среда сборки проектов <a href="http://www.apache-maven.ru/" target="_blank">Maven</a>.
- <a href="http://search.maven.org/#browse">The Central Repository</a>
- Настройка пропертей Maven: кодировка, java version, зависимости, maven-compiler-plugin
- <a href="http://maven.apache.org/guides/mini/guide-multiple-modules.html">The Reactor</a>. Snapshots
- <a href="http://habrahabr.ru/blogs/java/106717/" target="_blank">Недостатки Maven</a>. Другие инструменты сборки.
- Справочник:
  - <a href="http://habrahabr.ru/post/77333/">Автоматизация сборки проекта</a>
  - <a href="http://maven.apache.org/">Home Page</a>
  - <a href="http://books.sonatype.com/mvnref-book/reference/index.html">Maven: The Complete Reference</a>
  - <a href="http://study-and-dev.com/blog/build_management_maven_1/">Разработка ПО вместе с maven</a>
  - <a href="http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html">Build Lifecycle</a>
  - <a href="http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html">Dependency Mechanism</a>
  - <a href="http://habrahabr.ru/post/111408/">Создание своих архетипов и каталогов в Maven</a>
  - <a href="http://www.ibm.com/developerworks/ru/library/j-5things13/">Зависимости, профили</a>
  - <a href="http://blog.bintray.com/2014/02/11/bintray-as-pain-free-gateway-to-maven-central/">Bintray: gateway to Maven Central</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFT3pWNkMzWVVybnc">WAR. Веб-контейнер Tomcat. Сервлеты.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFODM5dkxwMUNsVnM">1-3-switch-to-war.patch</a>**
> Сервлет добавляется в следующем патче, те в web.xml он будет подчеркиваться красным.

- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFWjFvdS1YeWYyUzA">1-4-add-servlet-api.patch</a>**
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFc2gxRkVGZklETzg">1-5-forward-to-redirect.patch</a>**

- Перевод проекта на Web.
- <a href="http://tomcat.apache.org/">Tomcat Home Page</a>
- <a href="http://java-course.ru/student/book1/servlet/">Сервлеты.</a>
- Настройка и деплой в Tomcat. Tomcat manager. Remote debug.
- Запуск Tomcat из IDEA. Динамическое обновление без передеплоя.
- Redirect, Forward, Application context, Servlet context
    - Томкат менеджер: <a href="http://localhost:8080/manager">http://localhost:8080/manager</a>
    - Наше приложение: <a href="http://localhost:8080/topjava">http://localhost:8080/topjava</a>
    - Наш сервлет:     <a href="http://localhost:8080/topjava/users">http://localhost:8080/topjava/users</a>

- Справочник:
  - <a href="http://info.javarush.ru/idea_help/2014/01/22/Руководство-пользователя-IntelliJ-IDEA-Отладчик-.html">Отладчик IntelliJ IDEA</a>
  - <a href="https://www.youtube.com/watch?v=tN8K1y-HSws&list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW&index=14">Yakov Fain: Intro to Java EE. Glassfish. Servlets (по русски)</a>
  - <a href="https://www.youtube.com/watch?v=Vumy_fbo-Qs&list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW&index=15">Yakov Fain: HTTP Sessions, Cookies, WAR deployments, JSP (по русски)</a>
  - <a href="https://www.youtube.com/playlist?list=PLoij6udfBncjHaO5s7Ln4w4BLj5FVc49P">Golovach Courses: Junior.February2014.Servlets</a>
  - <a href="http://blog.trifork.com/2014/07/14/how-to-remotely-debug-application-running-on-tomcat-from-within-intellij-idea">Remotely debug on tomcat from IDEA</a>
  - <a href="http://www.java2ee.ru/jsp/">Java Server Page</a>
  - <a href="http://java-online.ru/jsp.xhtml">Java Server Pages (JSP)</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFaTdYUnpLNFFUeXM">Логирование.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFaWQ0bFJpcGdweGc">1-6-logging.patch</a>**
> **установите переменную окружения на TOPJAVA_ROOT на корень проекта и перезапустите IDEA**

> изменения в проекте: убрал `LoggerWrapper` и логирую напрямую в логгер SLF4J. При логгировании через вспомогательный класс, в логе теряется имя исходного класса.

- <a href="http://habrahabr.ru/post/113145/">Java Logging: история кошмара</a>
- <a href="http://skipy.ru/useful/logging.html">Ведение лога приложения</a>
- <a href="http://logging.apache.org/log4j/2.x/index.html">Log4j</a>, <a href="http://logback.qos.ch/">Logback</a>
- <a href="http://www.slf4j.org/legacy.html">Добавление зависимостей логирования</a> в проект. Переменная окружения TOPJAVA_ROOT
- Конфигурирование логирования. Настройка Live Template.
- Тестирование логирования в сервлете.

#### Проверочные вопросы:
- Что нужно изменить в `pom.xml`, чтобы перейти с logback на log4j ?

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 5. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFeE9LQTdDOTZTOGc">Подсоединение к логгеру по JMX. Выбор работы.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFQWxEV1NRLXUyTlk">1-7-remote-jmx.patch</a>**

> Для подключения к Remote Process (`localhost:1099`) положить `setenv.bat` в `$TOMCET_HOME/bin`.

- Управление логированием по <a href="https://ru.wikipedia.org/wiki/Java_Management_Extensions">Java Management Extensions</a>.

### ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) Ваши вопросы

>  Используются ли еще где-то в реальной разработке JSP, или это уже устаревшая технология? Заменит ли ее JSF (https://javatalks.ru/topics/38037)?

JSF и JSP- разные ниши и задачи.
JSP- шаблонизатор, JSF- МVС фреймворк. Из моего опыта- с JSP сталкивался в 60% проектов. Его прямая замена: http://www.thymeleaf.org, но пока встречется достаточно редко. JSP не умирает, потому что просто и дешево. Кроме того включается в любой веб-контейнер (в Tomcat его реализация Jasper)

JSF- sun-овский еще фреймворк, с которым я ни разу не сталкивался и особого желания нет. Вот он как раз, по моему мнению, активно замещается хотябы angular.


> А зачем мы использовали logback? Почему SLF4J нас не устроило? Почему реализация логирования не log4j?

В `slf4j-api` это API. Там есть только пустая реализация `org.slf4j.helpers.NOPLogger` (можно посмотреть в исходниках). Logback для новых проектов стал стандарт. spring-petclinic и spring-boot используют его. http://logback.qos.ch/reasonsToSwitch.html

---------

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Домашнее задание HW01 (делаем ветку HW01 от последнего патча)

    По аналогии с Users добавить MealServlet и mealList.jsp. Время выводить без 'T'.
                                    (пока фильтрацию не делаем и User к UserMeal не добавляем)
    Задеплоить приложение (war) в Tomcat c applicationContext=topjava 
                                    (приложение должно быть доступно по http://localhost:8080/topjav)
    Попробовать разные деплои в Tomcat, remote и local debug
    
    Сделать отображения списка еды в jsp, цвет записи в таблице зависит от параметра isExceeded (красный/зеленый).
    Вариант реализации: 
    -  из сервлета обращаетесь к реализации хранения еды в памяти;
    -  преобразуете результат в List<UserMealWithExceeded>;
    -  кладете список в запрос (request.setAttribute);
    -  делаете forward на jsp для отрисовки таблицы (при redirect аттрибуты теряются). 
       В jsp для цикла можно использовать JSTL tag forEach.

    Для подключения `JSTL` в `pom.xml` нужно добавить зависимость:

    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>

- Ресурсы:
  - <a href="http://java-course.ru/student/book1/servlet/">Интернет-приложения на JAVA</a>
  - <a href="http://stackoverflow.com/questions/246859/http-1-0-vs-1-1">HTTP 1.0 vs 1.1</a>
  - <a href="http://java-course.ru/student/book1/jsp/">JSP</a>
  - <a href="http://devcolibri.com/1250">JSTL для написания JSP страниц</a>
  - <a href="http://javatutor.net/articles/jstl-patterns-for-developing-web-application-1">JSTL: Шаблоны для разработки веб-приложений в java</a>

Optional

    Сделать В ПАМЯТИ (Map) реализацию CRUD (create/read/update/delete) для списка еды с учетом многопоточности.
    Хранение в памяти будет одна из наших реализаций (такжен будет jdbc, jpa и data-jpa), подумайте над ее названием. 
    Работать с ней через интерфейс, который не должен ничего знать о деталях реализации (Map, DB или что-то еще).

    В качестве ключа добавить id в UserMeal/ UserMealWithExceed.
    Сделать форму редактирования в JSP:  
           AJAX/JavaScript использовать не надо, делаем через <form method="post"> и doPost() в сервлете.

  - <a href="https://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql/">SIMPLE CRUD USING JSP, SERVLET</a>

### ![error](https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png) Решение проблем

- Если вы не попадаете на страничку/брекпойнт в сервлете: 
  - внимательно проверьте url и applicationContext (Application Context должен быть тот же, что и url приложения): https://github.com/JavaOPs/topjava/wiki/IDEA
  - деплоить лучше как war exploded: просто нет упаковки в war и при нажатой кнопке `Update Resources on Frame Deactivation` можно обновляться css, html, jsp без передеплоя. При изменении web.xml, добавлении методов, классов необходим redeploy.
  - посомтрите в task manager: возможно у вас запущено несколько JVM и они мешают друг другу.

- Проблемы с кодировкой в POST. Возможное решение:
```
protected void doPost(HttpServletRequest request, ...) {
    request.setCharacterEncoding("UTF-8");
```

- Пробелема с maven зависимостью: иногда помогает удаление закаченного артифакта из локального maven репозитория (посмотреть его расположение можно в Maven Settings) и Reimport (последняя и первая кнопка в Maven Projects). 
 
- Для работы с JSTL кроме добавления зависимости в `pom.xml` не забываем добавлять в шапку JSP:
```
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
...
```
- После выставления переменной окружения IDEA нужно рестартовать. Проверить, видит ли java переменную окуржения можно так: `System.getenv("TOPJAVA_ROOT")`. Еще вариант: добавить `-DTOPJAVA_ROOT=...` в опции запуска приложения, тогда она доступна из java как `System.getProperty("TOPJAVA_ROOT")`.

----------------------------

### ![error](https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png) Типичные ошибки
- Хранить нужно `UserMeal` и конвертировать ее в `UserMealWithExceed` когда отдаем список на отображение в JSP. Иначе при редактировании любой записи или изменении юзером своей нормы `caloriesPerDay` нужно будет пересчитывать все записи юзера.
- Стили `color` можно применять ко всей строке таблицы `tr`, а не каждой ячейке.
- DateTimeFormatter можно сделать один заранее (он потокобезопасный в отличии от SimpleDateFormatter), а не создавать новый при каждом запросе.
- Реализаций интерфейса хранения будет несколько. Нужно учитывать это в названии класса.
- Если в названии класса есть Meal, не нужно использовать слово meal в методах класса.
