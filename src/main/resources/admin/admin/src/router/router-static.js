import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuangong from '@/views/modules/yuangong/list'
    import shebeigoumai from '@/views/modules/shebeigoumai/list'
    import shouhoujianxiu from '@/views/modules/shouhoujianxiu/list'
    import shebeidianjian from '@/views/modules/shebeidianjian/list'
    import shebeibaoxiu from '@/views/modules/shebeibaoxiu/list'
    import shebeixinxi from '@/views/modules/shebeixinxi/list'
    import shebeirunhua from '@/views/modules/shebeirunhua/list'
    import peijiangoumai from '@/views/modules/peijiangoumai/list'
    import peijianxinxi from '@/views/modules/peijianxinxi/list'
    import shouhoubaoyang from '@/views/modules/shouhoubaoyang/list'
    import shebeileixing from '@/views/modules/shebeileixing/list'
    import shiwubaojing from '@/views/modules/shiwubaojing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shebeigaizao from '@/views/modules/shebeigaizao/list'
    import shebeianzhuang from '@/views/modules/shebeianzhuang/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/shebeigoumai',
        name: '设备购买',
        component: shebeigoumai
      }
      ,{
	path: '/shouhoujianxiu',
        name: '售后检修',
        component: shouhoujianxiu
      }
      ,{
	path: '/shebeidianjian',
        name: '设备点检',
        component: shebeidianjian
      }
      ,{
	path: '/shebeibaoxiu',
        name: '设备报修',
        component: shebeibaoxiu
      }
      ,{
	path: '/shebeixinxi',
        name: '设备信息',
        component: shebeixinxi
      }
      ,{
	path: '/shebeirunhua',
        name: '设备润滑',
        component: shebeirunhua
      }
      ,{
	path: '/peijiangoumai',
        name: '配件购买',
        component: peijiangoumai
      }
      ,{
	path: '/peijianxinxi',
        name: '配件信息',
        component: peijianxinxi
      }
      ,{
	path: '/shouhoubaoyang',
        name: '售后保养',
        component: shouhoubaoyang
      }
      ,{
	path: '/shebeileixing',
        name: '设备类型',
        component: shebeileixing
      }
      ,{
	path: '/shiwubaojing',
        name: '事务报警',
        component: shiwubaojing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shebeigaizao',
        name: '设备改造',
        component: shebeigaizao
      }
      ,{
	path: '/shebeianzhuang',
        name: '设备安装',
        component: shebeianzhuang
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
