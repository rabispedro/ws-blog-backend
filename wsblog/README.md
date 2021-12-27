#	WS Blog

##	Resumo

### A fins puramente de estudo, este projeto tem o objetivo de implementar o backend de um blog fictício utilizando Java com o framework Spring Boot. Será usado uma arquitetura persolanizada, baseada no DDD, para a criação deste software, assim este programa está organizado como:

```css
wsblog/
	|---> modules/
		|---> configs/
		|---> postss/
				|---> controllers/
				|---> daos/
				|---> dtos/
				|---> entities/
				|---> repositories/
				|---> services/
		|---> providers/
		|---> users/
				|---> controllers/
				|---> daos/
				|---> dtos/
				|---> entities/
				|---> repositories/
				|---> services/
		|---> utils/
	|---> WsblogApplication.java
```

#

### Observação:

-	DAOs serão utilizados para entrada de dados na API (request);
-	DTOs serão utilizados para saída de dados na API (response).

#

##	To do:

-	Implementar comunicação com Docker;
-	Implementar CRUD de User:
	-	Implementar verificação de CPF;
	-	Implementar criptografia de senha;
-	Implementar CRUD de Post;
- Implementar controle de acesso (Permissões e Cargos);
- Implementar integração com API de comentários (Disqus);
- Implementar Logger;
-	Implementar Tratamento de Erros Personalizado;
-	Implementar Testes (Unitários e de Integração).

#

## Tecnologias utilizadas

-	Java 11;
-	Maven;
-	Git;
-	Spring Framework;
-	Git Flow;
-	Markdown;
-	Visual Studio Code;
-	Docker;
-	PostgreSQL;
-	Swagger;
-	JUnit.

#
