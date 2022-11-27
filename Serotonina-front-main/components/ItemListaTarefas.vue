<template>
  <div class="item-tarefas mb-2 pt-3 pb-3">
    <b-row>
      <b-col cols="2" class="d-flex align-items-center justify-content-center">
      </b-col>
      <b-col cols="10" class="d-flex align-items-center justify-content-center">
        <div class="check-div">
        <input type = "checkbox" id="tarefa-check" name="tarefa-check">
        </div>
        <NuxtLink :to="`/${idTarefas}}`" class="texto">{{ tarefa }}</NuxtLink>
      </b-col>
    </b-row>
  </div>
</template>

<script>
export default {
  name: 'IndexPage',
  props: ['idTarefas', 'tarefa', 'img'],
}
</script>

<style>
.item-tarefas {
  text-decoration: none;
  width: 500px;
  background-color: rgb(255, 255, 255);
  box-shadow: 2px 2px 2px #b6b4b4;
  width: 350px;
  height: 100px;
  left: 13px;
  top: 216px;
  border-radius: 20px;
}

.texto{
  color: black;
  text-align: center;
  padding-top: 30px;
  padding-right: 30px;
}

.check-div{
  padding-right: 18px;
  padding-top: 30px;
}
</style>