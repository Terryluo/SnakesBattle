<template>
  <div>
    <div>Name: {{ snake_name }}</div>
    <div>rating: {{ snake_rating }}</div>
  </div>
</template>

<script>
import $ from 'jquery';
import { ref } from 'vue';

export default {
  name: "App",
  setup: () => {
    let snake_name = ref("");
    let snake_rating = ref("");

    $.ajax({
      url: "http://localhost:8080/matches/getsnakeinfo/",
      type: "get",
      success: resp => {
        snake_name.value = resp.name;
        snake_rating.value = resp.rating;
      }
    });

    return {
      snake_name,
      snake_rating
    };
  }
}
</script>

<style>
body {
  background-image: url("@/assets/Background.jpeg");
  background-size: cover;
}
</style>
