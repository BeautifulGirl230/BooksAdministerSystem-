<template>
  <div class="hello">
      <router-view v-if="this.reload"></router-view>
  </div>
</template>

<script>
  export default {
    provide(){                              //=>父组件中通过provide来提供变量，在子组件中通过inject来注入变量。
      return{
        reload: this.reload,                //=>在其它组件通过inject来映入reload里的方法
      }
    },
    data(){
      return{
        isRouterAlive: true,               //=>控制视图是否显示的变量
      }
    },
    methods:{
      /*刷新页面*/
      reload(){
        this.isRouterAlive = false;       //=>先关闭
        this.$nextTick(function (res){
          this.isRouterAlive = true;      //=>在打开
        })
      }
    },
  }
</script>

<style>
  @import "./assets/css/main.css";
  @import "./assets/css/color-dark.css";     /*深色主题*/
  /*@import "./assets/css/theme-green/color-green.css";   浅绿色主题*/

  /*  设置滚动条  */
  /*.hello{*/
  /*  overflow-x: scroll;*/
  /*  white-space: nowrap;*/
  /*}*/

  /*  隐藏滚动条  */
  ::-webkit-scrollbar {
    width: 0 !important;
  }
  ::-webkit-scrollbar {
    width: 0 !important;height: 0;
  }
</style>
