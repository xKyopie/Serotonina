<template>
  <div>
    <!-- <link href="../assets/css/main.css" rel="stylesheet"> -->
    <menuHamburguer> </menuHamburguer>
    <b-container>
      <img src="~/assets/ios.png" alt="ios icon" />
      <div class="texto-fundo">
        <h3 class="titulo">Conteúdos</h3>
        <img class="grupo-2" src="~/assets/grupo2.png" alt="grupo 2" />
        <img class="grupo-3" src="~/assets/grupo5.png" alt="grupo 5" />
      </div>

      <div class="layout-1">
        <img class="image" src="~/assets/img1.png" alt="Imagem um" />
        <p class="conteudo-4">2 meses atrás</p>
        <NuxtLink to="/1">
          <h4 class="titulo-1-conteudo">Prática do exercício físico</h4>
        </NuxtLink>

        <p class="conteudo-3">
          Dicas para quem quer melhorar a rotina de <br /><br />exercícios
          físicos durante as férias.
        </p>
        <NuxtLink to="/1"><b-button class="botao-saude">#Saúde</b-button> </NuxtLink>
        <img class="icon-2" src="~/assets/Icon.png" alt="Icon salvar" />
        <img
          class="icon-3"
          src="~/assets/likeecomp.png"
          alt="Icon compartilhar"
        />
      </div>

      <div class="layout-2">
        <img class="image-2" src="~/assets/img2.png" alt="Imagem dois" />
        <p class="conteudo-4">6 meses atrás</p>
        <h4 class="titulo-1-conteudo">Together</h4>

        <p class="conteudo-3">
          Veja métodos para melhorar sua eficiência<br /><br />no trabalho !
        </p>
      </div>

      <div class="caixa-baixo">
    <div class="footer">
      <img class="metas" src="~/assets/emoji_events.png" alt="trofeu" />

      <NuxtLink to="/tarefas-1"><img class="dns" src="~/assets/dns.png" alt="dns" /></NuxtLink>

      <NuxtLink to="/conteudos"><img class="conteudos" src="~/assets/search.png" alt="lupa" /></NuxtLink>
    </div>
   
    <div class="footer-2">
      <p class="texto-metas">Metas</p>
      <p class="texto-dns">Tarefas</p>
      <p class="texto-conteudos">Conteúdos</p>
    </div>
   </div>


    <!--  <div>
        <img class="ios-down" src="~/assets/iosDown.png" alt="Ios down" />
      </div> -->
      5
    </b-container>
  </div>
</template>

<script>
import menuHamburguer from '~/components/menuHamburguer.vue'

export default {
  components: { menuHamburguer },
  name: 'index-Tela',
}



</script>

