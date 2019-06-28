function add(btn){
	//通过按钮来访问td
	var td = btn.parentNode;
	//通过td访问tr
	var tr = td.parentNode;
	//var tr = btn.parentNode.parentNode;
	//通过tr访问所有的td 会产生一个数组
	//获取tr下所有叫td的儿子
	var tds = tr.getElementsByTagName("td");
	//innerHTML不仅可以插入数据也可以获取数据
	var name = tds[0].innerHTML;
	var price = tds[1].innerHTML;
	var address = tds[2].innerHTML;
	//alert("名称："+name+"价格："+price+"产地："+address);
	//生成一个tr tr里面有 +=表示累加
	gwc.innerHTML += "<tr align='center'>"+
					"<td>"+name+"</td>"+
					"<td>"+price+"</td>"+
					"<td>"+address+"</td>"+
					"<td>"+
					"<button>-</button>"+
					"<input size='2' value='1'>"+
					"<button>+</button>"+
					"</td>"+
					"<td></td>"+
					"<td><button>移出购物车</button></td>"+
					"</tr>";