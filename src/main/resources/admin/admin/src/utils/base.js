const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootu6123/",
            name: "springbootu6123",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootu6123/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中小企业设备管理系统"
        } 
    }
}
export default base
