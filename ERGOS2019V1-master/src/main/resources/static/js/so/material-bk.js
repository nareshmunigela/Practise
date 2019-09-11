$(".prev_next_area").hide();
					$("#1").show();
					
$(".material_next_btn").click(function(e) {
	
	var timestamp=$("#timestamp_id").val();
	alert(timestamp);
	var selected_area = Number($("#selected_area").val());
	 
	if (selected_area == 1) {
		// create-nav-list
		 
		//e.preventDefault();
alert("hi");
		/*var soform=$("#material_form_id")[0];
		var formData=new FormData(soform);
		
		 
		for(var i=0;i<material_Filedata.length;i++){
			
			if(material_FiledataDelete.indexOf(i)==-1){
			formData.append("materialFiles",material_Filedata[i]);
			formData.append("materialFilenames", materialFilenames[i]);
			formData.append("materialFileTypes",material_Filedata_types[i]);
			formData.append("materialFileSize", materialFileSize[i]);
			}
		}
		selected_area = selected_area + 1;
		$.ajax({
			url : "/saveMaterialBasicDetailsTemp",
			 type: "POST",
			enctype: 'multipart/form-data',
			  data: formData,
			  processData: false,
			    contentType: false,
			success : function(data) {
				var obj = data.msg;
				$("#materialId").val(obj.materialId);
				$("#selected_area").attr("value", selected_area);

				$(".prev_next_area").hide();
				$("#" + selected_area).show();
			},
			error : function(e) {
				alert("error:" + e);
			}
		}); */
		
		$.ajax({
			url : "/saveMaterialBasicDetailsTemp?TIMESTAMP="+timestamp,
			 
			data: $("#material_form_id").serializeArray(),
			success : function(data) {
				var obj = data.msg;
				$("#selected_area").attr("value", selected_area);

				$(".prev_next_area").hide();
				$("#" + selected_area).show();
			},
			error : function(e) {
				alert("error:" + e);
			}
		});
		
		alert("after ajax");
	}
	
	 else if (selected_area == 2) {
			
			e.preventDefault();
			selected_area = selected_area + 1;
			 
			$.ajax({
				url : "/updateMaterialBasicDetailsTemp?TIMESTAMP="+timestamp,
				data : $('#updatematerial_form_id').serializeArray(),
				success : function(data) {

					var material = data.msg;
					alert(JSON.stringify(data.msg));
					$("#selected_area").attr("value", selected_area);

					$(".prev_next_area").hide();
					$("#" + selected_area).show();
					// $( "#" + selected_area ).focus();

				},
				error : function(e) {
					alert("error:" + e);
				}
			});
			
			
	 }
	
});


$("#markup_id").change(function(){
	var unitCost_val=$("#unitCost_id").val();
	 
	if(unitCost_val>0){
		var markup_val=$("#markup_id").val();
		var charge_val=$("#charge_id").val();
		$("#charge_id").val(unitCost_val/markup_val);
		
	}
});

$("#charge_id").change(function(){
	var unitCost_val=$("#unitCost_id").val();
	 
	if(unitCost_val>0){
		//var markup_val=$("#markup_id").val();
		var charge_val=$("#charge_id").val();
		$("#markup_id").val(unitCost_val/charge_val);
	}
}); 






$("#material_File_uploadimgs").click(function(){ 
	 $("#material_File").click();
});
var material_Filedata = [];
var material_Filedata_types = [];
var material_FiledataDelete=[];
var materialFilenames=[];
var materialFileSize=[];
var prblen=0;
$("#material_File")
		.change(
				function(e) {

					var file = e.target.files[0];
					var len = material_Filedata.length;
					var ss = prblen;
					material_Filedata[ss] = file;
					var fileName = e.target.files[0].name;
					materialFilenames.push(fileName);
					
					var size=(e.target.files[0].size/1024).toFixed(2);
					materialFileSize.push(size);
					
					var ftype=file.type;
					var sty=fileName.split(".");
					var ty=ftype.split("/");
					var typ=ty[0];
					var fyp=sty[1];
					 
					 
					 
					var reader = new FileReader();
					var ia;
					reader.onload = function(e) {
						 
						
						material_Filedata_types[ss]=typ;
						 
						 
						if(typ=="video"){
							ia='<video src="'+e.target.result+'" width="200" controls style="height:50px; width:50px"/>';
						}else if(typ=="audio"){
							ia='<audio src="'+e.target.result+'" controls style="height:50px; width:50px"/>';
						}else if(typ=="image"){
							ia='<img src="'+e.target.result+'" class="img250" style="height:50px; width:50px" />';
						}else{
							if(fyp=="pdf"||fyp=="pptx"){
								ia='<i class="fa fa-2mx text-green fa-file-pdf-o"></i>';
							}else if(fyp=="txt"){
								ia='<i class="fa fa-2mx text-green fa-file-text-o"></i>';
							}else if(fyp=="xls"||fyp=="xlsx"){
								ia='<i class="fa fa-2mx text-green fa-file-excel-o"></i>';
							}else{
								ia='<i class="fa fa-2mx text-green fa-file"></i>';
							}
						}
						
						 
						$("#material_Files")
						.append('<li class="margin-b-10">'+ ia
								+ file.name
										+ '<span class="pull-right text-danger"> <i class="fa fa-2x fa-times-circle delete_img_cls_material" id="'
										+ ss
										+ '"></i></span> </li>')
						.show();
					}
					prblen++;
					reader.readAsDataURL(file);
				});



 
$("body").delegate(".delete_img_cls_material","click",function(){ 
	
	var idd=$(this).attr("id");
	 	$(this).parent().parent().remove();
	//array.splice(i, 1);
	 	material_FiledataDelete.push(Number(idd));
	// indexOf
	 
	 
});