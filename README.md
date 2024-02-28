# Locadora de Veículos - Projeto Web I:
  - Ser + Tech Programa 50+ Ada Tech patrocinado pela Núclea.
  - Modulo Desenvolvimento Web I
 - Professor Alex Araujo.
- Este projeto é uma aplicação web desenvolvida em Spring Boot para 
gerenciar veículos em uma locadora. A aplicação utiliza Thymeleaf 
como motor de template para a camada de visualização e PostgreSQL como banco de dados.

 ## Dependências

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Validation
- Spring Boot DevTools (opcional, para desenvolvimento)
- Driver PostgreSQL
- Lombok (opcional, para melhor legibilidade do código)
- Spring Boot Starter Test
 
## Começando :
- 1 - Clonar o repositório:
- git clone https://github.com/teofilonicolau/Locadocadora_veiculos_projeto_web.git
- 2 - Instalar dependências:
- mvn install
- 3 - Configurar o banco de dados:
- Defina as seguintes variáveis de ambiente:

  - SPRING_DATASOURCE_URL: URL do seu banco de dados PostgreSQL
  - SPRING_DATASOURCE_USERNAME: Nome de usuário para seu banco de dados
  - SPRING_DATASOURCE_PASSWORD: Senha para seu banco de dados
  - Como alternativa, você pode fornecer essas propriedades diretamente no seu arquivo application.properties.
  - 
- 4 - Executar a aplicação:
- mvn spring-boot:run
- Isso iniciará a aplicação na porta 8082 (http://localhost:8082/)
- ![image](https://github.com/teofilonicolau/Locadocadora_veiculos_projeto_web/assets/97030160/d600cb65-3408-4ce1-b6c0-5cfcf53ea96b)



 ## Configuração do Banco de Dados (PostgreSQL com Docker):
 - 1 - Baixe e instale o Docker Desktop em https://www.docker.com/products/docker-desktop/.
 - 2 - Executar um contêiner PostgreSQL:
 - docker run -d --name locadoraveiculos-db -e POSTGRES_PASSWORD=senha -p 5432:5432 postgres
 - Substitua senha por uma senha forte que você escolher.
 - 3 - Atualizar variáveis de ambiente:
 - Defina a variável de ambiente SPRING_DATASOURCE_URL como jdbc:postgresql://localhost:5432/postgres (assumindo que o nome do banco de dados padrão é postgres).
## Usando a Aplicação

 - Acesse a aplicação em seu navegador web em http://localhost:8082.
 - ![image](https://github.com/teofilonicolau/Locadocadora_veiculos_projeto_web/assets/97030160/ccbc1bea-34ff-4d8a-b596-7307e57dd52d)


 - Visualizar veículos:
 - ![image](https://github.com/teofilonicolau/Locadocadora_veiculos_projeto_web/assets/97030160/ac9db915-1dc5-4ce3-809e-fb51ae7de5e7)


 - O endpoint /veiculos exibe uma lista paginada de veículos.
 - Adicionar um novo veículo:

 - Navegue para /veiculo/add.
 - ![image](https://github.com/teofilonicolau/Locadocadora_veiculos_projeto_web/assets/97030160/313256fb-8274-462c-8206-91688763c2e4)

 - 
 - Preencha os detalhes obrigatórios (placa, marca, modelo, tipo, disponível).
 - Clique em "Gravar" para criar o veículo.
 - Editar um veículo:

 - Clique no link "Editar" ao lado do veículo desejado na página /veiculos.
 - Faça as alterações necessárias nos detalhes do veículo.
 - Clique em "Gravar" para atualizar o veículo.
 - Excluir um veículo:

 - Clique no link "Excluir" ao lado do veículo desejado na página /veiculos.
 - Confirme a exclusão.
 - Informação Adicional

- Esta aplicação usa Lombok para melhor legibilidade do código. Se você não tem Lombok instalado, você pode remover a dependência Lombok do arquivo pom.xml.
- O código utiliza templates Thymeleaf para renderizar a interface do usuário.
 - O pacote veiculo contém a lógica de domínio principal para veículos.
- O pacote veiculo-service fornece serviços para gerenciar veículos no banco de dados.
- Espero que este README forneça uma visão geral abrangente da aplicação Locadora Veículos Web. Sinta-se à vontade para entrar em contato se tiver mais perguntas!   


 
    


  
    
 

