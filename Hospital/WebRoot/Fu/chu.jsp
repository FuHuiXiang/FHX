<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'chu.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"> 
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/bootstrap/css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/zTree_v3/css/demo.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/zTree_v3/css/zTreeStyle/zTreeStyle.css">

	<script src="${pageContext.request.contextPath}/resource/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resource/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resource/zTree_v3/js/jquery.ztree.all.min.js""></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  	

  <a id="showss" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" style="display: block; width: 200px; height: 50px; background-color: green;text-align: center;">处方划价</a>

	 <form class="form-horizontal" role="form" id="stockForm">
 
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
	<div class="modal-dialog" style="width: 1000px;">
		<div class="modal-content" style="height: 700px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					处方划价
				</h4>
			</div>
				
<div class="container" style="width: 600px; margin-left:260px; position: absolute;">
	         
	<table class="table">
		<thead>
			<tr>
				<th>名称</th>
  				<th>规格</th>
  				<th>单位</th>
  				<th>数量</th>
  				<th>单价</th>
 				<th>金额</th>
			</tr>
		</thead>
		<tbody id="a3">
			
		</tbody>
	</table>
	</div>
	
	<div class="modal-body" style="display: none;z-index: 0;width: 600px;height: 600px; background-color: gray;position: absolute; margin-left: 200px;margin-top: 0px; z-index: 100;"  id="selectkk" >
				<button type="button" class="close" data-dismiss="modal111111111111111" aria-hidden="true" id="aw">
					&times;
				</button>
    			<table class="table">
					<thead>
						<tr>
							<td>单据号</td>
					    	<td>日期</td>
					  		<td>病人姓名</td>
					  		<td>金额</td>
					  		<td>医生</td>
						</tr>
					</thead>
					<tbody id="selectkk1">
							
					</tbody>
				</table>
			</div>
		

			<div class="modal-footer" style="margin-top: 400px; margin-left: 0px; position: absolute; width: 1000px;" >
				<button type="button" class="btn btn-default" data-dismiss="modal" id="guanbi">关闭
				</button>
				<button type="button" class="btn btn-primary" value="呵呵" id="aaa6">
					确定划价
				</button>
			</div>
			
			
			
		
		<div style="width: 350px; margin-left:0px; margin-top: 10px; display: block; position: absolute;">
  	
  	<div class="form-group">
    <label for="firstname" class="col-sm-2 control-label">名字</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="patientname" disabled="disabled" style="width: 200px;">
    </div>
  	</div>
  	
  	<div class="form-group" style="position: absolute; margin-left: 890px; top: 360px;">
    <div style="position: absolute; margin-left: -500px;"><font color="red" size="80">合计:</font></div>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="money" name="ch.chargeable" readonly="readonly" value="0" style="background-color:#ffffff; border: 0px;">
    </div>
  	</div>
  	
 	 <div class="form-group">
    	<label for="lastname" class="col-sm-2 control-label">年龄</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="age" disabled="disabled" style="width: 200px;">
    </div>
  </div>
  
   <div class="form-group">
    	<label for="lastname" class="col-sm-2 control-label">医生</label>
    <div class="col-sm-10">
      	<input type="text" class="form-control" id="stuffname" disabled="disabled" style="width: 200px;">
      	<input type="hidden" id="id" name="ch.patients.id"/>
      	<input type="hidden" id="sftid" name="ch.sftId" value="1"/>
  		<input type="hidden" id="chinesePrescribeId" name="pr.chinesePrescribeId"/>
    </div>
  </div>
  <div class="form-group">
    <label for="firstname" class="col-sm-2 control-label">日期</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="patientnamess" readonly="readonly" name="list.billingdate" style="width: 200px;">
    </div>
  	</div>
  <div class="form-group">
  	<label for="firstname" class="col-sm-2 control-label" style="width: 80px;">流水号</label>
    <div class="col-sm-offset-2 col-sm-10" >
    	<input type="text" class="form-control" id="yaoselect" placeholder="请输入患者流水号" style="margin-top: -25px; display: block; width: 200px;">
      <button type="button" data-target="#myModa" id="dian" class="btn btn-primary btn-lg" data-toggle="modal"  style="display: block; margin-left: 20px;">查询</button>
    </div>
  </div>
  
  
  
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="button"  id="dian" class="alls btn-primary btn-lg" data-toggle="modal" value="查cha" >再次查询</button>
    </div>
  </div>
  
