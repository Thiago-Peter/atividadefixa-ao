# StreamFlix — roteiro prático Android

Projeto desenvolvido a partir do roteiro anexado, usando **Java, XML, Material Design 3 e RecyclerView**. A aplicação apresenta uma tela inicial com banner, tema escuro e uma lista horizontal de pôsteres.

## Requisitos

- Android Studio Hedgehog ou superior
- Android SDK API 35 instalado
- JDK 17
- Emulador ou dispositivo com Android 7.0 (API 24) ou superior

## Como executar

1. Abra a pasta `StreamFlix` no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Selecione um emulador ou conecte um dispositivo.
4. Execute a configuração `app`.

O projeto define `minSdk 24`, usa `Theme.Material3.DayNight.NoActionBar` e mantém textos, cores e dimensões em recursos XML.

## Estrutura principal

```text
app/src/main/
├── java/com/example/streamflix/
│   ├── MainActivity.java
│   └── MovieAdapter.java
├── res/
│   ├── drawable/
│   ├── layout/
│   ├── values/
│   └── values-night/
└── AndroidManifest.xml
```

## Resultados observados

- A tela inicia com fundo escuro e banner em destaque.
- O título “Populares” aparece abaixo do banner.
- Os três cards de filmes são exibidos em uma lista horizontal.
- Os cards possuem cantos arredondados e elevação Material.
- Os recursos vetoriais são carregados localmente, sem depender de imagens externas.
- A interface usa `contentDescription` para os elementos de imagem.
- O tema pode alternar entre variantes Day/Night do Material 3.

## Commits individuais da dupla

O histórico local foi organizado em etapas para facilitar a identificação da contribuição:

```bash
git log --oneline --decorate
```

Para publicar o projeto:

```bash
git remote add origin URL_DO_REPOSITORIO
git branch -M main
git push -u origin main
```

Para manter contribuições individuais, cada integrante deve configurar seu nome e e-mail antes de fazer seu commit:

```bash
git config user.name "Nome do integrante"
git config user.email "email@exemplo.com"
git add .
git commit -m "Descrição da contribuição"
git push
```

O link remoto precisa ser associado a um repositório com autorização de acesso.

## Checklist do roteiro

- [x] `colors.xml` com nomes semânticos
- [x] `strings.xml` sem textos fixos no layout
- [x] Tema Material 3
- [x] Variante `values-night`
- [x] Layout XML responsivo
- [x] MaterialCardView e RecyclerView
- [x] Imagens vetoriais locais
- [x] `contentDescription`
- [x] Activity e Adapter em Java
- [x] Organização por recursos reutilizáveis

## Resultados observados

A interface foi organizada conforme o roteiro proposto, utilizando Java, XML, Material Design 3 e RecyclerView.

O projeto contém uma tela inicial com banner, tema escuro, título de filmes populares e lista horizontal de cards.

Também foram configurados os arquivos colors.xml, strings.xml, themes.xml, dimens.xml, layouts XML e recursos vetoriais na pasta drawable.
