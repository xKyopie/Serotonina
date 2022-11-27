<template>
  <div  class="carousel" >
    <b-carousel
      id="carousel-1"
      v-model="slide"
      :interval="4000"
      controls
      indicators
      background="#ceb7eb"
      @sliding-start="onSlideStart"
      @sliding-end="onSlideEnd"
    >
     
       <!-- Slides with custom text -->
     
      <b-carousel-slide img-src="../assets/car-um.png" class="img-car">
        <div class="texto-car">
        <p >Melhore seu desempenho com nossos conteúdos.</p>
      </div>
      </b-carousel-slide>
     
 
      <!-- Text slides with image -->
      <b-carousel-slide img-src="../assets/car-dois.png" class="img-car">
      <div class="texto-car">
        <p>Escreva notas para organizar suas ideias.</p>
      </div>
      </b-carousel-slide>
 
      <!-- Text slides with image -->
      <b-carousel-slide img-src="../assets/car-tres.png" class="img-car">
        <div class="texto-car">
          <p>Planeje suas tarefas com nossas To-Do List.</p>
        </div>
      </b-carousel-slide>
 
 
    <p class="mt-4">
      Slide #: {{ slide }}<br>
      Sliding: {{ sliding }}
    </p>
    </b-carousel>
  </div>
 
</template>
 
<script>
  export default {
    data() {
      return {
        slide: 0,
        sliding: null
      }
    },
    methods: {
      onSlideStart(slide) {
        this.sliding = true
      },
      onSlideEnd(slide) {
        this.sliding = false
      }
    }
  }
</script>
 
