<template>
  <div class="product-brief">
    <div class="description">
      THis product's price is collected from many websites such as LAZADA, SHOPEE, TIKI
      </div>
    <div class="price">
      <div class="discount-price">480,000</div>
      <div class="origin-price">320,000</div>
  </div>
  </div>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.product-brief {
  background-color: #e1d2cc;
}

.description {
  line-height: 1.5em;
  height: 3em;
  overflow: hidden;
  white-space: initial;
  text-overflow: ellipsis;
  width: 100%;
  text-align: left;
  padding: 5px;
}
.price {
  position: relative;
  height: 30px;
}

.price div {
  width: 50%;
  line-height: 18px;
  vertical-align: middle;
}

.origin-price {
  position: absolute;
  bottom: 0;
  left: 0;
  text-align: left;
  height: 100%;
  padding-top: 5px;
  padding-left: 5px;
  color: #f57224;
  font-size: 20px;
}

.discount-price {
  position: absolute;
  bottom: 0;
  right: 0;
  text-align: right;
  height: 100%;
  padding-top: 5px;
  padding-right: 5px;
  font-size: 17px;
  color: #a2a2a2;
  text-decoration: line-through;
  font-weight: 300;
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
