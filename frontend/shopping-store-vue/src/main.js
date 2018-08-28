import Vue from 'vue'
import App from './App.vue'
import Buefy from 'buefy'
import VueRouter from 'vue-router'

import 'buefy/lib/buefy.css'

Vue.config.productionTip = false
Vue.use(Buefy)
Vue.use(VueRouter)
new Vue({
  render: h => h(App)
}).$mount('#app')
