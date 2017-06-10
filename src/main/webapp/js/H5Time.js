$(function() {
	//转化h5 datetime-local 标签内容为标准Date
	//限定条件 结果为"2017-05-03T23:00"类型时
	function datetimelocalParseDate(obj) {
		var time = obj.replace("T"," ");
		var date = new Date(time);
		return date;
	}//end
})