</div>
		
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
	</div>
  
  
  
  
  
  <div class="modal fade" id="myModa" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="z-index: 1110">
	<div class="modal-dialog" style="width: 1000px;">
		<div class="modal-content" style="height: 500">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					所有患者信息
				</h4>
			</div>
			<div class="modal-body">
				<table class="table">
		<thead>
			<tr>
				<th>姓名</th>
				<th>年龄</th>
				<th>类型名称</th>
				<th>科室名称</th>
				<th>挂号时间</th>
			</tr>
		</thead>
		<tbody id="tbody">
			
		</tbody>
	</table>
				
			</div>
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
  </form>
  <!-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
  <a id="show1"  class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModalll" style="display: block; width: 200px; height: 50px; background-color: green;text-align: center;">处方发药</a>
  
  
  	<div class="modal fade" id="myModalll" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width: 1000px;">
		<div class="modal-content" style="height: 700px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel">
					<div class="col-sm-10">
     					 <input type="text" class="form-control" id="mohu" placeholder="请输入流水号">
    				</div>
				</h4>
			</div>
			<div class="modal-body">
				
    			<table class="table">
			<thead>
			<tr>
					<th>流水号</th>
	    			<th>姓名</th>
	    			<th>年龄</th>
	    			<th>医生</th>
	    			<th>类型名称</th>
	    			<th>科室名称</th>
			</tr>
		</thead>
		<tbody id="tbody11">
			
		</tbody>
	</table>
			</div>
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
	<!-- 模糊查询要显示的div -->
	<div class="modal-body" style="display: none;z-index: 0;width: 700px;height: 500px; background-color: gray;position: absolute; margin-left: 400px;margin-top: -650px;"  id="showww" >
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
    			<table class="table">
			<thead>
			<tr>
					<th style="width: 180px;">流水号</th>
	    			<th style="width: 180px;">姓名</th>
	    			<th style="width: 180px;">年龄</th>
	    			<th style="width: 180px;">医生</th>
	    			<th style="width: 180px; ">类型名称</th>
	    			<th style="width: 180px; ">科室名称</th>
			</tr>
		</thead>
		<tbody id="tbody1111">
			
		</tbody>
	</table>
			</div>
	
</div>


  	<div class="modal fade" id="myModalll22" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width: 800px;">
		<div class="modal-content" style="height: 700px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				
			</div>
			<div class="modal-body">
				
    			<table class="table">
			<thead>
			<tr>
				<td>序号</td>
    			<td>名称</td>
  				<td>规格</td>
  				<td>单位</td>
  				<td>数量</td>
  				<td>零售价</td>
 				<td>金额</td>
			</tr>
		</thead>
		<tbody id="tbody55">
			
		</tbody>
	</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭
				</button>
				<button type="button" id="tx" class="btn btn-default" data-dismiss="modal" aria-hidden="true">
					确认发药
				</button>
				
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>
  	
 <!-- ------------------------------------------------------------------------------------------------------------------------------------------- --> 		
  	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal22" id="chuid">
	药房发药查询
	</button>
    <div class="modal fade" id="myModal22" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width: 1000px;">
		<div class="modal-content" style="height: 600px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				
					
     					 <input type="text"  id="mohuselect" placeholder="请输入病人姓名" value="" style="width: 200px;">
     					 <input type="text"  id="dtime" name="dtime" placeholder="开始日期" style="width: 200px;">
     					 <input type="text"  id="dtime1" name="dtime1" placeholder="结束日期" style="width: 200px;">
     					 <button type="button"  data-toggle="button" id="dates">确认查询</button>
    				
				
			</div>
			<div class="modal-body">
				<table class="table">
					<thead>
						<tr>
							<td>单据号</td>
			    			<td>日期</td>
			  				<td>病人姓名</td>
			  				<td>金额</td>
			  				<td>医生</td>
						</tr>
					</thead>
					<tbody id="chuid1">
			
					</tbody>
				</table>
			</div>
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
	
	<div class="modal-body" style="display: none;z-index: 0;width: 1000px;height: 600px; background-color: #33ff33;position: absolute; margin-left: 200px;margin-top: -500px;"  id="selectmo" >
				<button type="button" class="close" data-dismiss="modal111111111111111" aria-hidden="true" id="aw1">
					&times;
				</button>
    			<table class="table">
					<thead>
						<tr>
							<td>单据号</td>
					    	<td>日期</td>
					  		<td>病人姓名</td>
					  		<td>金额</td>
					  		<td>医生</td>
						</tr>
					</thead>
					<tbody id="selectmo1">
			
					</tbody>
				</table>
			</div>
			
