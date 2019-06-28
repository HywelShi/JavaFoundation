var timer;//定义定时器 但是先不让它工作
//定义启动事件 控制定时器启动
function start(){
	//设置定时器 定时控制的事件 时间间隔单位是毫秒
	//1s=1000ms
	timer = setInterval(run,100);
}
//定义一个滚动事件 由定时器来控制
function run(){
	//JS产生a-b之间的随机整数公式parseInt(Math.random()*(b-a+1)+a)
	//随机产生一个1-36的整数//将这个整数插入到小球当中
	var li1  = parseInt(Math.random()*36+1);
	li01.innerHTML = li1;//innerHTML作用是往li里面插入
}
//定义停止事件 关闭定时器
function stop(){
	//清除定时器即关闭
	clearInterval(timer);
}