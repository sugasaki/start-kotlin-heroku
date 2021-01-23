
# kotlin & spring getting started


A barebones Kotlin app, which can easily be deployed to Heroku.


## heroku




https://github.com/sugasaki/start-kotlin-heroku

---

### spring

https://start.spring.io/
[Spring Initializr](https://start.spring.io/)


<img width="1496" alt="スクリーンショット 2021-01-24 1 40 07" src="https://user-images.githubusercontent.com/1316886/105608632-6b107000-5de7-11eb-8628-d2552b22df3f.png">



### Procfile

Procfileファイルをルートに作成


```
web: java -Dserver.port=$PORT $JAVA_OPTS -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

or

```
web: java -Dserver.port=$PORT $JAVA_OPTS -jar build/libs/*.jar
```



### javaを11に変更

Spring InitializrでJava11を選択したので、HerokuのJavamo11に変更する

Javaバージョンの指定するには、`system.properties`を追加する必要がある。

[アクティベーションHeroku の Java サポート \| Heroku Dev Center](https://devcenter.heroku.com/ja/articles/java-support#specifying-a-java-version)

system.properties

```:system.properties
java.runtime.version=11
```



## git

```
git init
git add .
git commit  -m 'first commit'
```


## heroku

```
heroku create
heroku apps
git push heroku master
```


## run

```
[heroku open /hello]()

heroku open /hello?name=taro
```



## on local

```
http://localhost:8080/hello
```



## trouble shout


```
heroku logs --tail
```


```
heroku run console
```



```
2021-01-23T13:29:09.479056+00:00 heroku[router]: at=error code=H10 desc="App crashed" method=GET path="/hello" host=sheltered-bastion-78347.herokuapp.com request_id=0b22f443-e210-4efa-bc09-4cd3ccf1023b fwd="121.113.51.72" dyno= connect= service= status=503 bytes= protocol=https
2021-01-23T13:29:10.404987+00:00 heroku[router]: at=error code=H10 desc="App crashed" method=GET path="/favicon.ico" host=sheltered-bastion-78347.herokuapp.com request_id=1777303e-eab5-45e2-a21b-7745107c8172 fwd="121.113.51.72" dyno= connect= service= status=503 bytes= protocol=https
^
```

heroku local web

```
[WARN] ENOENT: no such file or directory, open 'Procfile'
[FAIL] No Procfile and no package.json file found in Current Directory - See run-foreman.js --help
```





# 参考

[Deploying Gradle Apps on Heroku \| Heroku Dev Center](https://devcenter.heroku.com/articles/deploying-gradle-apps-on-heroku)

[Heroku—Ktor](https://ktor.io/docs/heroku.html)

[Heroku \- サーバー \- Ktor](https://jp.ktor.work/servers/deploy/hosting/heroku.html)

