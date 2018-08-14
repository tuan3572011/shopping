<template>
<ul class="uib-dropdown-menu megamenu row dropdown-menu" ng-class="{'megamenu-visible': menuExchanges==true}" ng-mouseover="menuExchanges=true" ng-mouseleave="menuExchanges=false">
   <li class="columns">
      <div class="column">
         <div class="menu-column border-left">
            <h4>Analysis</h4>
            <div>
               <ul>
                  <li><a href="/exchanges/#/overview">Overview</a></li>
                  <li><a href="/exchanges/#/crypto">Crypto Exchanges</a></li>
                  <li><a href="/exchanges/#/btc-and-ltc">BTC and LTC</a></li>
                  <li><a href="/exchanges/#/btc">BTC Only</a></li>
                  <li><a href="/exchanges/#/popular">Popular</a></li>
               </ul>
            </div>
         </div>
      </div>
      <div class="column">
         <div class="menu-column">
            <h4>By Rating</h4>
            <div>
               <ul>
                  <li><a href="/exchanges/ethfinex/reviews"><span class="menu-stars">3.8 <i class="fa fa-star"></i></span> Ethfinex</a></li>
                  <li><a href="/exchanges/cryptobulls/reviews"><span class="menu-stars">3.8 <i class="fa fa-star"></i></span> Cryptobulls</a></li>
                  <li><a href="/exchanges/binance/reviews"><span class="menu-stars">3.4 <i class="fa fa-star"></i></span> Binance</a></li>
                  <li><a href="/exchanges/latoken/reviews"><span class="menu-stars">3.4 <i class="fa fa-star"></i></span> LATOKEN</a></li>
                  <li><a href="/exchanges/abcc/reviews"><span class="menu-stars">3.4 <i class="fa fa-star"></i></span> ABCC</a></li>
               </ul>
            </div>
         </div>
      </div>
      <div class="column">
         <div class="menu-column">
            <h4>By Coins Traded</h4>
            <div>
               <ul>
                  <li><a href="/exchanges/ccex/overview"><span class="menu-pairs">408 Pairs</span>CCEX</a></li>
                  <li><a href="/exchanges/bittrex/overview"><span class="menu-pairs">284 Pairs</span>Bittrex</a></li>
                  <li><a href="/exchanges/cryptopia/overview"><span class="menu-pairs">222 Pairs</span>Cryptopia</a></li>
                  <li><a href="/exchanges/poloniex/overview"><span class="menu-pairs">165 Pairs</span>Poloniex</a></li>
                  <li><a href="/exchanges/bter/overview"><span class="menu-pairs">147 Pairs</span>BTER</a></li>
               </ul>
            </div>
         </div>
      </div>
      <div class="column">
         <div class="menu-column border-no guide-featured">
            <a href="/forum/guides/">
               <h4>Guides</h4>
            </a>
            <div>
               <ul>
                  <li class=""><a href="/exchanges/guides/dextop-how-to-buy-and-sell-ethereum/">DEx.top: How to buy and sell Ethereum</a></li>
                  <li class=""><a href="/exchanges/guides/magnr-review/">Magnr Review</a></li>
                  <li class=""><a href="/exchanges/guides/how-to-use-cexio-to-buy-sell-bitcoins-ethereum-from-your-bank-card/">How to Use CEX.io to Buy &amp; Sell Bitcoins &amp; Ethereum from your Bank Card</a></li>
                  <li class=""><a href="/exchanges/guides/what-is-bitcoin-transaction-malleability-mt-gox/">What is Bitcoin Transaction malleability – MT GOX?</a></li>
                  <li class="view-more-menu-link"><a href="/exchanges/guides/">View all exchange guides ...</a></li>
               </ul>
            </div>
         </div>
      </div>
   </li>
</ul>


</template>

<script>
export default {
  props: ["menu"],
  data: function() {
    return {
      isExpand: false
    };
  },
  methods: {
    showDetail: function() {
      this.isExpand = true;
    },
    hideDetail: function() {
      this.isExpand = false;
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.megamenu {
  position: absolute;
  background: #fff;
  right: 15px;
  left: 50%;
  bottom: 0;
  padding: 0px 0px;
  overflow: hidden;
  height: 215px;
  border: 0;
  border-top-color: currentcolor;
  border-top-style: none;
  border-top-width: 0px;
  border-bottom-color: currentcolor;
  border-bottom-style: none;
  border-bottom-width: 0px;
  border-bottom: 1px solid #ccc;
  border-top: 3px solid #3a5c86;
}

.dropdown-menu {
  position: absolute;
  top: 100%;
  z-index: 1000;
  display: block;
  float: left;
  min-width: 160px;
  padding: 5px 0;
  margin: 2px 0 0;
  font-size: 14px;
  text-align: left;
  list-style: none;
  background-color: #fff;
  -webkit-background-clip: padding-box;
  background-clip: padding-box;
  border: 1px solid #ccc;
  border: 1px solid rgba(0, 0, 0, 0.15);
  border-radius: 4px;
  -webkit-box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);
  box-shadow: 0 6px 12px rgba(0, 0, 0, 0.175);
}
.row {
  margin-right: -15px;
  margin-left: -15px;
}
ul ul,
ol ul,
ul ol,
ol ol {
  margin-bottom: 0;
}
ul,
ol {
  margin-top: 0;
  margin-bottom: 10px;
}
* {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
</style>
