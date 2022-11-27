<template>
<div class="fundo">
  <div class="page-holder bg-gray-100 mt-5">
    <b-container class="bv-example-row">
      <menuHamburguer> </menuHamburguer>

      <header class="cabecalho-tarefas">
        <nav>
          <h3 class="cabecalho-titulo">Tarefas</h3>
          <img class="tabs" src="~/assets/Tabs.png" alt="Tabs icon" />
        </nav>
      </header>

      <div>
        <img class="plus" src="~/assets/Plus.png" alt="plus icon" />
        <p class="criar-lista">Criar Lista</p>
      </div>

      <!-- Criando Tarefas -->
      <div :key="tarefa.id" v-for="tarefa in tarefas" class="tarefas-lista">
        <ItemListaTarefas
          class="lista"
          :idTarefa="tarefa.id"
          :tarefa="tarefa.tarefa"
        >
        </ItemListaTarefas>
      </div>

      <NuxtLink to="tarefas-2"
        ><b-button class="botao" v-on:click="deletarTarefa">Apagar</b-button>
        <p id="delete"></p>
      </NuxtLink>

      <div id="teste"></div>

      <div class="caixa-baixo">
        <div class="footer">
          <img class="metas" src="~/assets/emoji_events.png" alt="trofeu " />

          <img class="dns" src="~/assets/dns_2.png" alt="dns" />

          <NuxtLink to="/conteudos"
            ><img class="conteudos" src="~/assets/search.png" alt="lupa"
          /></NuxtLink>

         
        </div>

        <section class="info-footer">
        <div class="info-footer-texto">
          <p class="texto-metas">Metas</p>
          <p class="texto-dns">Tarefas</p>
          <p class="texto-conteudos">Conteúdos</p>
        </div>
        </section>

      </div>
    </b-container>
  </div>
</div>
</template>

<script>
import ItemListaTarefas from '~/components/ItemListaTarefas.vue'

export default {
  components: { ItemListaTarefas },
  name: 'IndexPage',
  data() {
    return {
      tarefas: [],
      teste: '',
    }
  },
  methods: {},
  async mounted() {
    const response = await this.$axios.get('/tarefa')
    this.$axios.delete('/tarefa')
    this.tarefas = response.data
  },
  deletarTarefa() {
    const idTarefa = this.route.params.tarefas
    this.$axios.delete('/tarefa/' + idTarefa)
    const tarefa = document.getElementById('/delete')
    tarefa.innerHTML = 'Tarefa excluída com sucesso!'
  },
}
</script>

