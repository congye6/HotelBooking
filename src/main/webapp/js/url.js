/**
 * restful风格url
 * @param parameters
 * @returns {String}
 */
function getUrl(parameters){
    var url="";
    $.each(parameters,function(i,parameter){
	url=url+parameter+"/";
    });
    return url;
}