</div>		

<!-- ---------------------------------------------------------------------------------------------------------------------------------------------- -->
  	<a id="selectChuku" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal4" style="display: block; width: 200px; height: 50px; background-color: green;text-align: center;">药房药品管理</a>
    <div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="width: 1000px;">
		<div class="modal-content" style="height: 700px;">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				
					
     					 药房药品确认
    				
				
			</div>
			<div class="modal-body" style="width: 650px; height:300px; background-color: #888888;border: 2px solid #ffffff;">
				<table class="table">
					<thead>
						<tr>
							<td>单据号</td>
			    			<td>日期</td>
			  				<td>药房</td>
			  				<td>领药医生</td>
						</tr>
					</thead>
					<tbody id="selectChuku1">
						
					</tbody>
				</table>
			</div>
			
			<div class="modal-body" style="width: 347px; height:300px; background-color: #888888;border: 2px solid #ffffff; position: absolute; margin-top: -300px; margin-left: 650px;">
				<button type="button" class="btn btn-success" id="updateFangs">确认入库</button>
				<input type="hidden" id="h1" />
				
				
			</div>
			
			
			<div class="modal-body" style="width: 998px; height:345px; background-color: #888888;border: 2px solid #ffffff; position: absolute;">
				<table class="table">
					<thead>
						<tr>
							<td>拼音码</td>
			    			<td>名称</td>
			  				<td>规格</td>
			  				<td>单位</td>
			  				<td>数量</td>
			  				<td>零售价</td>
			  				<td>零售额</td>
			  				<td>产地</td>
						</tr>
					</thead>
					<tbody id="selectChuku2">
						
					</tbody>
				</table>
			</div>
			
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
	</div>
  </body>
  
  <script>
  	//获取电脑系统时间
  	$(function(){  
    	//设置时间  
　 	 	var date = new Date();     
		var dat = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
		var da = dat.toLocaleString();
 　	 	$("#patientnamess").val(da);
	});  
  
  	$("#hi").click(function(){
  		$("#showsss").css("display","none");
  	})
  
  	$("#showss").click(function(){
  		$("#showsss").css("display","block");
  	})
  	//查询全部未划价的患者信息
  	$("#dian").click(function(){
  	  var url="${pageContext.request.contextPath}/hospitalss_allPatients.action"
  	  $("#tbody").html("");
  		$.ajax({
  			url:url,
  			dataType:"json",
		    type:"post",
		    success:function(data){
		     	var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.age+"</td>";
		        		tr+="<td>"+obj.name+"</td>";
		        		tr+="<td>"+obj.officeName+"</td>";
		        		tr+="<td>"+conver(obj.presentTime.time)+"</td>";
		        		tr+="<td style='display: none;'>"+obj.id+"</td>";
		        		tr+="<td><a  data-toggle='modal' data-target='#myModa' id="+obj.id+" class='update btn btn-default' style='display: block; width: 970px; height: 40px; background-color: green;text-align: center; margin-left: -530px;'><a>";
		        		tr+="</tr>";
		        		$("#a1").css("display","block");
		        		$("#tbody").append(tr);
		       	}
		    }
  		})
  	
  	})
  	
  	 function conver(time1){
              var date1 = new Date();
              date1.setTime(time1);
              var y = date1.getFullYear();
              var m = date1.getMonth()+1;
              m = m<10?'0'+m:m;
              var d = date1.getDate();
              var str=y+"-"+m+"-"+d;
              d = d<10?("0"+d):d;
              return str;
	      } 
  	
  	$("#qu").click(function(){
  			$("#tbody").html("");
  			$("#a1").css("display","none");
  	})
  	//通过id确认一个未划价的患者信息
  	
			//动态绑定单击事件
			$("#tbody").on("click",".update",function(){
				var id=this.id;
				$("#tbody").html("");
				$.ajax({
			        url:"${pageContext.request.contextPath}/hospitalss_selects.action",
			        data:{
			        	"pa.id":id,
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){
			        	$("#id").val(data.id);
			        	$("#chinesePrescribeId").val(data.chinesePrescribeId);
			        	$("#patientname").val(data.patientname);
			        	$("#stuffname").val(data.stuffname)
			        	$("#age").val(data.age);
			        	$(".alls").val(data.chinesePrescribeId);
			        	$("#aaa6").val(data.chinesePrescribeId);
			        	$("#money").val(data.money);	
			        	$("#a1").css("display","none");
			        }
		      })
			})
		
		//查询该患者药品
		$(".alls").click(function(){
		var i=0;
		$("#a3").html("");
  	  	var url="${pageContext.request.contextPath}/hospitalss_allselect.action"
  	  	var chinesePrescribeId=this.value;
  		$.ajax({
  			url:url,
  			data:{
  				"pr.chinesePrescribeId":chinesePrescribeId,
  			},
  			dataType:"json",
		    type:"post",
		    success:function(data){
		     	var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td><input type='text' style='border:none; width: 100px;' value='"+obj.lname+"' name='list["+i+"].fessName'/></td>";

		        		tr+="<td><input type='text' style='border:none; width: 100px;' value='"+obj.gg+"' '/></td>";
		        		
		        		tr+="<td><input type='text' style='border:none; width: 100px;' value='"+obj.dw+"' '/></td>";
		        		
		        		tr+="<td><input type='text' style='border:none; width: 100px;' value='"+obj.sl+"' name='list["+i+"].fessNum'/></td>";
		        		
		        		tr+="<td><input type='text' style='border:none; width: 100px;' value='"+obj.dj+"' /></td>";
		        		
		        		tr+="<td><input type='text' style='border:none; width: 100px;' value='"+obj.je+"' name='list["+i+"].tollSum'/></td>";
		        		$("#a3").append(tr);
		        		
		       	}
		       	
		    }
  		})
  	
  	})
  	//修改状态
  	$("#aaa6").click(function(){
  				/* */
  	  	var url="${pageContext.request.contextPath}/hospitalss_updates.action"
  	  	//var chinesePrescribeId=this.value;
  		$.ajax({
  			url:url,
  			data:$("#stockForm").serialize(),
  			dataType:"json",
		    type:"post",
		    success:function(data){
		     	$("#showsss").css("display","none");
				$("#a3").html("");
		     	$("#id").val("");
			    $("#chinesePrescribeId").val("");
			    $("#patientname").val("");
			    $("#stuffname").val("");
			    $("#age").val("");
		    }
  		})
  	})
  	//查询已划价全部信息
  	$("#show1").click(function(){
  		$("#tbody11").html("");
  		$("#show2").css("display","block");
  	  var url="${pageContext.request.contextPath}/hospitalss_selectPrescribe.action"
  		$.ajax({
  			url:url,
  			dataType:"json",
		    type:"post",
		    success:function(data){
		     	var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.serialNumber+"</td>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.age+"</td>";
		        		tr+="<td>"+obj.officeName+"</td>";
		        		tr+="<td>"+obj.name+"</td>";
		        		tr+="<td>"+obj.officeName+"</td>";
		        		tr+="<td style='display: none;'>"+obj.chinesePrescribeId+"</td>";
		        		tr+="<td><a data-toggle='modal' data-target='#myModalll22' id="+obj.chinesePrescribeId+" class='selects btn btn-default' style='display: block; width: 970px; height: 40px; background-color: green;text-align: center; margin-left: -550px;'><a>";
		        		tr+="</tr>";
		        		$("#tbody11").append(tr);
		       	}
		    }
  		})
  	
  	})
  	//通过处方id查询药品
  	
			//动态绑定单击事件
			$("#tbody11").on("click",".selects",function(){
				$("#tbody55").html("");
				var chinesePrescribeId=this.id;
				$("#tx").val(chinesePrescribeId);
				$("#show10").css("display","block");
				$.ajax({
			        url:"${pageContext.request.contextPath}/hospitalss_selectLop.action",
			        data:{
			        	  "pr.chinesePrescribeId":chinesePrescribeId,
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){
			        var ary=data;
			        for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.lid+"</td>";
		        		tr+="<td>"+obj.lname+"</td>";
		        		tr+="<td>"+obj.gg+"</td>";
		        		tr+="<td>"+obj.dw+"</td>";
		        		tr+="<td>"+obj.sl+"</td>";
		        		tr+="<td>"+obj.dj+"</td>";
		        		tr+="<td>"+obj.je+"</td>";
		        		tr+="</tr>";
		        		$("#tbody55").append(tr);
		       			}
			        }
		      })
			})
		
		//模糊查询该患者药品
	$("#mohu").keyup(function(){
  			$("#showww").css("display","block");
  			$("#tbody1111").html("");
  			if($("#mohu").val()==""){
  				$("#showww").css("display","none");
  			}
  	 		 var url="${pageContext.request.contextPath}/hospitalss_mselect.action"
  	 		 var serialNumber=this.value;
  	$.ajax({
	  			url:url,
	  			data:{
	  				"cl.serialNumber":serialNumber,
	  			},
	  			dataType:"json",
			    type:"post",
			    success:function(data){
		     	var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.serialNumber+"</td>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.age+"</td>";
		        		tr+="<td>"+obj.officeName+"</td>";
		        		tr+="<td style=''>"+obj.name+"</td>";
		        		tr+="<td>"+obj.officeName+"</td>";
		        		tr+="<td  style='display: none;'>"+obj.chinesePrescribeId+"</td>";
		        		tr+="<td><a data-toggle='modal' data-target='#myModalll22' id="+obj.chinesePrescribeId+" class='selects btn btn-default' style='display: block; width: 670px; height: 40px; background-color: green;text-align: center; margin-left: -540px;'><a>";
		        		tr+="</tr>";
		        		$("#tbody1111").append(tr);
		        		//$("#tbody").html(tr);
		       	}
		    }
  		})
  	
  	})
  	//通过处方id查询药品
  	
			//动态绑定单击事件
			$("#tbody1111").on("click",".selects",function(){
				$("#showww").css("display","none");
				var chinesePrescribeId=this.id;
				$("#tx").val(chinesePrescribeId);
				$("#show10").css("display","block");
				$("#tbody55").html("");
				$.ajax({
			        url:"${pageContext.request.contextPath}/hospitalss_selectLop.action",
			        data:{
			        	  "lo.prescribe.chinesePrescribeId":chinesePrescribeId,
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){
			        var ary=data;
			        for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.lid+"</td>";
		        		tr+="<td>"+obj.lname+"</td>";
		        		tr+="<td>"+obj.gg+"</td>";
		        		tr+="<td>"+obj.dw+"</td>";
		        		tr+="<td>"+obj.sl+"</td>";
		        		tr+="<td>"+obj.dj+"</td>";
		        		tr+="<td>"+obj.je+"</td>";
		        		tr+="</tr>";
		        		$("#tbody55").append(tr);
		       			}	
			        }
		      })
			})
		
		
		//修改状态
		$("#tx").click(function(){
		
  	  	var url="${pageContext.request.contextPath}/hospitalss_fangUpdate.action"
  	  	var chinesePrescribeId=this.value;
  		$.ajax({
  			url:url,
  			data:{
  				"pr.chinesePrescribeId":chinesePrescribeId,
  				},
  			dataType:"json",
		    type:"post",
		    success:function(data){
		     	
		    }
		    
  		})
  		$("#show1").click();
  	})
  	//发药查询
  	$("#chuid").click(function(){
  		$("#chuid1").html("");
  		$.ajax({
  			url:"${pageContext.request.contextPath}/hospitalss_chuselect.action",
  			dataType:"json",
  			type:"post",
  			success:function(data){
  				 var ary=data;
			     for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.serialNumber+"</td>";
		        		tr+="<td>"+conver(obj.presentTime.time)+"</td>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.money+"</td>";
		        		tr+="<td>"+obj.stuffname+"</td>";
		        		tr+="</tr>";
		        		$("#chuid1").append(tr);
		       	}	
  			}
  		})
  	})
  	
  	function conver(time1){
              var date1 = new Date();
              date1.setTime(time1);
              var y = date1.getFullYear();
              var m = date1.getMonth()+1;
              m = m<10?'0'+m:m;
              var d = date1.getDate();
              var str=y+"-"+m+"-"+d;
              d = d<10?("0"+d):d;
              return str;
	      }
  	//发药模糊查询
  	$("#mohuselect").keyup(function(){
  			$("#selectmo1").html("");
  			if($("#mohuselect").val()==""){
  				$("#selectmo").css("display","none");
  			}
  	 		 var url="${pageContext.request.contextPath}/hospitalss_mohuselect.action"
  	 		 var patientname=this.value;
  		$.ajax({
	  			url:url,
	  			data:{
	  				"pa.patientname":patientname,
	  			},
	  			dataType:"json",
			    type:"post",
			    success:function(data){
		     		var ary=data;
		     		for(var i=0;i<ary.length;i++){
		     			$("#selectmo").css("display","block");
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.serialNumber+"</td>";
		        		tr+="<td>"+conver(obj.presentTime.time)+"</td>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.money+"</td>";
		        		tr+="<td>"+obj.stuffname+"</td>";
		        		tr+="</tr>";
		        		$("#selectmo1").append(tr);
		       	}
		    }
  		})
  	})
  	$("#aw1").click(function(){
  		$("#selectmo").css("display","none");
  		$("#selectmo1").html("");
  	})
	//模糊查询状态为1的所有信息
  	$("#yaoselect").keyup(function(){
  	 	 var url="${pageContext.request.contextPath}/hospitalss_yaoselect.action"
  	  	 var serialNumber=this.value;
  	     if($("#yaoselect").val()==""){
  				$("#selectkk").css("display","none");
  			}
  		$("#selectkk1").html("");
  		$.ajax({
  			url:url,
  			data:{
  				"cl.serialNumber":serialNumber,
  			},
  			dataType:"json",
		    type:"post",
		    success:function(data){
		     	var ary=data;
		     	for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.age+"</td>";
		        		tr+="<td>"+obj.name+"</td>";
		        		tr+="<td>"+obj.officeName+"</td>";
		        		tr+="<td>"+conver(obj.presentTime.time)+"</td>";
		        		tr+="<td  style='display: none'>"+obj.id+"</td>";
		        		tr+="<td><a  data-toggle='' data-target='' id="+obj.id+" class='update btn btn-default' style='display: block; width: 570px; height: 40px; background-color: green;text-align: center; margin-left: -405px;'><a>";
		        		tr+="</tr>";
		        		$("#selectkk").css("display","block");
		        		$("#selectkk1").append(tr);
		       	}
		    }
  		})
  	
  	})
  	$("#aw").click(function(){
  		$("#selectkk").css("display","none");
  		$("#selectkk1").html("");
  		$("#yaoselect").val("");
  		})
  		
  	$("#selectkk1").on("click",".update",function(){
				var id=this.id;
				$("#tbody").html("");
				$.ajax({
			        url:"${pageContext.request.contextPath}/hospitalss_selects.action",
			        data:{
			        	"pa.id":id,
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){
			        	$("#id").val(data.id);
			        	$("#chinesePrescribeId").val(data.chinesePrescribeId);
			        	$("#patientname").val(data.patientname);
			        	$("#stuffname").val(data.stuffname)
			        	$("#age").val(data.age);
			        	$(".alls").val(data.chinesePrescribeId);
			        	$("#aaa6").val(data.chinesePrescribeId);	
			        	$("#a1").css("display","none");
			        	$("#selectkk").css("display","none");
			        }
		      })
		})
			//点击关闭让里面的东西清空
		$("#guanbi").click(function(){
			$("#id").val("");
			$("#chinesePrescribeId").val("");
			$("#patientname").val("");
			$("#stuffname").val("")
			$("#age").val("");
			$(".alls").val("");
			$("#aaa6").val("");	
			$("#a1").css("display","none");
			$("#selectkk").css("display","none");
			$("#a3").html("");
			$("#yaoselect").val("");
		})
		//通过时间查询
		$("#dates").click(function(){
			var dtime=$("#dtime").val();
			var dtime1=$("#dtime1").val();
			$("#selectmo1").html("");
			$.ajax({
				url:"${pageContext.request.contextPath}/hospitalss_dateSelect.action",
				data:{
					"dtime":dtime,
					"dtime1":dtime1,
				},
				dataType:"json",
			    type:"post",
			    success:function(data){
		     		var ary=data;
		     		for(var i=0;i<ary.length;i++){
		     			$("#selectmo").css("display","block");
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.serialNumber+"</td>";
		        		tr+="<td>"+conver(obj.presentTime.time)+"</td>";
		        		tr+="<td>"+obj.patientname+"</td>";
		        		tr+="<td>"+obj.money+"</td>";
		        		tr+="<td>"+obj.stuffname+"</td>";
		        		tr+="</tr>";
		        		$("#selectmo1").append(tr);
		       		}
		    	}
			})
		})
		//查询出状态为1的全部信息
		$("#selectChuku").click(function(){
			$("#selectChuku1").html("");
			$.ajax({
				url:"${pageContext.request.contextPath}/hospitals_selectChuku.action",
				dataType:"json",
			    type:"post",
			    success:function(data){
		     		var ary=data;
		     		for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.ckmId+"</td>";
		        		tr+="<td>"+conver(obj.ckDate.time)+"</td>";
		        		tr+="<td>"+obj.phName+"</td>";
		        		tr+="<td>"+obj.stuffname+"</td>";
		        		tr+="<td><a  data-toggle='' data-target='' id="+obj.ckmId+" class='selectChuku btn btn-default' style='display: block; width: 620px; height: 40px; background-color: green;text-align: center; margin-left: -301px;'><a>";
		        		tr+="</tr>";
		        		$("#selectChuku1").append(tr);
		        		
		       		}
		    	}
			})
		})
		//通过药品出药房id查询出该状态的全部药品信息
		$(function(){
			//动态绑定单击事件
			$("#selectChuku1").on("click",".selectChuku",function(){
				var ckId=this.id;
				$("#selectChuku2").html("");
				$.ajax({
			        url:"${pageContext.request.contextPath}/hospitals_selectChukuming.action",
			        data:{
			        	  "ck.ckId":ckId,
			        },
			        dataType:"json",
			        type:"post",
			        success:function(data){
			        var ary=data;
			        for(var i=0;i<ary.length;i++){
		        		var obj=ary[i];//获取当前对象
		        		var tr="<tr>";
		        		tr+="<td>"+obj.zhuji+"</td>";
		        		tr+="<td>"+obj.dname+"</td>";
		        		tr+="<td>"+obj.spec+"</td>";
		        		tr+="<td>"+obj.duName+"</td>";
		        		tr+="<td>"+obj.num3+"</td>";
		        		tr+="<td>"+obj.retaiPrice+"</td>";
		        		tr+="<td>"+obj.totalPrice5+"</td>";
		        		tr+="<td>"+obj.aname+"</td>";
		        		tr+="</tr>";
		        		$("#selectChuku2").append(tr);
		        		$("#h1").val(obj.ckId);
		        		
		       			}	
			        }
		      })
			})
		})
		//修改库存和状态
		$("#updateFangs").click(function(){
			var cid=$("#h1").val();
			
			$.ajax({
				url:"${pageContext.request.contextPath}/hospitals_updateFang.action",
				data:{
					"cid":cid,
					
				},
				dataType:"json",
			    type:"post",
			    success:function(data){
		     		$("#selectChuku2").empty();
		     		$("#selectChuku").click();
		    	}
			})
		})
 </script>
</html>