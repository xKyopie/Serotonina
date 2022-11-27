<template>
    <!-- <link href="../assets/css/main.css" rel="stylesheet"> -->
  <div class="container">
    <b-container>
      <img src="~/assets/ios.png" alt="ios icon" />
      <NuxtLink to="/conteudos"><img class="cancel" src="~/assets/cancel.png" alt="cancel icon" /></NuxtLink>
      <div>
        <!-- <img v-bind:src="getBuscaImage(id)" /> -->
        <!-- <img v-bind:src="require(buscaSalvo(id).url)" /> -->
        <img src="~/assets/Image2.png" />
        <b-button class="botao" @click="digaOla">#Saúde</b-button>
        <img class="icon-2" src="~/assets/Icon.png" alt="Icon salvar" />
        <img
          class="icon-3"
          src="~/assets/likeecomp.png"
          alt="Icon compartilhar"
        />
      </div>

      <div class="layout-2">
        <p class="conteudo-4">{{ buscaSalvo(id).tempo }}</p>
        <!-- <p class="conteudo-4">{{ salvos[id].tempo }}</p> -->
        <!-- <p class="conteudo-4">{{ salvos[id].tempo }}</p> -->
        <h4 class="titulo-1-conteudo">{{salvos.filter(item => item.id == id)[0].titulo }}</h4>

        <!-- <p class="conteudo-3">{{ salvos[id].titulo2 }}</p> -->
        <p class="conteudo-3">{{salvos.filter(item => item.id == id)[0].titulo2 }}</p>
        <p class="conteudo-3">{{salvos.filter(item => item.id == id)[0].titulo3 }}</p>
        <div class="conteudo-5">
          <!-- <p v-bind:key="conteudo" v-for="conteudo in conteudos"> -->
          <p v-bind:key="conteudo" v-for="conteudo in salvos.filter(item => item.id == id)[0].conteudos">
            {{ conteudo }}
          </p>
        </div>
      </div>

      <div class="caixa-baixo">
        <div class="footer">
          <img class="metas" src="~/assets/emoji_events.png" alt="trofeu" />

          <NuxtLink to="/tarefas-1"
            ><img class="dns" src="~/assets/dns.png" alt="dns"
          /></NuxtLink>

          <NuxtLink to="/conteudos"
            ><img class="conteudos" src="~/assets/search.png" alt="lupa"
          /></NuxtLink>
        </div>

        <div class="footer-2">
          <p class="texto-metas">Metas</p>
          <p class="texto-dns">Tarefas</p>
          <p class="texto-conteudos">Conteúdos</p>
        </div>
      </div>

      <div>
        <img class="ios-down" src="~/assets/iosDown.png" alt="Ios down" />
      </div>
    </b-container>
  </div>
</template>

<script>
export default {
  async asyncData({ route }) {
    const { salvos } = await route.params;
    // const id = parseInt(salvos)-1;
    const id = parseInt(salvos);
    // console.log(id);
    return { id };
  },

  data() {
    return {
      titulo: 'Conteudos',
      conteudo: [],
      salvos: [
        {
          id: 1,
          url: '~/assets/Image2.png',
          // url: '~/assets/Image2.png',
          tempo: '2 meses atrás',
          titulo: 'Prática do exercício físico',
          titulo2:
            ' Dicas para quem quer melhorar a rotina de',
          titulo3:
            'exercícios físicos durante as férias.',
          conteudos: [
            '• Diminua o ritmo dos exercícios, mas não pare totalmente.',
            '• Inclua exercícios nos passeios turísticos.',
            '• Envola a família nos passeios.',
            '• Cuide de sua alimentação.',
          ],
        },
      ],
    }
  },
  methods: {
    buscaSalvo(id){
      return this.salvos.filter(item => item.id === this.id)[0];
    },
    getBuscaImage(id){
        const salvo = this.salvos.filter(item => item.id === this.id)[0];
        // let images = require.context('../assets/', false, /\.png$/)

        return require(salvo.url);
    },

  }
}
</script>


