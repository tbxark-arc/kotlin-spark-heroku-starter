![Java CI with Maven](https://github.com/TBXark/kotlin-spark-heroku-starter/workflows/Java%20CI%20with%20Maven/badge.svg)
# heroku-starter

Demo: https://kotlin-spark-heroku-starter.herokuapp.com/

A barebones Java app, which can easily be deployed to Heroku.

This application supports the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/tbxark/kotlin-spark-heroku-starter.git
$ cd heroku-starter
$ mvn install
$ heroku local:start
```

Or you can start directly using maven

``sh
$ git clone https://github.com/tbxark/kotlin-spark-heroku-starter.git
$ cd heroku-starter
$ mvn install
$ mvn compile exec:java -Dexec.mainClass="com.tbxark.ApplicationKt"

``

Your app should now be running on [localhost:5000](http://localhost:5000/).

If you're going to use a database, ensure you have a local `.env` file that reads something like this:

```
JDBC_DATABASE_URL=jdbc:postgresql://localhost:5432/java_database_name
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
