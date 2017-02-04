/**
 * 将data数据填充到table中
 * @param data
 * @param attrs data的属性名数组
 * @param idName table的id
 */
function setTableContent(data,attrs,idName){
    //删除表中原有的内容
    $("table#"+idName+" tr#auto").remove();
    //遍历数组
    $.each(data,function(i,vo){
		
	htm="<tr id='auto'>";
	//遍历属性
	$.each(attrs,function(i,attr){
	    htm+="<td>"+vo[attr]+"</td>";
	});
	htm+="</tr>";
		
	$("table#"+idName).append(htm);
     });
}