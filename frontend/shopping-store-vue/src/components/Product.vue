<template>
  <div class="product">
    <img :src="thumbnail">
    <div class="box image-panel">
      <div class="promotion">
        <img alt="Hot" class="trend">
        <img alt="30%" class="discount-percentage">
      </div>
    </div>
    <div class="price">
      <div class="origin-price">480,000</div>
      <div class="discount-price">320,000</div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["thumbnail"],
  data: function() {
    return {
      isExpand: false
    };
  },
  methods: {
    showSubMenu: function() {
      this.isExpand = true;
    },
    hideSubMenu: function() {
      this.isExpand = false;
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.product {
  position: relative;
  width: 27%;
  height: 27%;
  padding: 5px;
  display: inline-block;
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
  -webkit-box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
  -moz-box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.5);
  display: block;
  margin: 0 auto 1em;
}
img {
  max-width: 100%;
}
</style>
