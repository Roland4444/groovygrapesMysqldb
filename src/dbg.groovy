
@Grapes([
        @Grab(group='mysql',module='mysql-connector-java',version='8.0.22'),
        @GrabConfig(systemClassLoader=true)
])

import groovy.sql.Sql
def db = [url:'jdbc:mysql://localhost:3306/test', user:'user2', password:'123', driver:'com.mysql.jdbc.Driver']
def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

sql.eachRow("select * from test") {
    println("id=${it.id}, name= ${it.name}")
}