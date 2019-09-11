$("ul.create-nav-list li.active>a>i.fa").last().css({"background":"none","color":"yellowgreen"});

$(".prev_next_area").hide();
					$("#1").show();
					
$(".material_next_btn").click(function(e) {
	
	var timestamp=$("#timestamp_id").val();
	var selected_area = Number($("#selected_area").val());
	 
	if (selected_area == 1) {
		  
		e.preventDefault();
		var isValid=true;
		 
		$("section[data-step=1] input[required='required']").each(function(idx, elem) {
            $(elem).removeClass("input_error");
            if($(elem).val().trim() === "") {
                isValid = false;
                $(elem).addClass("input_error");
               // return false;
            }
        });
		 
		var val=$("#descriptionID").val();
		if(val==""){
			$("#descriptionID").addClass("input_error");
			isValid = false;
		}else{
			$("#descriptionID").removeClass("input_error");
		}
		
		var MfgMaterialWarranty_id=$("#MfgMaterialWarranty_id").prop("checked");
		if(MfgMaterialWarranty_id){
			var year=$("#MfgMaterialWarrantyYY").val();
			if(year==-1){
				$(".MfgMaterialWarrantyYY").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".MfgMaterialWarrantyYY").removeClass("input_error_select2");
			}
			var month=$("#MfgMaterialWarrantyMM").val();
			if(month==-1){
				$(".MfgMaterialWarrantyMM").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".MfgMaterialWarrantyMM").removeClass("input_error_select2");
			}
		}
		var mfgLaborWarranty_id=$("#mfgLaborWarranty_id").prop("checked"); 
		if(mfgLaborWarranty_id){
			var year=$("#mfgLaborWarrantyYY").val();
			if(year==-1){
				$(".mfgLaborWarrantyYY").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".mfgLaborWarrantyYY").removeClass("input_error_select2");
			}
			var month=$("#mfgLaborWarrantyMM").val();
			if(month==-1){
				$(".mfgLaborWarrantyMM").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".mfgLaborWarrantyMM").removeClass("input_error_select2");
			}
		}
		
		var companyMaterialWarranty_id=$("#companyMaterialWarranty_id").prop("checked"); 
		if(companyMaterialWarranty_id){
			var year=$("#companyMaterialWarrantyYY").val();
			if(year==-1){
				$(".companyMaterialWarrantyYY").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".companyMaterialWarrantyYY").removeClass("input_error_select2");
			}
			var month=$("#companyMaterialWarrantyMM").val();
			if(month==-1){
				$(".companyMaterialWarrantyMM").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".companyMaterialWarrantyMM").removeClass("input_error_select2");
			}
		}
		var companyLaborWarranty_id=$("#companyLaborWarranty_id").prop("checked"); 
		if(companyLaborWarranty_id){
			var year=$("#companyLaborWarrantyYY").val();
			if(year==-1){
				$(".companyLaborWarrantyYY").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".companyLaborWarrantyYY").removeClass("input_error_select2");
			}
			var month=$("#companyLaborWarrantyMM").val();
			if(month==-1){
				$(".companyLaborWarrantyMM").addClass("input_error_select2");
				isValid = false;
			}else{
				$(".companyLaborWarrantyMM").removeClass("input_error_select2");
			}
		}
		
		 
		if(isValid==false){
			$("#err_msg").html("Please fill all the required fields");
			$("#errorModal").modal('toggle');
			return false;
		}
		
		$.ajax({
			url : "/saveMaterialBasicDetailsTemp?TIMESTAMP="+timestamp,
			 
			data: $("#material_form_id").serializeArray(),
			success : function(data) {
				var obj = data.msg;
				selected_area=selected_area+1;
				$("#selected_area").attr("value", selected_area);

				
				
				$(".prev_next_area").hide();
				$("#" + selected_area).show();
			},
			error : function(e) {
				alert("error:" + e);
			}
		});
		
	}
	
	 else if (selected_area == 2) {
			
			e.preventDefault();
			selected_area = selected_area + 1;
			 
			$.ajax({
				url : "/updateMaterialBasicDetailsTemp?TIMESTAMP="+timestamp,
				data : $('#updatematerial_form_id').serializeArray(),
				success : function(data) {
					
					var material = data.msg[0];
					var materialtype=data.msg[2];
					var uomcode=data.msg[3];
					var chartofaccounttype=data.msg[4];
					var imgStr=data.msg[1];
					 
					$('#materialCode_id1').html(material.materialCode);
					$('#name_id1').html(material.name);
					$('#description_id1').html(material.description);
					
					var cost=material.unitCost;
					var charge=material.unitCharge;
					
					$('#unitCost_id1').html(material.unitCost);
					$('#unitCharge_id1').html(material.unitCharge);
					
					var markup=material.unitCost/material.unitCharge;
						$("#markup_id1").html(markup);
					
					$('#manufacturer_id1').html(material.manufacturer);
					$('#modelNumber_id1').html(material.modelNumber);
					$('#uOMId_id1').html(uomcode);
					$('#materialTypeId_id1').html(materialtype);
					 
					
					$('#isInventory_id1').html(material.isInventory);
					$('#isEquipment_id1').html(material.isEquipment);
					$('#isSearialize_id1').html(material.isSearialize);
					$('#isSubcontractor_id1').html(material.isSubcontractor);
					$('#isConsumable_id1').html(material.isConsumable);
					$('#chartOfAccountId_id1').html(chartofaccounttype);
					
					 
					 
					var s=material.mfgLaborWarrantyYYMM.split(",");
					$('#mfgLaborWarranty_id1').html(s[0]+" year "+s[1]+" Months");
				 
					
					var s1=material.mfgMaterialWarrantyYYMM.split(",");
					$('#mfgMaterialWarranty_id1').html(s1[0]+" year "+s1[1]+" Months");
					
					var s2=material.companyLaborWarrantyYYMM.split(",");
					$('#companyLaborWarranty_id1').html(s2[0]+" year "+s2[1]+" Months");
					
					var s3=material.companyMaterialWarrantyYYMM.split(",");
					$('#companyMaterialWarranty_id1').html(s3[0]+" year "+s3[1]+" Months");
					 
					
					
					$("#selected_img").attr("src",materialFileResult[0]);
					
					$("#barcode_id").attr("src",'data:image/png;base64,'+imgStr);
					$("#selected_area").attr("value", selected_area);

					$(".prev_next_area").hide();
					$("#" + selected_area).show();
					
					
					// $( "#" + selected_area ).focus();

				},
				error : function(e) {
					alert("error:" + e);
				}
			});
			
			
	 } else if (selected_area == 3) {
			
			e.preventDefault();
			var soform=$("#Material_form_id")[0];
			var formData=new FormData(soform);
			
			 
			for(var i=0;i<material_Filedata.length;i++){
				
				if(material_FiledataDelete.indexOf(i)==-1){
				formData.append("materialFiles",material_Filedata[i]);
				formData.append("materialFilenames", materialFilenames[i]);
				formData.append("materialFileTypes",material_Filedata_types[i]);
				formData.append("materialFileSize", materialFileSize[i]);
				}
			}
			 
			$.ajax({
				url : "/saveMaterial?TIMESTAMP="+timestamp,
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
			}); 
			
	 }
	 
	$("ul.create-nav-list li.active>a>i.fa").last().css({"background":"yellowgreen","color":"white"});
	$( "ul.create-nav-list li:nth-child("+selected_area+")" ).addClass("active");
	
	$("ul.create-nav-list li.active>a>i.fa").last().css({"background":"none","color":"yellowgreen"});
	 
	if(selected_area==3){
		$(".material_next_btn").html("SAVE")
	}else{
		//<i class="fa fa-fw fa-backward margin-r-5"></i>Next
	}
	
});



