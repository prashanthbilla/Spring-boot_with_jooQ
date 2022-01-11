# Spring-boot_with_jOOQ
## Basic Spring boot Application using jOOQ:
  This project aims to integrate jooQ with our basic spring boot application
  jOOQ stands for jooq Object Oriented Querying, commonly known as jOOQ, is a light database-mapping software library in Java that implements the active record pattern. Its purpose is to be both relational and object oriented by providing a domain-specific language to construct queries from classes generated from a database schema.
  
#### jOOQ Advantages:
  1. Building Typesafe SQL using DSL API.
  2. Typesafe database object referencing using Code Generation.
  3. Easy to use API for Querying and Data fetching.
  4. Creating Pojo classes using tables in database
    
#### Required Tools and Softwares:
Links:
  [Java_8V](https://www.oracle.com/java/technologies/downloads"download")
  [IntelliJIDEA](https://www.jetbrains.com/idea/download"download")
  [MySqlWorkbench](https://https://dev.mysql.com/downloads/workbench/"download")
  
#### jOOQ dependency and plugin:

###### jOOQ Dependency:

```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-jooq</artifactId>
</dependency>
```
###### jooq plugin configuration:

```
<plugin>
<groupId>org.jooq</groupId>
<artifactId>jooq-codegen-maven</artifactId>
<version>3.14.14</version>
<executions>
	<execution>
		<id>jooq-codegen</id>
		<phase>generate-sources</phase>
		<goals>
			<goal>generate</goal>
		</goals>
		<configuration>
			<!--Insert your DB configuration-->
			<jdbc>
				<driver>com.mysql.cj.jdbc.Driver</driver>
				<url>jdbc:mysql://localhost:3306/billa</url>
				<user>root</user>
				<password>*****</password>
			</jdbc>
			<generator>
				<database>
					<name>org.jooq.meta.mysql.MySQLDatabase</name>
					<includes>.*</includes>
					<excludes></excludes>
					<inputSchema>billa</inputSchema>
				</database>
				<generate>
					<pojos>true</pojos>
					<pojosEqualsAndHashCode>
						true
					</pojosEqualsAndHashCode>
					<javaTimeTypes>true</javaTimeTypes>
					<fluentSetters>true</fluentSetters>
				</generate>
				<target>
					<directory>
						src/main/java/database
					</directory>
				</target>
			</generator>

		</configuration>

	</execution>
</executions>
</plugin>
```
###### Configuration files:

###### application.yml:

```
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/billa
spring.datasource.username = root
spring.datasource.password = ******
server.port=9191
```

By using above maven plugin, we can create pojo classess into particular target file from the tables of billa databse by specifyng the path in directory within target tag in maven plugin.

#### Working and functionality:

I have implemented 3 API's in the controller

  * Post: By using this method, we can insert the data into DB (single)
  * GetAll: By using this method, we can fetch all the details from table int List format.
  * Get by name: By using this method, we can fetch single user details by using their names from DB

