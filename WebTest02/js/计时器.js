//定义一个定时器
var timer;
//启动事件
function start(){
	timer = setInterval(run,1000);
}
var a = 0;//秒
var b = 0;//分
var c = 0;
var d = 0;
//时钟运行事件
function run(){
	a++;
	if(a==60){
		b++;
		a=0;
		if(b==60){
			c++;
			b=0;
			if(c==24){
				d++;
				c=0;
			}
		}
	}
	time.innerHTML =d+"天"+c+"时"+b+"分"+a+"秒"; 
	
}

//暂停事件
function stop(){
	clearInterval(timer);
}
//重置
function reset(){
	clearInterval(timer);
	a=0;b=0;c=0;d=0;
	time.innerHTML =d+"天"+c+"时"+b+"分"+a+"秒";
}