$(".material_prev_btn").click(function(){
	
	
	var selected_area = Number($("#selected_area").val());
	if (selected_area > 1) {
		selected_area = selected_area - 1;
	}
	$(".prev_next_area").hide();
	
	$("#selected_area").attr("value",selected_area);
	$("#" + selected_area).show();
	
	var nextd='Next<i class="fa fa-fw fa-forward margin-l-5"></i>';
	
	$(".material_next_btn").html(nextd);
});
$(".MfgMaterialWarrantyYYMM").hide();
$(".mfgLaborWarrantyYYMM").hide();

$("#MfgMaterialWarranty_id").click(function(){
	var a=$('input[name=MfgMaterialWarranty]').prop('checked');
	if(a){
		$(".MfgMaterialWarrantyYYMM").show();
	}else{
		$(".MfgMaterialWarrantyYYMM").hide();
	}
});

$("#mfgLaborWarranty_id").click(function(){
	var a=$('input[name=mfgLaborWarranty]').prop('checked');
	if(a){
		$(".mfgLaborWarrantyYYMM").show();
	}else{
		$(".mfgLaborWarrantyYYMM").hide();
	}
});

 
/*$("#companyMaterialWarranty_id").hide();
$(".companyMaterialWarrantyYYMM").hide();

$("#companyLaborWarranty_id").hide();
$(".companyLaborWarrantyYYMM").hide();
*/
$(".companyMaterialWarrantyYYMM").hide();
$(".companyWarranty_div").hide();
$(".companyLaborWarrantyYYMM").hide();
$("#companyWarranty_id").click(function(){
	var a=$('input[name=companyWarranty]').prop('checked');
	if(a){
		$(".companyWarranty_div").show();
	}else{
		$(".companyWarranty_div").hide();
	}
});
$("#companyMaterialWarranty_id").click(function(){
	var a=$('input[name=companyMaterialWarranty]').prop('checked');
	if(a){
		$(".companyMaterialWarrantyYYMM").show();
	}else{
		$(".companyMaterialWarrantyYYMM").hide();
	}
});
 
