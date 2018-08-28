<template>
<article class="content">
          <Product v-for="index in 100" :key="index" :product="product"></Product>
    </article>
</template>

<script>
import Product from "./Product.vue";
export default {
  components: {
    Product
  },
  data: function() {
    return {
      product: {
        thumbnail: require("../assets/img/f-watson.jpg"),
        description: "This product data is collected from Lazada, Tiki, Shopee and Sendo",
        discountPrice: 32000,
        regularPrice: 40000
      }
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.content:not(.custom) {
    margin: 0 auto;
    padding: 2rem 2.5rem;
    padding-top: 3.9rem;
}
</style>
