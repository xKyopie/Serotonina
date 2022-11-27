<template>
  <!-- <link href="../assets/css/main.css" rel="stylesheet"> -->

  <div>
      <BarHeader/>
     
     <div>
       <h2 class="titulo-app">Salvos</h2>
     </div>
      
      <div class="caixa-salvos">
      <div>
        <img class="img-salvos-1" src="../assets/Image2.png" />
        <b-button class="botao">#Saúde</b-button>
        <img class="icon-2" src="../assets/Icon.png" alt="Icon salvar" />
        <img
          class="icon-3"
          src="../assets/likeecomp.png"
          alt="Icon compartilhar"
        />
      </div>

      <div class="layout-2">
        <p class="conteudo-4">2 meses atrás</p>
        <h4 class="titulo-1-conteudo">Prática do exercício físico</h4>

        <p class="conteudo-3">Dicas para quem quer melhorar a rotina de</p>
        <p class="conteudo-3">exercícios físicos durante as férias.</p>
        <div class="conteudo-5">
          <p>• Diminua o ritmo dos exercícios, mas não pare totalmente.</p>
          <p>• Inclua exercícios nos passeios turísticos.</p>
          <p>• Envola a família nos passeios.</p>
          <p>• Cuide de sua alimentação.</p>
        </div>
      </div>

      </div>
  </div>

</template>

<script>
export default {
  async asyncData({ route }) {
    const { id } = await route.params
    return { id }
  },

  data() {
    return {
      titulo: 'Conteudos',
      conteudo: [],
      salvos: [
        {
          id: 1,
          url: '~/assets/Image2.png',
          tempo: '2 meses atrás',
          titulo: 'Prática do exercício físico',
          titulo2:
            'Dicas para quem quer melhorar a rotina de exercícios físicos durante as férias.',
          conteudoS: [
            '• Diminua o ritmo dos exercícios, mas não pare totalmente.',
            '• Inclua exercícios nos passeios turísticos.',
            '• Envola a família nos passeios.',
            '• Cuide de sua alimentação.',
          ],
        },
      ],
    }
  },
}
</script>

