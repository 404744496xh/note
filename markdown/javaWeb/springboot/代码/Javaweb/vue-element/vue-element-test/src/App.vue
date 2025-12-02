<template>
  <div>
    <!-- <h1>{{ message  }}</h1>
    <element-test></element-test> -->
    <element-view-0></element-view-0>
  </div>
</template>

<script>
import ElementView0 from './views/ElementView0.vue'

export default {
  components: {ElementView0 },
  data(){
    return {
      message: 'Hello World'
    }
  }
}
</script>
  
<style>

</style>
