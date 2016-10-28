<!DOCTYPE html>
<html>
<#assign ctx=request.contextPath />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit">
<title>dubbo-consumer</title>
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="http://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script>
<script src="${ctx}/js/public.js"></script>
<style type="text/css">
	
</style>
    
</head>
<body class="index">
<h1 style="color:red;">dubbo consumer test</h1>
<div class="submitBtns pull-left" style="margin-top:30px;">
	path: <p>"${ctx}"</p>
	
	${springMacroRequestContext.contextPath}
	<input id="name" type="text" placeholder="请输入" maxlength="16">
	<button type="button" class="btn btn-primary" onclick="test('customer')">提交</button>
    
</div>


<script type="text/javascript">

	function test(path){
		load("/?name="+$('#name').val());
	}
	
	
	
</script>
</body>
</html>
