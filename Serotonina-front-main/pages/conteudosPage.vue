<template>
  <div>
    <div>
        <link href="../assets/css/main.css" rel="stylesheet" />
        <BarHeader/>
      <div>
        <h2 class="titulo-app">Conteúdos</h2>
      </div>

        <div class="caixa-conteudo">
        <div class="layout-1">
          <img class="image" src="~/assets/img1.png" alt="Imagem um" />
          <p class="conteudo-4">2 meses atrás</p>
          <h4 class="titulo-1-conteudo">Prática do exercício físico</h4>

          <p class="conteudo-3">
            Dicas para quem quer melhorar a rotina de <br /><br />exercícios
            físicos durante as férias.
          </p>
          <!-- <NuxtLink to="/salvos-copy"><b-button class="botao-saude" @click="digaOla">#Saúde</b-button></NuxtLink> -->
          <NuxtLink to="/salvos-copy"
            ><b-button class="botao-saude">#Saúde</b-button></NuxtLink
          >
          <img class="icon-2" src="~/assets/Icon.png" alt="Icon salvar" />
          <img
            class="icon-3"
            src="~/assets/likeecomp.png"
            alt="Icon compartilhar"
          />
        </div>

        <div class="layout-3">
          <img class="image-2" src="~/assets/img2.png" alt="Imagem dois" />
          <p class="conteudo-4">6 meses atrás</p>
          <h4 class="titulo-1-conteudo">Together</h4>

          <p class="conteudo-3">
            Veja métodos para melhorar sua eficiência<br /><br />no trabalho !
          </p>
        </div>
        </div>
      
    </div>
  </div>
</template>

<script>

</script>

