<template>
  <div>
      <BarHeader></BarHeader>
     
     <!-- FORMULARIO -->
     <div>
       <h2 class="titulo-app">Tarefas</h2>
       <Todo/>
     </div>
    
     
      <!-- Criando Tarefas -->
      <div :key="tarefa.id" v-for="tarefa in tarefas" class="tarefas-lista">
        <ItemListaTarefas
          class="lista"
          :idTarefa="tarefa.id"
          :tarefa="tarefa.tarefa"
        >
        </ItemListaTarefas>
   
      <div id="teste"></div>

      </div>

  </div>
</template>

<script>

import BarHeader from '../components/BarHeader.vue';
import Todo from '../components/ToDo.vue';


export default {
  components: { BarHeader, Todo},
  data() {
    return {
      titulo: 'Conteúdos',
      newTask: ''
    }
  },
  methods: {
    digaOla() {
      alert('Bem vindo(a) Serotonina!')
    },
  },
  
  
}
</script>

