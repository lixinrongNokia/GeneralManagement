/*公共js*/
var arrayMsg=['无效输入','你打不到我的，嘿嘿','有些事不能做，有些事不能说','用你的腊肠来实验一下我新发明的威力','你的心脏熄火了'];
/*弹出正确消息*/
function toast(msg) {
	layer.msg(msg, {
		offset : '15px',
		icon : 1,
		time : 2000
	}, function() {
	});
}
/*弹出错误消息*/
function toastErr(msg) {
	layer.msg(msg, {
		offset : '15px',
		icon : 5,
		time : 2000
	}, function() {
	});
}
/* 弹出成功消息并跳转 */
function toastANDRedirect(msg, url) {
	layer.msg(msg, {
		offset : '15px',
		icon : 1,
		time : 1000
	}, function() {
		location.href = url;
	});
}
/* 弹出错误消息关闭所有页面重新登录 */
function toastErrorANDRedirect(msg, url) {
	layer.msg(msg, {
		offset : '15px',
		icon : 5,
		time : 2000
	}, function() {
		window.top.location.href = url;
	});
}
/* 弹出正确消息关闭所有页面重新登录 */
function toastSuccessMsgANDRelonin(msg, url) {
	layer.msg(msg, {
		offset : '15px',
		icon : 1,
		time : 2000
	}, function() {
		window.top.location.href = url;
	});
}
/* 格式化时间yyyy-MM-dd HH:mm:ss */
function formatTime(datetime, fmt) {
	if (datetime == null || datetime == 0) {
		return "";
	}
	if (parseInt(datetime) == datetime) {
		if (datetime.length == 10) {
			datetime = parseInt(datetime) * 1000;
		} else if (datetime.length == 13) {
			datetime = parseInt(datetime);
		}
	}
	datetime = new Date(datetime);
	var o = {
		"M+" : datetime.getMonth() + 1, // 月份
		"d+" : datetime.getDate(), // 日
		"h+" : datetime.getHours(), // 小时
		"m+" : datetime.getMinutes(), // 分
		"s+" : datetime.getSeconds(), // 秒
		"q+" : Math.floor((datetime.getMonth() + 3) / 3),
		"S" : datetime.getMilliseconds()
	// 毫秒
	};
	if (/(y+)/.test(fmt)) {
		fmt = fmt.replace(RegExp.$1, (datetime.getFullYear() + "")
				.substr(4 - RegExp.$1.length));
	}
	for ( var k in o) {
		if (new RegExp("(" + k + ")").test(fmt)) {
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
					: (("00" + o[k]).substr(("" + o[k]).length)));
		}
	}
	return fmt;
}
/* 校验手机号 */
function checkPhone(phone) {
	return /^1\d{10}$/.test(phone);
}
/* 校验邮箱 */
function checkEmail(email) {
	return /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/
			.test(email);
}
/*随机数*/
function randomIndex(n,m){
    var c = m-n+1;  
    return Math.floor(Math.random() * c + n);
}
/*取Cookie*/
function getCookie(NameOfCookie) {
	if (document.cookie.length > 0) {
		begin = document.cookie.indexOf(NameOfCookie + "=");
		if (begin !== -1) {
			begin += NameOfCookie.length + 1;
			end = document.cookie.indexOf(";", begin);
			if (end === -1)
				end = document.cookie.length;
			return unescape(document.cookie.substring(begin, end));
		}
	}
	return null;
}