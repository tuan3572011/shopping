<template>
  <div class="product" v-on:click="viewDetail">
    <img :src="product.thumbnail">
    <ProductBrief :description="product.description" :discountPrice="product.discountPrice" :regularPrice="product.regularPrice"></ProductBrief>
  </div>
</template>

<script>
import ProductBrief from "./ProductBrief";
export default {
  components: {
    ProductBrief
  },
  props: ["product"],
  methods:{
    viewDetail: function(){
      alert(this.product.description);
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.product {
  position: relative;
  width: 18%;
  height: 27%;
  padding: 1px;
  display: inline-block;
  border-radius: 5px;
  margin: 7px;
  -webkit-box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
  -moz-box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
}

.product:hover{
  cursor: pointer;
  /* border: 0px solid #dad7d7; */
  box-shadow: inset 0 0 0 1px #3a7999;
  border-radius: 0px;
}

.promotion {
  position: relative;
  height: 30px;
  margin-left: -9%;
  margin-top: -10%;
  margin-right: -9%;
}

.promotion img {
  width: 30px;
  height: 30px;
}

.price {
  position: relative;
  height: 30px;
  background-color: coral;
}

.price div {
  width: 50%;
}

.origin-price {
  position: absolute;
  bottom: 0;
  left: 0;
  text-align: left;
  height: 100%;
  padding-top: 5px;
  padding-left: 5px;
}

.discount-price {
  position: absolute;
  bottom: 0;
  right: 0;
  text-align: right;
  height: 100%;
  padding-top: 5px;
  padding-right: 5px;
}

.trend {
  position: absolute;
  top: 0;
  left: 0;
}

.discount-percentage {
  position: absolute;
  top: 0;
  right: 0;
}

.image-panel {
  width: 100%;
  height: calc(100% - 30px);
  background: transparent;
  margin-bottom: 0 !important;
}

.product img {
  -webkit-border-radius: 4px;
  -moz-border-radius: 4px;
  border-radius: 4px;
  display: block;
  margin: 0 auto 0.4em;
}
img {
  max-width: 100%;
}
</style>
