/**
 * 项目JS主入口 以依赖layui的layer和form模块为例
 */
layui.define([ 'layer', 'form' ], function(exports) {
	var $ = layui.$, layer = layui.layer, form = layui.form;
	form.on('submit(LAY-user-login-submit)', function(obj) {
		obj.field.password = hex_md5(obj.field.password);
		$.ajax({
			url : webRoot + '/user/checklogin',
			data : obj.field,
			dataType : 'json',
			success : function(res) {
				if (res.result_code && res.return_code) {
					if (res.result_code && res.return_code) {
						toastANDRedirect('登录成功', webRoot + '/sys/home');
					} else {
						layer.msg(res.msg);
					}
				}
			}
		});

	});
	
	form.on('checkbox(remember)', function(data){
    	$('#remember').val(data.elem.checked);
    });

	exports('login', {});
});

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