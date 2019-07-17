layui.define([ 'form','element' ], function(exports) {
	var $ = layui.$, form = layui.form,element = layui.element;
	form.on('checkbox(checkedListener)', function(data){
		let topInput=$(this).parent().find('legend>input')[0];
		if(topInput){
			let array=$(this).parent().find('>input');
			if(data.elem.checked){
				if(!topInput.checked){
					$(topInput).prop("checked", true);
				}
			}else{
				let hasCheck=false;
				$.each(array,function(i,item){
					if(item.checked){
						hasCheck=true;
						return false;
					}
				});
				if(!hasCheck){
					$(topInput).prop("checked", false);
				}
			}
		}else{
			let array=$(this).parent().parent().find('>input');
			if(!data.elem.checked){
				$.each(array,function(i,item){
					$(item).prop("checked", false);
				});
			}else{
				$.each(array,function(i,item){
					$(item).prop("checked", true);
				});
			}
		}
		form.render();
	});
	exports('roleform', {});
});