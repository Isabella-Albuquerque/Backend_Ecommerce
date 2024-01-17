# Backend_Ecommerce
Projeto desenvolvido durante bootcamp Java da Generation simulando o backend de um e-commerce.
Este projeto consiste na implementação da backend para uma loja de games, oferecendo a capacidade de manipular dados relacionados aos produtos disponíveis na loja. Os produtos são categorizados para proporcionar uma organização eficiente.

## Principais Funcionalidades:

- Desenvolvimento do projeto utilizando o framework Spring, aderindo às melhores práticas recomendadas.
- Configuração do banco de dados da aplicação no arquivo application.properties.
- Implementação completa das operações CRUD para o recurso "Produto", compreendendo seis métodos distintos.
- Implementação completa das operações CRUD para o recurso "Categoria", também abrangendo seis métodos.
- Estabelecimento de um relacionamento do tipo "One to Many" entre as classes "Categoria" e "Produto".
- Adoção das boas práticas do Spring, incluindo a estruturação de modelos (Model), repositórios (Repository), e controladores (Controller).
- Teste abrangente da API utilizando a ferramenta Insomnia.
- Criação de um repositório remoto no GitHub para versionamento do código.
- Envio do projeto para o repositório remoto no GitHub.

## Validação nas Camadas:

- Produto: Verificação e validação nas camadas Model, Repository, e Controller.
- ProdutoRepository: Validado na camada Repository.
- ProdutoController: Validado na camada Controller.
