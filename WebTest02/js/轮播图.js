var a = 1;
function change(){
	a++;
	if(a==5){
		a=1;
	}
	tupian.src = "img/"+a+".jpg";
}
//页面加载完毕之后就启动定时器
setInterval(change,1000);