$("#companyLaborWarranty_id").click(function(){
	var a=$('input[name=companyLaborWarranty]').prop('checked');
	if(a){
		$(".companyLaborWarrantyYYMM").show();
	}else{
		$(".companyLaborWarrantyYYMM").hide();
	}
});
 
$("#chartOfAccount_div_Id").hide();
$("#isConsumable_id").click(function(){
	var a=$('input[name=isConsumable]').prop('checked');
	if(a){
		$("#chartOfAccount_div_Id").show();
	}else{
		$("#chartOfAccount_div_Id").hide();
	}
});
 
//$("#isSerialize_div_id").hide();
$('input[name=isInventory]').change(function(){
	var ii=$(this).attr("id");
	if(ii=="Inventory_id"){
		$("#isSerialize_div_id").show();
	}else{
		$("#isSerialize_div_id").hide();
	}
	
	
	$("#isConsumable_id").removeAttr("checked");
	$("#chartOfAccount_div_Id").hide();
});

$("#unitCost_id").change(function(){
	var v=Number($(this).val());
	 
	$("#unitCost_id").val((v).toFixed(4));
});
$("#markup_id").change(function(){
	var unitCost_val=$("#unitCost_id").val();
	 
	if(unitCost_val>0){
		var markup_val=$("#markup_id").val();
		var charge_val=$("#charge_id").val();
		$("#charge_id").val((unitCost_val/markup_val).toFixed(2));
		
	}
});

$("#charge_id").change(function(){
	var unitCost_val=$("#unitCost_id").val();
	 
	if(unitCost_val>0){
		//var markup_val=$("#markup_id").val();
		var charge_val=$("#charge_id").val();
		$("#markup_id").val((unitCost_val/charge_val).toFixed(4));
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

var materialFileResult=[];
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
						 
						materialFileResult[ss]=e.target.result;
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

