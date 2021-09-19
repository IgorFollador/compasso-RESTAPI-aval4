# compasso-RESTAPI-aval4
### Instruções:

- Para execução do projeto como um todo é necessário executar a classe `PartidosEAssociadosApplication.java`;
- A documentação feita no Swagger está localizada em `~compasso-RESTAPI-aval4/swagger` contendo os arquivos: `docPartidos.yaml` e `docPartidos.json`.


#### Configurações:

As configurações da JPA e do DataSource para o MySQL estão localizadas em `~compasso-RESTAPI-aval4/src/main/resources/application.properties`.

##### Possuindo as configurações de porta, usuário e senha abaixo:

```xml
#datasource
spring.datasource.url=jdbc:mysql://localhost:3306/partidos_igorf?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root

#jpa
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.jdbc.time_zone=America/Sao_Paulo
user.timezone=America/Sao_Paulo

```

##### OBS:

Este é um projeto Maven, no qual foi utilizada apenas linguagem Java e o SGBD MySQL.
O banco de dados é gerado automaticamente ao executar o projeto. A única necessidade é executar o Schema `data.sql` citado acima.

- Nome do banco `partidos_igorf`;
- Usuário padrão `root`;
- Senha padrão `root`;

### IMPORTANTE

O cadastro de datas é realizado conforme a ISO 8601 -> `yyyy-MM-dd`.
