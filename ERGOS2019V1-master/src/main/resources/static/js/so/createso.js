$(document)
		.ready(
				function() {
					$("ul.create-nav-list li.active>a>i.fa").last().css({"background":"none","color":"yellowgreen"});
					$(".prev_next_area").hide();
					$("#1").show();

					
					
					
					$("body").delegate("#addPhone", "click", function() {
						$("#addPhnData").find(".primaryContact1").removeAttr("checked");
						$("#addPhnData").find(".del_cls_dev").html('<i class="fa fa-trash del_cls"></i>');
						var data = $("#addPhnData").html();
						
						$(".phnContacts-data").append(data);

						$('.select2a').select2();
						 $(":input").inputmask();
					});
					$("body").delegate("#addEmail", "click", function() {
						$("#addEmailData").find(".primaryEmail1").removeAttr("checked");
						$("#addEmailData").find(".del_cls_dev").html('<i class="fa fa-trash del_cls"></i>');
						 
						var data = $("#addEmailData").html();
						$(".emailContacts-data").append(data);
					});
					
					
					
					$("body").delegate(".del_cls","click",function(){
						$(this).parent().parent().remove();
					});
					
					
					$("body").delegate('input[type=radio][name=primaryContact1]',"change",function(){
						var t=$(this);
						var checkstatus = $(this).prop('checked');
						 
						$(".phnContacts-data").find(".del_cls_dev").html('<i class="fa fa-trash del_cls"></i>');
						if(checkstatus==true){
							$(t).parent().parent().find(".del_cls_dev").html('');
						}else{
							$("#phnContacts-data").find(".del_cls_dev").html('<i class="fa fa-trash del_cls"></i>');
						}
					});
					
					$("body").delegate('input[type=radio][name=primaryEmail1]',"change",function(){
						var t=$(this);
						var checkstatus = $(this).prop('checked');
						 
						$(".emailContacts-data").find(".del_cls_dev").html('<i class="fa fa-trash del_cls"></i>');
						if(checkstatus==true){
							$(t).parent().parent().find(".del_cls_dev").html('');
						}else{
							$("#emailContacts-data").find(".del_cls_dev").html('<i class="fa fa-trash del_cls"></i>');
						}
					});
					
					
					
					$("body").delegate("#add_contact_btn","click",function() {
										 
										$('#modal-body').html("");

										 
										//$(".contacts-data").html($("#contacts").html());
										
										$("#addPhnData").find(".primaryContact1").attr("checked","checked");
										$("#addPhnData").find(".del_cls_dev").html("");
										$(".phnContacts-data").html($("#addPhnData").html());
										
										
										$("#addEmailData").find(".primaryEmail1").attr("checked","checked");
										$("#addEmailData").find(".del_cls_dev").html("");
										$(".emailContacts-data").html($("#addEmailData").html());

										var mc = $("#modal-body-content").html();
										$('#modal-body').append(mc);

										 
										
										var footer='<button type="button" class="btn btn-label margin-r-10" data-dismiss="modal">Cancel</button>';
										footer=footer+'<button type="button" class="btn btn-primary btn-flat padding-x-20 savecontact_class" id="savecontact_id">Save</button>';
										
										$("#modal-footer").html(footer);
										
										$("#Primary_Contact_id").hide();

										var table = $('#example2').dataTable();
										var count = table.fnGetData().length;

										if (count >= 1) {
											$("#Primary_Contact_id").show();
										}

										
										   
								    	   $(":input").inputmask();
								    	  
										$('#myModal').modal('toggle');
									});
					
					$("body").delegate("#add_contact_btn_billing","click",function() {
						 
						$('#modal-body').html("");

						//$(".contacts-data").html($("#contacts").html());
						
						
						
						$("#addPhnData").find(".primaryContact1").attr("checked","checked");
						$("#addPhnData").find(".del_cls_dev").html("");
						$(".phnContacts-data").html($("#addPhnData").html());
						
						
						$("#addEmailData").find(".primaryEmail1").attr("checked","checked");
						$("#addEmailData").find(".del_cls_dev").html("");
						$(".emailContacts-data").html($("#addEmailData").html());
						
						 
						var mc = $("#modal-body-content").html();
						$('#modal-body').append(mc);

						
						var footer='<button type="button" class="btn btn-label margin-r-10" data-dismiss="modal">Cancel</button>';
						footer=footer+'<button type="button" class="btn btn-primary btn-flat padding-x-20 savecontact_class" id="savecontact_id_billing">Save & Continue</button>';
						
						$("#modal-footer").html(footer);
						
						
						$("#Primary_Contact_id").hide();

						var table = $('#example3').dataTable();
						var count = table.fnGetData().length;

						if (count >= 1) {
							$("#Primary_Contact_id").show();
						}
						 $(":input").inputmask();
						$('#myModal').modal('toggle');
					});
					
					
					

					$("body").delegate("#savecontact_id","click",function() {
						
						var isValid=true;
						 var errstr="Please fill all the required fields";
						$("section[data-step=2] input[required='required']").each(function(idx, elem) {
				            $(elem).removeClass("input_error");
				            
				            if($(elem).val().trim() === "") {
				                isValid = false;
				                $(elem).addClass("input_error");
				            }else{
				            	var type=$(this).attr("type");
				            	if(type=="email"){
				            		
				            		var userinput = $(this).val();
				            		var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i

				            		if(!pattern.test($(elem).val().trim()))
				            		{
				            			errstr='Please enter a valid Email address<br/>';
				            		  isValid = false;
				            		  
				            		}
				            	}
				            }
				        });
						
						if(isValid==false){
							$("#err_msg_modal").html(errstr);
							 
							return false;
						}else{
							$("#err_msg_modal").html("");
						}
								
						
						 
										$("#contact_form").find('input[name=primaryContact_0]').each(function() {
															var checkstatus = $(this).prop('checked');
															var str = '<input type="hidden" name="isPrimary" value="'+ checkstatus+ '"/>';
															$("#contact_form").append(str);

														});
										$("#contact_form")
												.find(
														'input[name=primaryContact1]')
												.each(
														function() {
															var checkstatus = $(this).prop('checked');
															var str = '<input type="hidden" name="primaryContact" value="'+ checkstatus+ '"/>';
															$("#contact_form")
																	.append(str);
														});
										$("#contact_form")
												.find(
														'input[name=primaryEmail1]')
												.each(
														function() {
															var checkstatus = $(
																	this).prop(
																	'checked');
															var str = '<input type="hidden" name="primaryEmail" value="'
																	+ checkstatus
																	+ '"/>';
															$("#contact_form")
																	.append(str);
														});
										var timestamp=$("#timestamp_id").val();
										
										$.ajax({

													url : "/saveContactTemp?TIMESTAMP="+timestamp,
													data : $('#contact_form')
															.serializeArray(),
													success : function(data) {

														var obj = data.msg;
														var objdata = obj[0];
														 
														$("#contactdata").html("");
														var condata;
														for (var i = 0; i < objdata.length; i++) {
															var con = "<tr>";
															
															var del;
															var isPrimary = objdata[i].isPrimary;
															var prime="";
															if (isPrimary) {
																prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
															}
															con = con
																	+ "<td>"
																	+ objdata[i].firstName
																	+ " "
																	+ objdata[i].lastName
																	+ prime+"</td>";
															con = con
																	+ "<td>"
																	+ objdata[i].relationshipType
																	+ "</td>";
															con = con
																	+ "<td class='word-break'><span>"
																	+ objdata[i].phoneNumber
																	+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
															con = con
																	+ "<td class='word-break'><span>"
																	+ objdata[i].email
																	+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";

															
															if (isPrimary) {
																 
																del = '<i class="fa fa-trash  fa-lg  margin-r-10 disabled" id="'
																		+ objdata[i].randomStr
																		+ '"></i>';
															} else {
																 
																del = '<i class="fa fa-trash  fa-lg  margin-r-10 deleteContact" id="'
																		+ objdata[i].randomStr
																		+ '"></i>';
															}
															con = con
																	+ '<td><i class="fa fa-pencil fa-lg margin-r-10 editContact" id="'
																	+ objdata[i].randomStr
																	+ '"></i>'
																	+ del
																	+ '</td>';
															condata = condata
																	+ con;
														}
														$('#example2')
																.dataTable()
																.fnDestroy();
														$("#contactdata").html(
																condata);
														$('#example2')
																.dataTable().fnDestroy();
														$('#myModal').modal(
																'toggle');

													},
													error : function(e) {
														alert(e);
													}

												});
									});// save
					
					
					$("body").delegate("#savecontact_id_billing","click",function(){

						 
						var isValid=true;
						 var errstr="Please fill all the required fields";
						$("section[data-step=2] input[required='required']").each(function(idx, elem) {
				            $(elem).removeClass("input_error");
				            
				            if($(elem).val().trim() === "") {
				                isValid = false;
				                $(elem).addClass("input_error");
				            }else{
				            	var type=$(this).attr("type");
				            	if(type=="email"){
				            		
				            		var userinput = $(this).val();
				            		var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i

				            		if(!pattern.test($(elem).val().trim()))
				            		{
				            			errstr='Please enter a valid Email address<br/>';
				            		  isValid = false;
				            		  
				            		}
				            	}
				            }
				        });
						
						if(isValid==false){
							$("#err_msg_modal").html(errstr);
							 
							return false;
						}else{
							$("#err_msg_modal").html("");
						}
							
						
						
						$("#contact_form").find('input[name=primaryContact_0]').each(function() {
											var checkstatus = $(this).prop('checked');
											var str = '<input type="hidden" name="isPrimary" value="'+ checkstatus+ '"/>';
											$("#contact_form").append(str);

										});
						$("#contact_form")
								.find(
										'input[name=primaryContact1]')
								.each(
										function() {
											var checkstatus = $(
													this).prop(
													'checked');
											var str = '<input type="hidden" name="primaryContact" value="'
													+ checkstatus
													+ '"/>';
											$("#contact_form")
													.append(str);
										});
						$("#contact_form")
								.find(
										'input[name=primaryEmail1]')
								.each(
										function() {
											var checkstatus = $(
													this).prop(
													'checked');
											var str = '<input type="hidden" name="primaryEmail" value="'
													+ checkstatus
													+ '"/>';
											$("#contact_form")
													.append(str);
										});
						var timestamp=$("#timestamp_id").val();
						
						 
						$.ajax({

									url : "/saveContactBillingTemp?TIMESTAMP="+timestamp,
									data : $('#contact_form')
											.serializeArray(),
									success : function(data) {
									 
										var obj = data.msg;
										var objdata = obj[0];
										$("#contactdata_billing").html("");
										
										var condata;
										var del;
										var customerName;
										for (var i = 0; i < objdata.length; i++) {
											var isPrimary = objdata[i].isPrimary;
											var prime="";
											if (isPrimary) {
												prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
											}
											
											var con = "<tr>";
											con = con
													+ "<td>"
													+ objdata[i].firstName
													+ " "
													+ objdata[i].lastName
													+prime +"</td>";
											con = con
													+ "<td>"
													+ objdata[i].relationshipType
													+ "</td>";
											con = con
											+ "<td class='word-break'><span>"
													+ objdata[i].phoneNumber
													+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
											con = con
											+ "<td class='word-break'><span>"
													+ objdata[i].email
													+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";
											
											 
											 
											if (isPrimary) {
												 
												del = '<i class="fa fa-trash fa-lg  margin-r-10 disabled" id="'
														+ objdata[i].randomStr
														+ '"></i>';
												customerName=objdata[i].firstName+" "+objdata[i].lastName;
											} else {
												 
												del = '<i class="fa fa-trash fa-lg margin-r-10 deleteContact_billing" id="'
														+ objdata[i].randomStr
														+ '"></i>';
											}
											con = con
													+ '<td> <i class="fa fa-edit fa-lg margin-r-10 editContact_billing" id="'
													+ objdata[i].randomStr
													+ '"></i>'
													+ del
													+ '</td>';
											condata = condata
													+ con;
										}
									 $('#example3').dataTable().fnDestroy();
									 $("#billing_bussinessName").html($("#customerName_id").val());
										$("#billing_customerName").html(customerName);
										$("#contactdata_billing").html(condata);
										 $('#example3').dataTable().fnDestroy();
										$('#myModal').modal('toggle');

									},
									error : function(e) {
										alert(e);
									}

								});
						
					});
					
					$("body").delegate(".deleteContact","click",function() {

										var id = $(this).attr("id");
										
										var timestamp=$("#timestamp_id").val();
										$.ajax({
													url : "/deleteContactTemp?mapKey="+ id+"&TIMESTAMP="+timestamp,
													 
													success : function(data) {

														var obj = data.msg;
														var objdata = obj[0];
														$("#contactdata").html("");

														var condata;
														for (var i = 0; i < objdata.length; i++) {
															var isPrimary = objdata[i].isPrimary;
															var prime="";
															if (isPrimary) {
																prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
															}
															var con = "<tr>";
															con = con
																	+ "<td>"
																	+ objdata[i].firstName
																	+ " "
																	+ objdata[i].lastName
																	+ prime 
																	+"</td>";
															con = con
																	+ "<td>"
																	+ objdata[i].relationshipType
																	+ "</td>";
															con = con
															+ "<td class='word-break'><span>"
															+ objdata[i].phoneNumber
															+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
													con = con
															+ "<td class='word-break'><span>"
															+ objdata[i].email
															+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";

															var del;
															 
															if (isPrimary) {
																 
																del = '<i class="fa fa-trash  fa-lg margin-r-10 disabled" id="'
																		+ objdata[i].randomStr
																		+ '"></i>';
															} else {
																 
																del = '<i class="fa fa-trash  fa-lg  margin-r-10 deleteContact" id="'
																		+ objdata[i].randomStr
																		+ '"></i>';
															}
															con = con
																	+ '<td> <i class="fa fa-edit margin-r-10 editContact" id="'
																	+ objdata[i].randomStr
																	+ '"></i>'
																	+ del
																	+ '</td>';
															condata = condata
																	+ con;
														}
														$('#example2').dataTable().fnDestroy();
														$("#contactdata").html(condata);
														$('#example2').dataTable().fnDestroy();

													},
													error : function(e) {
														alert(e);
													}
												});
									});// delete
					
					
					
					$("body").delegate(".deleteContact_billing","click",function() {


						var id = $(this).attr("id");
						
						var timestamp=$("#timestamp_id").val();
						 
						$.ajax({
									url : "/deleteContactBillingTemp?mapKey="+ id+"&TIMESTAMP="+timestamp,
									 
									success : function(data) {

										var obj = data.msg;
										var objdata = obj[0];
										$("#contactdata_billing").html("");

										var condata;
										for (var i = 0; i < objdata.length; i++) {
											var con = "<tr>";
											var isPrimary = objdata[i].isPrimary;
											var prime="";
											if (isPrimary) {
												prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
											}
											var con = "<tr>";
											con = con
													+ "<td>"
													+ objdata[i].firstName
													+ " "
													+ objdata[i].lastName
													+ prime 
													+"</td>";
											con = con
													+ "<td>"
													+ objdata[i].relationshipType
													+ "</td>";
											con = con
											+ "<td class='word-break'><span>"
											+ objdata[i].phoneNumber
											+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
									con = con
											+ "<td class='word-break'><span>"
											+ objdata[i].email
											+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";


											var del;
										 	if (isPrimary) {
											 	del = '<i class="fa fa-trash  fa-lg  margin-r-10 disabled" id="'
														+ objdata[i].randomStr
														+ '"></i>';
											} else {
											 	del = '<i class="fa fa-trash fa-lg  margin-r-10 deleteContact_billing" id="'
														+ objdata[i].randomStr
														+ '"></i>';
											}
											con = con
													+ '<td> <i class="fa fa-edit fa-lg margin-r-10 editContact_billing" id="'
													+ objdata[i].randomStr
													+ '"></i>'
													+ del
													+ '</td>';
											condata = condata
													+ con;
										}
										$('#example3').dataTable().fnDestroy();
										$("#contactdata_billing").html(condata);
										$('#example3').dataTable().fnDestroy();

									},
									error : function(e) {
										alert(e);
									}
								});//ajax-end
					
						
					});//delete-biling-contact

					
					 
					
					
					// custermdetails_btn_id
					
					
					$(".next_btn").click(
							function(e) {
								e.preventDefault();
								
								var timestamp=$("#timestamp_id").val();
								var selected_area = Number($("#selected_area").val());
								
								
								if (selected_area == 1) {
									//create-nav-list
									
									
									var isValid=true;
									 
									$("section[data-step=1] input[required='required']").each(function(idx, elem) {
							            $(elem).removeClass("input_error");
							            if($(elem).val().trim() === "") {
							                isValid = false;
							                $(elem).addClass("input_error");
							               // return false;
							            }
							        });
									//var a = $(this).prop('checked');
									var a = $("#taxexempt").prop('checked');
									if(a==true){
										var val=$("#reason_id").val();
										if(val==""){
											$("#reason_id").addClass("input_error");
											isValid = false;
										}
									}
									
									if(isValid==false){
										$("#err_msg").html("Please fill all the required fields");
										$("#errorModal").modal('toggle');
										return false;
									}else{
										var table = $('#example2').dataTable();
										var count = table.fnGetData().length;
										
										 
										if(count>0){
											
										}else{
											$("#err_msg").html("Please add a primary contact");
											$("#errorModal").modal('toggle');
											return false;
										}
										
									}
									//return false;
									
									/*$('form[id="service_address_form_id"]').validate({
									 	
										      rules: {
										    	  customerName: 'required',
										         
										        
										      },
										      messages: {
										    	  customerName: 'This field is required',
										    	  
										    	},
										    	submitHandler: function(form) {
										    	    form.submit();
										    	  }
										   });*/
									 
									 
								
									selected_area = selected_area + 1;
									
									//$("#service_address_form_id").append
									$.ajax({
										url : "/saveServiceAddressTemp?TIMESTAMP="+timestamp,
										data : $('#service_address_form_id')
												.serializeArray(),
										success : function(data) {

											 
											var obj = data.msg;
											$("#selected_area").attr("value",selected_area);

											$(".prev_next_area").hide();
											$("#" + selected_area).show();
											 
											 
											 
											// $( "#" + selected_area ).focus();
											  
											 
											  
										},
										error : function(e) {
											alert("error:" + e)
										}
									});
								} else if (selected_area == 2) {
									
									e.preventDefault();
									var isValid=true;
									 
									$("section[data-step=3] textarea[required='required']").each(function(idx, elem) {
							            $(elem).removeClass("input_error");
							            
							            if($(elem).val().trim() === "") {
							                isValid = false;
							                $(elem).addClass("input_error");
							               // return false;
							            }
							        });
									
									if(isValid==false){
										$("#err_msg").html("Please fill all the required fields");
										$("#errorModal").modal('toggle');
										return false;
									}
									else{
										
								 
									selected_area = selected_area + 1;
									$.ajax({
										url : "/saveServiceOrderTemp?TIMESTAMP="+timestamp,
										data : $('#service_order_form_id').serializeArray(),
										success : function(data) {

											 
											var obj = data.msg;

											var customerName;
											if(obj[1]!=null){
											
											//$("#billing_customerName").html(obj[1].customerName);
												 
												if(Number(obj[1].customerId)>0){
													$("#billing_account_id").html(obj[1].customerId);
													$("#billing_account_id").html(obj[1].customerNumber);
												}else{
													$("#billing_account_id").html("");
												}
												
											$("#billing_address").html(obj[1].billingAddress);
											$("#billing_unit").html(obj[1].billingUnit);
											
											 
											var objdata = obj[0];
											$("#contactdata_billing").html("");

											var condata;
											for (var i = 0; i < objdata.length; i++) {
												var isPrimary = objdata[i].isPrimary;
												var prime="";
												if (isPrimary) {
													prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
												}
												var con = "<tr>";
												con = con
														+ "<td>"
														+ objdata[i].firstName
														+ " "
														+ objdata[i].lastName
														+prime+ "</td>";
												con = con
														+ "<td>"
														+ objdata[i].relationshipType
														+ "</td>";
												con = con
												+ "<td class='word-break'><span>"
												+ objdata[i].phoneNumber
												+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
										con = con
												+ "<td class='word-break'><span>"
												+ objdata[i].email
												+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";

												var del;
											 
												if (isPrimary) {
													 	del = '<i class="fa fa-trash fa-lg  margin-r-10 disabled" id="'
															+ objdata[i].randomStr
															+ '"></i>';
													 	customerName=objdata[i].firstName+" "+objdata[i].lastName;
												} else {
													 	del = '<i class="fa fa-trash  fa-lg margin-r-10 deleteContact_billing" id="'
															+ objdata[i].randomStr
															+ '"></i>';
												}
												con = con
														+ '<td> <i class="fa fa-edit fa-lg margin-r-10 editContact_billing" id="'
														+ objdata[i].randomStr
														+ '"></i>'
														+ del
														+ '</td>';
												condata = condata
														+ con;
											}
											$('#example3').dataTable().fnDestroy();
											$("#contactdata_billing").html(condata);
											$('#example3').dataTable().fnDestroy();
												
											$("#billing_bussinessName").html($("#customerName_id").val());
											$("#billing_customerName").html(customerName);
											}
											
											$("#selected_area").attr("value",selected_area);

											$(".prev_next_area").hide();
											$("#" + selected_area).show();
											
											
											 
											
										},
										error : function(e) {

											alert("error:" + e)
										}
									});
									}
								}else if(selected_area == 3){
									//serviceorder_billing_form_id
									
									var soform=$("#service_order_form_id")[0];
									var formData=new FormData(soform);
									
									for(var i=0;i<tax_Filedata.length;i++){
										if(tax_FiledataDelete.indexOf(i)==-1){
										formData.append("taxFiles",tax_Filedata[i]);
										formData.append("taxFilenames", taxFilenames[i]);
										formData.append("taxFileTypes",tax_Filedata_types[i]);
										formData.append("taxFileSize", taxFileSize[i]);
										}
									}
									
									for(var i=0;i<tax_Filedata.length;i++){
										if(taxcustomer_FiledataDelete.indexOf(i)==-1){
										formData.append("taxCustomerFiles",taxcustomer_Filedata[i]);
										formData.append("taxCustomerFilenames", taxcustomerFilenames[i]);
										formData.append("taxCustomerFileTypes",taxcustomer_Filedata_types[i]);
										formData.append("taxCustomerFileSize", taxcustomerFileSize[i]);
										}
									}
									
									for(var i=0;i<problem_Filedata.length;i++){
										
										if(problem_FiledataDelete.indexOf(i)==-1){
										formData.append("problemFiles",problem_Filedata[i]);
										formData.append("problemFilenames", problemFilenames[i]);
										formData.append("problemFileTypes",problem_Filedata_types[i]);
										formData.append("problemFileSize", problemFileSize[i]);
										}
									}
									
									
									
									var serviceNote=$("#serviceNote_id").val();
									if(serviceNote!=""){
										formData.append("notes",serviceNote);
									}else{
										alert("Service order note can't be empty");
										return false;
									}
									
									
									var billingNote=$("#billingNote_id").val();
									if(billingNote!=""){
										formData.append("billingnotes",billingNote);
									}/*else{
										alert("Billing note can't be empty");
										return false;
									}*/
									
									var taxexemptcustomer=$("#taxexemptcustomer").prop("checked");
									
									var reasoncustomer=$("#reasoncustomer_id").val();
									 
									//return false;
									formData.append("taxexemptcustomer",taxexemptcustomer);
									formData.append("reasoncustomer",reasoncustomer);
									
									$.ajax({
										url : "/saveServiceOrder?TIMESTAMP="+timestamp,
										//data : $('#service_order_form_id').serializeArray(),
										 type: "POST",
										 enctype: 'multipart/form-data',
										  data: formData,
										  processData: false,
										    contentType: false,
										success : function(data) {
											
											var soid=data.msg[1];
											var sonumber=data.msg[2];
											
											$("#sonumber_created").html(sonumber);
											
											$("#created_so_href_id").attr("href","/sodrderview?soId="+soid+"&tabSet=so");
											
											$("#SO_modal").modal('toggle');
											
											
											
											//$("#sitesList_id").click();
										},error:function(e){
											alert(e);
										}
									});//ajax
									
								}//selected_area=3 end...
								
								
								focusfunction("content-header");
								$("ul.create-nav-list li.active>a>i.fa").last().css({"background":"yellowgreen","color":"white"});
								$( "ul.create-nav-list li:nth-child("+selected_area+")" ).addClass("active");
								
								$("ul.create-nav-list li.active>a>i.fa").last().css({"background":"none","color":"yellowgreen"});
								//if selected_area reaches 3 then display save....
								if(selected_area==3){
									$(".next_btn").html("SAVE")
								}else{
									//<i class="fa fa-fw fa-backward margin-r-5"></i>Next
								}
								
								
							});
					
					
					
					
					
					$(".prev_btn").click(function(){
						
						
						var selected_area = Number($("#selected_area").val());
						if (selected_area > 1) {
							selected_area = selected_area - 1;
						}
						$(".prev_next_area").hide();
						
						$("#selected_area").attr("value",selected_area);
						$("#" + selected_area).show();
						//var nextd='<i class="fa fa-fw fa-backward margin-r-5"></i>Next';
						var nextd='Next<i class="fa fa-fw fa-forward margin-l-5"></i>';
						
						$(".next_btn").html(nextd);
						 
						$('#example2').dataTable().fnDestroy();
						$('#example3').dataTable().fnDestroy();
						
					});
					
				 
					
					/*
					 * $("body").delegate("#custermdetails_btn_id","click",function(){
					 * 
					 * });
					 */

					$("#taxexempt").click(function() {

						var a = $(this).prop('checked');

						if (a == true) {
							$("#taxexemptcontent").show();
						} else {
							$("#taxexemptcontent").hide();
							$(".delete_img_cls_tax").click();
						}
						

					});
					
					
					
					
					$("#taxexemptcustomer").click(function() {
						var a = $(this).prop('checked');
						if (a == true) {
							$("#taxexemptcontentCustomer").show();
						} else {
							$("#taxexemptcontentCustomer").hide();
							//$("#reasoncustomer_id").val("");
							$(".delete_img_cls_tax_customer").click();
						}
					});
					
					$("#taxcustomer_File_uploadimgs").click(function(){ 
						 $("#taxcustomer_File").click();
					 });
					
					var taxcustomer_Filedata = [];
					var taxcustomer_Filedata_types = [];
					 var taxcustomer_FiledataDelete=[];
					 var taxcustomerFilenames=[];
					 var taxcustomerFileSize=[];
					 
					 var taxcustomerlen=0;
					$("#taxcustomer_File")
							.change(
									function(e) {

										var file = e.target.files[0];
										var len = taxcustomer_Filedata.length;
										var ss = taxcustomerlen;
										taxcustomer_Filedata[ss] = file;
										var fileName = e.target.files[0].name;
										var size=(e.target.files[0].size/1024).toFixed(2);
										
										taxcustomerFilenames.push(fileName);
										taxcustomerFileSize.push(size);
										
										var ftype=file.type;
										var sty=fileName.split(".");
										var ty=ftype.split("/");
										var typ=ty[0];
										var fyp=sty[1];
										 
										 
										 
										var reader = new FileReader();
										var ia;
										reader.onload = function(e) {
											 
											taxcustomer_Filedata_types[ss]=typ;
											 
											 
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
												
												
												$("#taxcustomer_Files").append('<li class="margin-b-10">'+ ia
																+ file.name
																+ '<span class="pull-right text-danger"> <i class="fa fa-2x fa-times-circle delete_img_cls_tax_customer" id="'
																+ ss
																+ '"></i></span> </li>')
												.show();
										}
										
										taxcustomerlen++;
										reader.readAsDataURL(file);
									});
					
					$("body").delegate(".delete_img_cls_tax_customer","click",function(){ 
						
						var idd=$(this).attr("id");
						 
						 	$(this).parent().parent().remove();
						//array.splice(i, 1);
						 	taxcustomer_FiledataDelete.push(Number(idd));
						// indexOf
						 
						 
					});
					

					var filedata = [];
					var filedataDelete = [];
					$("#exampleInputFile")
							.change(
									function(e) {

										var file = e.target.files[0];
										var len = filedata.length;
										var ss = len++;
										filedata[ss] = file;
										var fileName = e.target.files[0].name;
										$("#taxfiles")
												.append(
														'<li class="margin-b-10">'
																+ fileName
																+ '<span class="pull-right text-danger"> <i class="fa fa-2x fa-times-circle delete_img_cls" id="'
																+ ss
																+ '"></i></span> </li>')
												.show();
									});
					$("body").delegate(".delete_img_cls_tax", "click", function() {

						var id=$(this).attr("id");
						 //tax_Filedata[];
						// tax_Filedata_types = [];
						 
						 
					});

					$("body").delegate(
							"#problemType_Id",
							"change",
							function() {
								var problemCodeId = $(this).val();

								$.ajax({
									url : "/getTechnicianList?problemTypeId="
											+ problemCodeId,
									success : function(data) {
										//var obj = data.msg;
										//var objdata = data[0];
										var condata="";
										for (var i = 0; i < data.length; i++) {
											var con = "<option value='"+data[i].id+"'>"+data[i].description+"</option>";
											 
											condata=condata+con;
										}
										$("#technician_list_id").html(condata);
									},
									error : function(e) {
										alert(e);
									}
								});// ajax

							});// change function

					
					
					
					 $(".pay").hide();//pay_optionsRadio,pay_check_details_id,pay_cc_details_id
					 $('input[type=radio][name=pay_optionsRadio]').change(function() {
					 $(".pay").hide();
					 $("#"+this.value).show();
							//var checkstatus = $(this).prop('checked');
							
							
					 });
					
					 
					 $("#modify_bill_modal_body_id").hide();
					 
					 
					 //change billing
					 
					 
					
					 
					 
					 
					 
					 $("body").delegate("#AddBillingModal_btn1","click",function(){
						 $("#modify_bill_modal_heading").html("Search Billing Address");
						 var str=$("#billing_existing_modal_id_body_id").html();
						 $("#modify_bill_modal_body_id").hide();
						    //search_site
							$("#modal-body-change-billing").html(str); 
							
							
							var str='<button type="button" class="btn btn-lg btn-label no-padding text-black" id="modify_bill_modal_id"><i class="fa fa-plus-circle text-blue margin-r-5"></i>Add New</button>';
							$("#modal-body-change-billing-footer").html(str);
							
				        	//$("#AddBillingModal").modal('toggle');
				        });
					 
					 $("body").delegate("#AddBillingModal_btn","click",function(){
						 $("#modify_bill_modal_heading").html("Search Billing Address");
						 var str=$("#billing_existing_modal_id_body_id").html();
						 $("#modify_bill_modal_body_id").hide();
						    //search_site
							$("#modal-body-change-billing").html(str); 
							
							
							var str='<button type="button" class="btn btn-lg btn-label no-padding text-black" id="modify_bill_modal_id"><i class="fa fa-plus-circle text-blue margin-r-5"></i>Add New</button>';
							$("#modal-body-change-billing-footer").html(str);
							
				        	$("#AddBillingModal").modal('toggle');
				        });
					 
					 $("body").delegate("#modify_bill_modal_id","click",function(){
						  
						 $("#modify_bill_modal_heading").html("Change Billing Address");
						 $("#modify_bill_modal_body_id").show();
							$("#modal-body-change-billing").html("");
							
							var str='<button type="button" class="btn btn-lg btn-label no-padding text-black" id="AddBillingModal_btn1"><i class="fa fa-plus-circle text-blue margin-r-5"></i>Search Billing</button>';
							$("#modal-body-change-billing-footer").html(str);
							
				        });
					 $("body").delegate("#AddNewBillingModal_btn","click",function(){
						 $("#modify_bill_modal_heading").html("Change Billing Address");
						 $("#modify_bill_modal_body_id").show();
							$("#modal-body-change-billing").html("");
							
							var str='<button type="button" class="btn btn-lg btn-label no-padding text-black" id="AddBillingModal_btn1"><i class="fa fa-plus-circle text-blue margin-r-5"></i>Search Billing</button>';
							$("#modal-body-change-billing-footer").html(str);
							
							$("#AddBillingModal").modal('toggle');
					 });
					 
					 
					 
				 
					 
					 
					 
					 
					 
					 
					 
					 $("#back_to_cb").hide();
					 
					 $("body").delegate("#changeBillingModal_btn","click",function(){
							/* $("#modify_bill_modal_heading").html("Search Billing Address");
							 var str=$("#billing_existing_modal_id_body_id").html();
							 $("#modify_bill_modal_body_id").hide();
							   
								$("#modal-body-change-billing").html(str); 
								
								
								var str='<button type="button" class="btn btn-lg btn-label no-padding text-black" id="modify_bill_modal_id"><i class="fa fa-plus-circle text-blue margin-r-5"></i>Add New</button>';
								$("#modal-body-change-billing-footer").html(str);*/
						 
						 		$("#cb_CustomerNumber").val($("#billing_account_id").html().trim());
						 		$("#cb_CustomerId").val( $("#customerId_id").val());
						 		
							 	$("#cb_CustomerName").val($("#customerName_id").val());
							 	$("#pac-input_new").val($("#billing_address").html().trim());
							 	$("#pac-input_new").blur();
							 	
							 	$("#cb_CustomerAddressUnit").val($("#billing_unit").html().trim());
							 	
							 	
							 	
							 	$("#cb_Customer_div").hide();	
								$('#cb_Customer_map_div').show();
								
								$("#billingSearchValue_id").val("")
								$(".cb_btn").show();
								$("#back_to_cb").hide();
					        	$("#chnageBillingModal").modal('toggle');
					        });
						 
						 
					 
					 $("body").delegate(
								"#search_site",
								"click",
								function() {
									var customer_name="";
									var site_address=$("#billingSearchValue_id").val();
									if(site_address==""){
										$("#billingSearchValue_id").addClass("input_error");
										return false;
									} 
									
									 
									//$("#tbody").html("");
									var timestamp=$("#timestamp_id").val();
									  
									$.ajax({
										url : "/searchCustomerByAddressORName?searchKey="+site_address+"&TIMESTAMP="+timestamp,
												
										success : function(data) {
										var str="";
										var i=0;
										for(var key in data.msg){
											var obj = data.msg[key];
											str = str+'<tr class="pad"><td class="col-md-2"><b>'+obj.customerNumber+'</b><br/>'+obj.name+'</td><td class="col-md-8">'+obj.address+'<br/>Unit:<b>'+obj.addressUnit+'</b></td><td class="col-md-2"><input type="button" class="add_site_class btn btn-primary btn-flat" id='+key+' value="Select" /></td></tr>';
											i++;
										}
										
										if(i>0){
											var strhead="<thead><tr class='bg-gray-light'><th class='col-md-2'>Customer</th><th class='col-md-8'>Address</th><th class='col-md-2'>&nbsp;</th></tr></thead>";
											 
											//$("#tbody").html(strhead+str);	
											$("#cb_Customer_div").html(strhead+str).show();	
											$('#cb_Customer_map_div').hide();
											
										}else{
											//$("#tbody").html("<div class='text-red'>No search results found</div>");
											$("#cb_Customer_div").html("<div class='text-red'>No search results found</div>");
										}
											
										$(".cb_btn").hide();
										$("#back_to_cb").show();
										
										//$('#example2').dataTable().fnDestroy();
										
										//$('#example2').dataTable();
										},
										error : function(e) {
											alert(e);
										}
									});// ajax

								});// change function
					 $("#back_to_cb").click(function(){
						 	$(".cb_btn").show();
							$("#back_to_cb").hide();
							$("#billingSearchValue_id").val("");
							$("#cb_Customer_div").hide();	
							$('#cb_Customer_map_div').show();
						 });
					 
					 $("body").delegate(
								".add_site_class",
								"click",
								function() {
									var id = $(this).attr("id");
										
									var timestamp=$("#timestamp_id").val();
									 
									var customerId=0;
									$.ajax({
										url : "/setup_search_address?sonumber="+id+"&TIMESTAMP="+timestamp+"&customerId="+customerId, 
												
										success : function(data) {
											 
											$("#cb_CustomerNumber").val(data.msg[0].customerNumber);
											$("#cb_CustomerName").val(data.msg[0].customerName);
										 	$("#pac-input_new").val(data.msg[0].billingAddress);
										 	$("#pac-input_new").blur();
										 	
										 	$("#cb_CustomerAddressUnit").val(data.msg[0].billingUnit);
										 	  
										 	$("#cb_CustomerId").val(data.msg[0].customerId);
										 	
										 	
										 	$("#cb_Customer_div").hide();	
											$('#cb_Customer_map_div').show();
											
											$("#billingSearchValue_id").val("")
											
											 
											
											$(".cb_btn").show();
											$("#back_to_cb").hide();
											
											
										/*$("#billing_address").html(data.msg[0].billingAddress);
										$("#billing_unit").html(data.msg[0].billingUnit);
										$("#billing_account_id").html(data.msg[0].customerNumber);
										 $("#customerId_id").attr("value",data.msg[0].customerId);
										 
										 
										 if(Number(data.msg[0].customerId)>0){
											 $("#customerName_id").val(data.msg[0].customerName);
											 $("#customerName_id").attr("readonly","readonly");
										 }else{
											 $("#customerName_id").removeAttr("readonly");
										 }
										 $("#billing_customerName").val($("#customerName_id").val());
										 $("#customerId_id").attr("value",0);
										 
										 
										var objdata=data.msg[1];
										var condata;
										for (var i = 0; i < objdata.length; i++) {
											var isPrimary = objdata[i].isPrimary;
											var prime="";
											if (isPrimary) {
												prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
											}
											
											var con = "<tr>";
											con = con
													+ "<td>"
													+ objdata[i].firstName
													+ " "
													+ objdata[i].lastName
													+prime +"</td>";
											con = con
													+ "<td>"
													+ objdata[i].relationshipType
													+ "</td>";
											con = con
											+ "<td class='word-break'><span>"
													+ objdata[i].phoneNumber
													+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
											con = con
											+ "<td class='word-break'><span>"
													+ objdata[i].email
													+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";
											
											 
											 
											if (isPrimary) {
												 
												del = '<i class="fa fa-trash fa-lg  margin-r-10 disabled" id="'
														+ objdata[i].randomStr
														+ '"></i>';
												customerName=objdata[i].firstName+" "+objdata[i].lastName;
											} else {
												 
												del = '<i class="fa fa-trash fa-lg margin-r-10 deleteContact_billing" id="'
														+ objdata[i].randomStr
														+ '"></i>';
											}
											con = con
													+ '<td><i class="fa fa-edit margin-r-10 editContact_billing" id="'
													+ objdata[i].randomStr
													+ '"></i>'
													+ del
													+ '</td>';
											condata = condata
													+ con;
										}
										$('#example3').dataTable().fnDestroy();
										$("#contactdata_billing").html(condata);
										$('#example3').dataTable().fnDestroy();
										 
										$("#billing_bussinessName").html($("#customerName_id").val());
										$("#billing_customerName").html(customerName);
										
										 
										$("#AddBillingModal").modal('toggle');
										var str;
										$("#tbody").html(str);	
										
										
										*/
										
										
										},
										error : function(e) {
											alert(e);
										}
									});// ajax

								});// change function

					 $("body").delegate("#cb_Customer_save","click",function(){
						//updateChangeBilling 
						 
						 var timestamp=$("#timestamp_id").val();
						 var CustomerAddress=$("#pac-input_new").val();
						 	var CustomerAddressUnit=$("#cb_CustomerAddressUnit").val();
						 	var CustomerNumber=$("#cb_CustomerNumber").val();
						 	var CustomerId=$("#cb_CustomerId").val();
							var CustomerName=$("#cb_CustomerName").val();
						 	 
						 	if(CustomerNumber!=null&&CustomerNumber!=""){
						 		 
						 		 $.ajax({
										url : "/updateChangeBilling?TIMESTAMP="+timestamp+"&CustomerId="+CustomerId+"&CustomerNumber="+CustomerNumber+"&CustomerName="+CustomerName+"&CustomerAddress="+CustomerAddress+"&CustomerAddressUnit="+CustomerAddressUnit, 
												
										success : function(data) {
											$("#billing_address").html(data.msg[0].billingAddress);
											$("#billing_unit").html(data.msg[0].billingUnit);
											$("#billing_account_id").html(data.msg[0].customerNumber);
											 $("#customerId_id").attr("value",data.msg[0].customerId);
											 
											  
											 if(data.msg[0].taxExemptCustomer){
												 $("#taxexemptcustomer").prop("checked","checked");
												 $("#taxexemptcontentCustomer").show();
												 $("#reasoncustomer_id").val(data.msg[0].reasonCustomer);
												 $("#reasoncustomer_id").prop("readonly","readonly");
												 $("#taxcustomer_File_uploadimgs").hide();
											 }else{
												 $("#taxexemptcustomer").removeAttr("checked");
												
												 $("#taxexemptcontentCustomer").hide();
												 $("#reasoncustomer_id").val("");
												 $("#reasoncustomer_id").removeAttr("readonly");
												 $("#taxcustomer_File_uploadimgs").show();
											 }
											 
											 if(Number(data.msg[0].customerId)>0){
												 $("#customerName_id").val(data.msg[0].customerName);
												 $("#customerName_id").attr("readonly","readonly");
											 }else{
												 $("#customerName_id").removeAttr("readonly");
											 }
											$("#billing_customerName").val($("#customerName_id").val());
											 
											 $("#customerId_id").attr("value",0);
											 
											 
											var objdata=data.msg[1];
											var condata;
											for (var i = 0; i < objdata.length; i++) {
												var isPrimary = objdata[i].isPrimary;
												var prime="";
												if (isPrimary) {
													prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
												}
												
												var con = "<tr>";
												con = con
														+ "<td>"
														+ objdata[i].firstName
														+ " "
														+ objdata[i].lastName
														+prime +"</td>";
												con = con
														+ "<td>"
														+ objdata[i].relationshipType
														+ "</td>";
												con = con
												+ "<td class='word-break'><span>"
														+ objdata[i].phoneNumber
														+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
												con = con
												+ "<td class='word-break'><span>"
														+ objdata[i].email
														+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";
												
												 
												 
												if (isPrimary) {
													del = '<i class="fa fa-trash fa-lg  margin-r-10 disabled" id="'
															+ objdata[i].randomStr
															+ '"></i>';
													customerName=objdata[i].firstName+" "+objdata[i].lastName;
												} else {
													del = '<i class="fa fa-trash fa-lg margin-r-10 deleteContact_billing" id="'
															+ objdata[i].randomStr
															+ '"></i>';
												}
												con = con
														+ '<td><i class="fa fa-edit margin-r-10 editContact_billing" id="'
														+ objdata[i].randomStr
														+ '"></i>'
														+ del
														+ '</td>';
												condata = condata
														+ con;
											}
											$('#example3').dataTable().fnDestroy();
											$("#contactdata_billing").html(condata);
											$('#example3').dataTable().fnDestroy();
											 
											$("#billing_bussinessName").html($("#customerName_id").val());
											$("#billing_customerName").html(data.msg[0].customerName);
											
											 
											$("#chnageBillingModal").modal('toggle');
											 
											
											
										 
										},error:function(e){
											
										}
								 });//innerajax
								 
						 	}//if-end
						 	else{
						 		
						 		 
						 $.ajax({
							 
								url : "/check_search_address_new?site_address="+CustomerAddress+"&site_units="+CustomerAddressUnit+"&TIMESTAMP="+timestamp, 
									
									
								success : function(data) {
									
									 
									var v=data.msg;
									 
									if(v=="NOTFOUND"){
										
									
						 	
						 
						 	 
						 
						 $.ajax({
								url : "/updateChangeBilling?TIMESTAMP="+timestamp+"&CustomerId="+CustomerId+"&CustomerNumber="+CustomerNumber+"&CustomerName="+CustomerName+"&CustomerAddress="+CustomerAddress+"&CustomerAddressUnit="+CustomerAddressUnit, 
										
								success : function(data) {
									 
									$("#billing_address").html(data.msg[0].billingAddress);
									$("#billing_unit").html(data.msg[0].billingUnit);
									$("#billing_account_id").html(data.msg[0].customerNumber);
									 $("#customerId_id").attr("value",data.msg[0].customerId);
									 
									 
									 if(Number(data.msg[0].customerId)>0){
										 $("#customerName_id").val(data.msg[0].customerName);
										 $("#customerName_id").attr("readonly","readonly");
									 }else{
										 $("#customerName_id").removeAttr("readonly");
									 }
									$("#billing_customerName").val($("#customerName_id").val());
									 
									 $("#customerId_id").attr("value",0);
									 
									 
									var objdata=data.msg[1];
									var condata;
									for (var i = 0; i < objdata.length; i++) {
										var isPrimary = objdata[i].isPrimary;
										var prime="";
										if (isPrimary) {
											prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
										}
										
										var con = "<tr>";
										con = con
												+ "<td>"
												+ objdata[i].firstName
												+ " "
												+ objdata[i].lastName
												+prime +"</td>";
										con = con
												+ "<td>"
												+ objdata[i].relationshipType
												+ "</td>";
										con = con
										+ "<td class='word-break'><span>"
												+ objdata[i].phoneNumber
												+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
										con = con
										+ "<td class='word-break'><span>"
												+ objdata[i].email
												+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";
										
										 
										 
										if (isPrimary) {
											 
											del = '<i class="fa fa-trash fa-lg  margin-r-10 disabled" id="'
													+ objdata[i].randomStr
													+ '"></i>';
											customerName=objdata[i].firstName+" "+objdata[i].lastName;
										} else {
											 
											del = '<i class="fa fa-trash fa-lg margin-r-10 deleteContact_billing" id="'
													+ objdata[i].randomStr
													+ '"></i>';
										}
										con = con
												+ '<td><i class="fa fa-edit margin-r-10 editContact_billing" id="'
												+ objdata[i].randomStr
												+ '"></i>'
												+ del
												+ '</td>';
										condata = condata
												+ con;
									}
									$('#example3').dataTable().fnDestroy();
									$("#contactdata_billing").html(condata);
									$('#example3').dataTable().fnDestroy();
									 
									$("#billing_bussinessName").html($("#customerName_id").val());
									$("#billing_customerName").html(data.msg[0].customerName);
									
									 
									$("#chnageBillingModal").modal('toggle');
									 
									
									
								 
								},error:function(e){
									
								}
						 });//innerajax
						 
									}
									else{
										 var str="Customer with the given address already exists with Customer Number <b>"+v.customerNumber+"</b>.";
										 str=str+" To continue, switch to customer <strong class='text-blue'>"+v.customerNumber+"</strong> or Cancel to add a new billing address.";
											var btn='<button type="button" class="btn btn-primary btn-flat padding-x-20 cb_existed_billing_continue_cls" id="'+v.customerId+'">Select</button>';
										 str=str+'<div class="row no-margin text-center">'+btn+'</div>';
											
										 $("#cb_Customer_div").show();	
											$('#cb_Customer_map_div').hide();
											
											 $("#cb_Customer_div").html(str);
												$(".cb_btn").hide();
												$("#back_to_cb").show();
										 
										return false;
									}
								},error: function(e){
									
								}
							});//ajax
						 
						 
						 	}//else-end
					 });
					 
					 
					 $("body").delegate(
								".cb_existed_billing_continue_cls",
								"click",
								function() {
									var id = 0;
										
									var timestamp=$("#timestamp_id").val();
									 
									var customerId=$(this).attr("id");
									$.ajax({
										url : "/setup_search_address?sonumber="+id+"&TIMESTAMP="+timestamp+"&customerId="+customerId, 
												
										success : function(data) {
											 
											$("#cb_CustomerNumber").val(data.msg[0].customerNumber);
											$("#cb_CustomerName").val(data.msg[0].customerName);
										 	$("#pac-input_new").val(data.msg[0].billingAddress);
										 	$("#pac-input_new").blur();
										 	
										 	$("#cb_CustomerAddressUnit").val(data.msg[0].billingUnit);
										 	  
										 	$("#cb_CustomerId").val(data.msg[0].customerId);
										 	
										 	
										 	$("#cb_Customer_div").hide();	
											$('#cb_Customer_map_div').show();
											
											$("#billingSearchValue_id").val("")
											
											 
											
											$(".cb_btn").show();
											$("#back_to_cb").hide();
										},error:function(){
											
										}
									});

								});// change function

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					
					 
					 //add_new_address_id,addNewAddressTemp
					 
					 
					 	$("body").delegate("#add_new_address_copy_id","click",function(){
						 
						 
						 var site_address = $("#pac-input_new").val();
							var site_units = $("#unit_new").val();

							var timestamp=$("#timestamp_id").val();
							 var siteId_id=$("#siteId_id").val();
								
								$.ajax({
									 
									url : "/check_search_address_new?site_address="+site_address+"&site_units="+site_units+"&TIMESTAMP="+timestamp, 
										
										
									success : function(data) {
										
										 
										var v=data.msg;
										 
										if(v=="NOTFOUND"){
											  
											 
						 $.ajax({
							 url : "/setup_search_address_copy_new?site_address="+site_address+"&site_units="+site_units+"&TIMESTAMP="+timestamp+"&siteId="+siteId_id, 
								
								success : function(data) {
									var obj = data.msg;

									if(obj[0]!=null){
									 
									$("#billing_account_id").html("");
									
									$("#billing_address").html(obj[0].billingAddress);
									$("#billing_unit").html(obj[0].billingUnit);
									 
									 
									 $("#customerName_id").val(obj[0].customerName);
									 if(Number(obj[0].customerId)>0){
										 $("#customerName_id").attr("readonly","readonly");
									 }else{
										 $("#customerName_id").removeAttr("readonly");
									 }
									
									 
									 $("#billing_bussinessName").html($("#customerName_id").val());
									 
									 $("#customerId_id").attr("value",obj[0].customerId);
									 	
									 $("#billing_account_id").html(data.msg[0].customerNumber);
									 
									$('#example3').dataTable().fnDestroy();
									//$("#contactdata_billing").html(condata);
									$('#example3').dataTable().fnDestroy();
									$('#AddBillingModal').modal('toggle');
									}
									
								},error:function(e){
									alert(e);
								}
							 
						 });
										}else{
											 var str="Customer with the given address already exists with Customer Number <b>"+v.customerNumber+"</b>.";
											 str=str+" To continue, switch to customer <strong class='text-blue'>"+v.customerNumber+"</strong> or Cancel to add a new billing address.";
											
											 
												var btn='<button type="button" class="btn btn-primary btn-flat padding-x-20 existed_billing_continue_cls" id="'+v.customerId+'">Continue</button>';
												  btn=btn+'<button type="button" class="btn btn-label margin-r-10" id="existed_billing_cancle_id">Cancel</button>';
											 str=str+'<div class="row no-margin text-center">'+btn+'</div>';
											 $('#modal-body-change-billing').html(str);
											 
											 
											 
											return false;
										}
									},error: function(e){
										
									}
								});
										
										
					 });
					 
					 
					 $("body").delegate("#add_new_address_id","click",function(e){
						 
						 e.preventDefault();
						 var site_address = $("#pac-input_new").val();
							var site_units = $("#unit_new").val();

							var timestamp=$("#timestamp_id").val();
							 
							 
							
							$.ajax({
								 
								url : "/check_search_address_new?site_address="+site_address+"&site_units="+site_units+"&TIMESTAMP="+timestamp, 
									
									
								success : function(data) {
									
									 
									var v=data.msg;
									 
									if(v=="NOTFOUND"){
										  
											  
											 $.ajax({
												 url : "/setup_search_address_new?site_address="+site_address+"&site_units="+site_units+"&TIMESTAMP="+timestamp, 
													
													success : function(data) {
														var obj = data.msg;

														if(obj[0]!=null){
														
														//$("#billing_customerName").html(obj[0].customerName);
															
														$("#billing_account_id").html("");
														
														$("#billing_address").html(obj[0].billingAddress);
														$("#billing_unit").html(obj[0].billingUnit);
														 
														
														 if(Number(obj[0].customerId)>0){
															 $("#customerName_id").attr("readonly","readonly");
														 }else{
															 $("#customerName_id").removeAttr("readonly");
														 }
														
														 $("#customerId_id").attr("value",0);
														 	
														 $("#billing_account_id").html(data.msg[0].customerNumber);
														 
														$('#example3').dataTable().fnDestroy();
														//$("#contactdata_billing").html(condata);
														$('#example3').dataTable().fnDestroy();
														$('#AddBillingModal').modal('toggle');
														}
														
													},error:function(e){
														alert(e);
													}
												 
											 });
										 
									}else{
										 var str="Customer with the given address already exists with Customer Number <b>"+v.customerNumber+"</b>.";
										 str=str+" To continue, switch to customer <strong class='text-blue'>"+v.customerNumber+"</strong> or Cancel to add a new billing address.";
										
										 
											var btn='<button type="button" class="btn btn-primary btn-flat padding-x-20 existed_billing_continue_cls" id="'+v.customerId+'">Select</button>';
											  btn=btn+'<button type="button" class="btn btn-label margin-r-10" id="existed_billing_cancle_id">Cancel</button>';
										 str=str+'<div class="row no-margin text-center">'+btn+'</div>';
										 $('#modal-body-change-billing').html(str);
										return false;
									}
								},error: function(e){
									
								}
							});
							
							 
							
						 
					 });
					 
					/* $("body").delegate("#existed_billing_continue_cls","click",function(){
						 
						 var id=$(this).attr("id");
						 alert(id);
						 
					 });*/
					 
					 $("body").delegate(
								".existed_billing_continue_cls",
								"click",
								function() {
									var id = 0;
										
									var timestamp=$("#timestamp_id").val();
									 
									var customerId=$(this).attr("id");
									$.ajax({
										url : "/setup_search_address?sonumber="+id+"&TIMESTAMP="+timestamp+"&customerId="+customerId, 
												
										success : function(data) {
											 
											 
										$("#billing_address").html(data.msg[0].billingAddress);
										$("#billing_unit").html(data.msg[0].billingUnit);
										//$("#billing_account_id").html(data.msg[0].customerId);
										$("#billing_account_id").html(data.msg[0].customerNumber);
										 $("#customerId_id").attr("value",data.msg[0].customerId);
										 
										 
										 if(Number(data.msg[0].customerId)>0){
											  
											 $("#customerName_id").val(data.msg[0].customerName);
											 $("#customerName_id").attr("readonly","readonly");
											 
											
										 }else{
											  
											 $("#customerName_id").removeAttr("readonly");
										 }
										 $("#billing_customerName").val($("#customerName_id").val());
										 $("#customerId_id").attr("value",0);
										 
										 
										var objdata=data.msg[1];
										var condata;
										for (var i = 0; i < objdata.length; i++) {
											var isPrimary = objdata[i].isPrimary;
											var prime="";
											if (isPrimary) {
												prime='<span class="label label-custom-yellowgreen margin-l-5">Primary</span>';
											}
											
											var con = "<tr>";
											con = con
													+ "<td>"
													+ objdata[i].firstName
													+ " "
													+ objdata[i].lastName
													+prime +"</td>";
											con = con
													+ "<td>"
													+ objdata[i].relationshipType
													+ "</td>";
											con = con
											+ "<td class='word-break'><span>"
													+ objdata[i].phoneNumber
													+'<i class="fa fa-fw fa-comments-o fa-lg text-blue margin-l-5"></i>'+"</span></td>";
											con = con
											+ "<td class='word-break'><span>"
													+ objdata[i].email
													+'<i class="fa fa-fw fa-envelope-o fa-lg text-blue margin-l-5"></i>'+ "</span></td>";
											
											 
											 
											if (isPrimary) {
												 
												del = '<i class="fa fa-trash fa-lg  margin-r-10 disabled" id="'
														+ objdata[i].randomStr
														+ '"></i>';
												customerName=objdata[i].firstName+" "+objdata[i].lastName;
											} else {
												 
												del = '<i class="fa fa-trash fa-lg margin-r-10 deleteContact_billing" id="'
														+ objdata[i].randomStr
														+ '"></i>';
											}
											con = con
													+ '<td><i class="fa fa-edit margin-r-10 editContact_billing" id="'
													+ objdata[i].randomStr
													+ '"></i>'
													+ del
													+ '</td>';
											condata = condata
													+ con;
										}
										$('#example3').dataTable().fnDestroy();
										$("#contactdata_billing").html(condata);
										$('#example3').dataTable().fnDestroy();
										//$('#myModal').modal('toggle');
										
										$("#billing_bussinessName").html($("#customerName_id").val());
										$("#billing_customerName").html(customerName);
										
										 
										$("#AddBillingModal").modal('toggle');
										var str;
										$("#tbody").html(str);	
										
										},
										error : function(e) {
											alert(e);
										}
									});// ajax

								});// change function

					 
					 
					 
					 
					 
					 
						 $("body").delegate("#existed_billing_cancle_id","click",function(){
							 $("#pac-input_new").val("");
							 $("#unit_new").val("");
							 $('#modal-body-change-billing').html("");
						 });
					//add_new_address_id,addNewAddressTemp
					 $("body").delegate("#update_new_address_id","click",function(){
						 
						 
						 var site_address = $("#pac-input_new").val();
							var site_units = $("#unit_new").val();
							var timestamp=$("#timestamp_id").val();
							 
							 
								 
						 $.ajax({
							 url : "/setup_search_address_new?site_address="+site_address+"&site_units="+site_units+"&TIMESTAMP="+timestamp, 
								
								success : function(data) {
									var obj = data.msg;

									if(obj[0]!=null){
									
									$("#billing_customerName").html(obj[0].customerName);
										
									//$("#billing_account_id").html("");
									
									$("#billing_address").html(obj[0].billingAddress);
									$("#billing_unit").html(obj[0].billingUnit);
									 
									
									 if(Number(obj[0].customerId)>0){
										 $("#customerName_id").attr("readonly","readonly");
									 }else{
										 $("#customerName_id").removeAttr("readonly");
									 }
									
									// $("#customerId_id").attr("value",0);
									 
									 
									$('#example3').dataTable().fnDestroy();
									//$("#contactdata_billing").html(condata);
									$('#example3').dataTable().fnDestroy();
									$('#updateBillingModalBilling').modal('toggle');
									}
									
								},error:function(e){
									alert(e);
								}
							 
						 });
						 
					 });
					 
					 
					 
					 
					 $("body").delegate("#updateBillingModalBilling_id","click",function(){
						var billaddress= $("#billing_address").html().trim();
						 var billunit=$("#billing_unit").html().trim();
						 
						 $("#pac-input_new").val(billaddress);
						 $("#unit_new").val(billunit);
						 
						 $('#updateBillingModalBilling').modal('toggle');
					 });
					 
					 
					 
					 
					 
					
						
						
						
						
						$("body").delegate(
								"#saveEquipment",
								"click",
								function(e) {
									
									/*var form = $('#saveEquipmentForm')[0]; // You need to use standard javascript object here
									var formData = new FormData(form);*/
									
									
									e.preventDefault();
									
									
									var isValid=true;
									 var errstr="Please fill all the required fields";
									$("section[data-step=4] input[required='required']").each(function(idx, elem) {
							            $(elem).removeClass("input_error");
							            
							            if($(elem).val().trim() === "") {
							                isValid = false;
							                $(elem).addClass("input_error");
							            } 
							        });
									
									if(isValid==false){
										$("#err_msg_equp_modal").html(errstr);
										 
										return false;
									}else{
										$("#err_msg_equp_modal").html("");
									}
										
									var val=$("#eqDesc").val();
									if(val==""){
										$("#eqDesc").addClass("input_error");
										return false;
									}else{
										$("#eqDesc").removeClass("input_error");
									}
									

									var installedByUs=	$('input[name=installedByUs]').prop('checked');
								var a=	$('input[name=mfrmetwarnt]').prop('checked');
								var b=$('input[name=mfrlabwarnt]').prop('checked');
								var c=	$('input[name=cmpmetwarnt]').prop('checked');
								var d=	$('input[name=cmplabwarnt]').prop('checked');
									 
								 if(installedByUs){
									 var age=$("#eqAge").val();
									 var mnf=$("#eqManf").val();
									 var loc=$("#eqLoc").val();
									 var model=$("#eqModel").val();
									 var sno=$("#eqSno").val();
									 			
									 var aa=$("#installationDate_id").val();
									 if(aa==""){
										 $("#err_msg_equp_modal").html("Date of Installation Required");
										 $("#installationDate_id").addClass("input_error");
										 return false;
									 }else{
										 $("#installationDate_id").removeClass("input_error");
									 }
									 if(age==""){
										 $("#err_msg_equp_modal").html("Estimated Age Required");
										 $("#eqAge").addClass("input_error");
										 return false;
									 }else{
										 $("#eqAge").removeClass("input_error");
									 }
									 if(mnf==""){
										 $("#err_msg_equp_modal").html("Manufacturer Required");
										 $("#eqManf").addClass("input_error");
										 return false;
									 }else{
										 $("#eqManf").removeClass("input_error");
									 }
									 if(loc==""){
										 $("#err_msg_equp_modal").html("Location Required");
										 $("#eqLoc").addClass("input_error");
										 return false;
									 }else{
										 $("#eqLoc").removeClass("input_error");
									 }
									 if(model==""){
										 $("#err_msg_equp_modal").html("Model Number  Required");
										 $("#eqModel").addClass("input_error");
										 return false;
									 }else{
										 $("#eqModel").removeClass("input_error");
									 }
									 if(sno==""){
										 $("#err_msg_equp_modal").html("Serial Number Required");
										 $("#eqSno").addClass("input_error");
										 return false;
									 }else{
										 $("#eqSno").removeClass("input_error");
									 }
								 }
								 
								 
								 if(a){
									 var aa=$("#mfgMaterialWarrantyExpDate_id").val();
									 
									 if(aa==""){
										 $("#err_msg_equp_modal").html("Manufacturer Material Warranty  Date Required");
										 $("#mfgMaterialWarrantyExpDate_id").addClass("input_error");
										 return false;
									 }else{
										 $("#mfgMaterialWarrantyExpDate_id").removeClass("input_error");
									 }
								 }
								 if(b){
									 var aa=$("#mfgLaborWarrantyExpDate_id").val();
									 
									 if(aa==""){
										 $("#err_msg_equp_modal").html("Manufacturer Labor Warranty  Date Required");
										 $("#mfgLaborWarrantyExpDate_id").addClass("input_error");
										 return false;
									 }else{
										 $("#mfgLaborWarrantyExpDate_id").removeClass("input_error");
									 }
								 }
								 if(c){
									 var aa=$("#companyMaterialWarrantyExpDate_id").val();
									 
									 if(aa==""){
										 $("#err_msg_equp_modal").html("Company Material Warranty  Date Required");
										 $("#companyMaterialWarrantyExpDate_id").addClass("input_error");
										 return false;
									 }else{
										 $("#companyMaterialWarrantyExpDate_id").removeClass("input_error");
									 }
								 }
								 if(d){
									 var aa=$("#companyLaborWarrantyExpDate_id").val();
									 
									 if(aa==""){
										 $("#err_msg_equp_modal").html("Company Labor Warranty  Date Required");
										 $("#companyLaborWarrantyExpDate_id").addClass("input_error");
										 return false;
									 }else{
										 $("#companyLaborWarrantyExpDate_id").removeClass("input_error");
									 }
								 }
								 
								 $("#err_msg_equp_modal").html("");
									
									 
									
									 var form = $('#saveEquipmentForm')[0];

										// Create an FormData object 
								        var fdata = new FormData(form);
									
									 
									 
									for(var i=0;i<equpmentfiledata.length;i++){
										  
										 
										 if(equpmentfiledataDelete.indexOf(i)==-1){
											 
										 
											fdata.append("equipmentfile", equpmentfiledata[i]);
											fdata.append("equipmentfileNames", equpmentfiledataNames[i]);
											fdata.append("equipmentfileTypes", equpmentfiledataTypes[i]);
											fdata.append("equpmentfiledataSize", equpmentfiledataSize[i]);
											
										 }
										}
										
										 
									 
									 
									  $.ajax({
										url : "/saveEquipment",
										 type: "POST",
										 enctype: 'multipart/form-data',
										  data: fdata,
										  processData: false,
										    contentType: false,
										success : function(data) {
											$('#myModal').modal('toggle');
											$("#submitso").click();
										},
										error : function(e) {
											alert(e);
										}
									});// ajax
 	 
								});// change function

						
						
						
						
						//$("#installationDate_id").val("");
						
						$('input[name=installedByUs]').click(function(){ 
							var checkstatus = $(this).prop('checked');
							if(checkstatus==true){
								$("#installed").show();
							}else{
								$("#installed").hide();
							}
							
						});
						
						$('input[name=mfrmetwarnt]').click(function(){ 
							var checkstatus = $(this).prop('checked');
							if(checkstatus==true){
								$("#metdate").show();
							}else{
								$("#metdate").hide();
							}
							
						});$('input[name=mfrlabwarnt]').click(function(){ 
							var checkstatus = $(this).prop('checked');
							if(checkstatus==true){
								$("#lbrdate").show();
							}else{
								$("#lbrdate").hide();
							}
							
						});$('input[name=cmpmetwarnt]').click(function(){ 
							var checkstatus = $(this).prop('checked');
							if(checkstatus==true){
								$("#cmpmetdate").show();
							}else{
								$("#cmpmetdate").hide();
							}
							
						});$('input[name=cmplabwarnt]').click(function(){ 
							var checkstatus = $(this).prop('checked');
							if(checkstatus==true){
								$("#cmplbrdate").show();
							}else{
								$("#cmplbrdate").hide();
							}
							
						});
						
						
						
						
						
						
						
						 $("#uploadimgs").click(function(){ 
							 $("#equipmentFile").click();
						 });
						 
						 $("#tax_File_uploadimgs").click(function(){ 
							 $("#tax_File").click();
						 });
						 $("#problem_File_uploadimgs").click(function(){ 
							 $("#problem_File").click();
						 });
						
						

						 $(".viewequ").click(function(){ 
								var id=$(this).attr("id");
							 
								 $(".lodar").show();
								 $(".eqDetails").hide();
								 $(".equipmentimgs").hide();
								 $("#zoomimg").hide();

								$.ajax({
									url : "/getEquipmentDeatils?equipmentId="+id,
									success : function(data) {
									  
									 
									 var msg=data.msg;
									 var equp=msg[0];
									 var mediList=msg[1];
									 var datesStrArray=msg[2];
									 
									 var da='<div class="row no-margin"><h4 class="no-margin"><strong>'+equp.name+'</strong></h4>'
										+'<dl class="col-md-6 padding-none-r-5"><dd>Equipment Type</dd><dt>'+equp.equipmentTypeID+'</dt>'
										+'<dd>Location</dd><dt>'+equp.location+'</dt>'
										+'<dd>Manufacturer</dd><dt>'+equp.manufacturer+'</dt>'
										+'<dd>Model</dd><dt>'+equp.model+'</dt></dl>'
										+'<dl class="col-md-6 padding-none-l-5">'
										+'<dd>Serial</dd><dt>'+equp.serialNumber+'</dt>'
										+'<dd>Installation Date </dd><dt>'+datesStrArray[0]+'</dt>'
										+'<dd>Manufacturer Warranty </dd><dt>'+datesStrArray[2]+'</dt>'
										+'<dd>Company Warranty </dd><dt>'+datesStrArray[4]+'</dt>'
										+'</dl><dl><dt>Description</dt><dd>'+equp.description+'</dd></dl></div>';
									 $(".eqDetails").html(da);
								 
										$(".equipmentimgs").html("");
										 if(mediList.length>0){
										 for(var i=0;i<mediList.length;i++){
											 var imsstr=mediList[i];
											 if(i==0){
												 $("#zoomimg").attr("src","data:image/jpeg;base64,"+imsstr);
											 }
											 $(".equipmentimgs").append('<img class="equimg" src="data:image/jpeg;base64,'+imsstr+'" alt="equipment">');
										 }
										 }
										 $(".lodar").hide();
										$(".eqDetails").show();
										 $(".equipmentimgs").show();
										  $("#zoomimg").show();
									
									 
									 
									},
									error : function(e) {
										alert(e);
									}
								});// ajax

								
								
								$('#viewModal').modal('toggle');
							});
							$("body").delegate(".equimg","click",function() {	
							 	var src=$(this).attr("src");
								 
								$("#zoomimg").attr("src",src);
									
									
								});
							
						
							
							
							
				/* files start */
							
							var equpmentfiledata = [];
							var equpmentfiledatatags=[];
							var equpmentfiledataDelete=[];
							var equpmentfiledataNames=[];
							var equpmentfiledataTypes=[];
							var equpmentfiledataSize=[];
							var len=0;
							$("#equipmentFile")
									.change(
											function(e) {

												var file = e.target.files[0];
												//var len = equpmentfiledata.length;
												var ss = len;
												 
												equpmentfiledata[ss] = file;
												var fileName = e.target.files[0].name;
												var typ=e.target.files[0].type;
												var ty=typ.split("/");
												var typp=ty[0];
												 
												var size=(e.target.files[0].size/1024).toFixed(2);
												
												 equpmentfiledataNames.push(fileName);
												 equpmentfiledataTypes.push(typp);
												 
												 equpmentfiledataSize.push(size);
												var reader = new FileReader();
												reader.onload = function(e) {
													 
													 
													$("#equipmentfiles")
													.append(
															'<li class="margin-b-10"><img width="50px" height="50px" src="'
															+ e.target.result + '"/>'
																	+ fileName
																	+ '<span class="pull-right text-danger"> <i class="fa fa-2x fa-times-circle delete_img_cls" id="'
																	+ ss
																	+ '"></i></span> </li>')
													.show();
													
													len++;
													
													
												}
												reader.readAsDataURL(file);
												
												
												
												
											});
							
							var tax_Filedata = [];
							var tax_Filedata_types = [];
							 var tax_FiledataDelete=[];
							 var taxFilenames=[];
							 var taxFileSize=[];
							 
							 var taxlen=0;
							$("#tax_File")
									.change(
											function(e) {

												var file = e.target.files[0];
												var len = tax_Filedata.length;
												var ss = taxlen;
												tax_Filedata[ss] = file;
												var fileName = e.target.files[0].name;
												var size=(e.target.files[0].size/1024).toFixed(2);
												
												taxFilenames.push(fileName);
												taxFileSize.push(size);
												
												var ftype=file.type;
												var sty=fileName.split(".");
												var ty=ftype.split("/");
												var typ=ty[0];
												var fyp=sty[1];
												 
												 
												 
												var reader = new FileReader();
												var ia;
												reader.onload = function(e) {
													 
													tax_Filedata_types[ss]=typ;
													 
													 
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
														
														
														$("#tax_Files").append('<li class="margin-b-10">'+ ia
																		+ file.name
																		+ '<span class="pull-right text-danger"> <i class="fa fa-2x fa-times-circle delete_img_cls_tax" id="'
																		+ ss
																		+ '"></i></span> </li>')
														.show();
												}
												
												taxlen++;
												reader.readAsDataURL(file);
											});
							
	
							
							
							
							var problem_Filedata = [];
							var problem_Filedata_types = [];
							var problem_FiledataDelete=[];
							var problemFilenames=[];
							var problemFileSize=[];
							var prblen=0;
							$("#problem_File")
									.change(
											function(e) {

												var file = e.target.files[0];
												var len = problem_Filedata.length;
												var ss = prblen;
												problem_Filedata[ss] = file;
												var fileName = e.target.files[0].name;
												problemFilenames.push(fileName);
												
												var size=(e.target.files[0].size/1024).toFixed(2);
												problemFileSize.push(size);
												
												var ftype=file.type;
												var sty=fileName.split(".");
												var ty=ftype.split("/");
												var typ=ty[0];
												var fyp=sty[1];
												 
												 
												 
												var reader = new FileReader();
												var ia;
												reader.onload = function(e) {
													 
													
													problem_Filedata_types[ss]=typ;
													 
													 
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
													
													 
													$("#problem_Files")
													.append('<li class="margin-b-10">'+ ia
															+ file.name
																	+ '<span class="pull-right text-danger"> <i class="fa fa-2x fa-times-circle delete_img_cls_prb" id="'
																	+ ss
																	+ '"></i></span> </li>')
													.show();
												}
												prblen++;
												reader.readAsDataURL(file);
											});
							
							
							
							
							$("body").delegate(".delete_img_cls","click",function(){ 
								
								var idd=$(this).attr("id");
								 	$(this).parent().parent().remove();
								//array.splice(i, 1);
								 
								 equpmentfiledataDelete.push(Number(idd));
								// indexOf
								 
								 
							});
							
								$("body").delegate(".delete_img_cls_prb","click",function(){ 
								
								var idd=$(this).attr("id");
								 	$(this).parent().parent().remove();
								//array.splice(i, 1);
								 	problem_FiledataDelete.push(Number(idd));
								// indexOf
								 
								 
							});
							
							$("body").delegate(".delete_img_cls_tax","click",function(){ 
								
								var idd=$(this).attr("id");
								 	$(this).parent().parent().remove();
								//array.splice(i, 1);
								 	tax_FiledataDelete.push(Number(idd));
								// indexOf
								 
								 
							});
							
							
							/* billing note start */	
							
							$("body").delegate("#add_billingNote_id","click",function(){
								
								var billingNote_id=$("#billingNote_id").val();
								if(billingNote_id==""){
									alert("Billing note can not empty");
									return false;
								}
								$("#billingNoteModal").modal('toggle');

							});
							/* billing note end */
							
				/* service note start */
							
							$("body").delegate("#add_serviceNote_id","click",function(){
								
								var serviceNote_id=$("#serviceNote_id").val();
								if(serviceNote_id==""){
									alert("Opening note can not empty");
									return false;
								}
								$("#serviceNoteModal").modal('toggle');

							});
							/* service note end */	
							
							
							
							/* audit start */
							 $(".audit").click(function(){ 
								 var idd=$(this).attr("id");
								 
								 
								  	$.ajax({
										url : "/getServiceOrderDetails?soId="+idd,
										success : function(data) {
											var obj=data.msg;
											$("#sono_audit").html(obj.serviceOrderNumber);
											$(".sobooked_audit").html(obj.approvedBy);
											$("#auditModal").modal('toggle');
										},
										error : function(e) {
											alert(e);
										}
									});// ajax
							 });
							 /* audit end */
							 
							 
							 
							 /* copy equipment start */
							 

								
								
								$(".copyEqup").click(function(){ 
									var idd=$(this).attr("id");
									 
									$.ajax({
										url : "/getEquipmentDeatils?equipmentId="+idd,
										success : function(data) {
										  
										 
										 var msg=data.msg;
										 var equp=msg[0];
										 var mediList=msg[1];
										 var datesStrArray=msg[2];
										 
										 
										    var eName=equp.name;
										    
							            	 var eManf= equp.manufacturer;
							            	 var loca=equp.location ;
											var model= equp.model ;
											var sNo= equp.serialNumber; 
											var des= equp.description ;
											  
												var age=equp.estimatedAgeInYears;
											 
										 
											 
											var instalDate=datesStrArray[0];
											 
											
												var mmwarenty=datesStrArray[2];
												var mlwarenty=datesStrArray[1];
												var cmwarenty=datesStrArray[4];
												var clwarenty=datesStrArray[3];							
											
											 
											 $("#eqName").attr("value",eName);
											 
											 $("#eqManf").attr("value",eManf);
											 
											 $("#eqLoc").attr("value",loca);
											 $("#eqModel").attr("value",model);
											 $("#eqSno").attr("value",sNo);
											  $("#eqDesc").val(des);
											 $("#eqAge").attr("value",age);
											 
											 if(instalDate!=""){
												 $('input[name=installedByUs]').prop('checked', true);
												 $("#installed").show();
											 }
											 $("#installationDate_id").attr("value",instalDate);
											 if(mmwarenty!=""){
												 $('input[name=mfrmetwarnt]').prop('checked', true);
												 $("#metdate").show();
											 }
											 
											 $("#mfgMaterialWarrantyExpDate_id").attr("value",mmwarenty);
											 if(mlwarenty!=""){
												 $('input[name=mfrlabwarnt]').prop('checked', true);
												 $("#lbrdate").show();
											 }
											 
											 $("#mfgLaborWarrantyExpDate_id").attr("value",mlwarenty);
											 if(cmwarenty!=""){
												 $('input[name=cmpmetwarnt]').prop('checked', true);
												 $("#cmpmetdate").show();
											 }
											 $("#companyMaterialWarrantyExpDate_id").attr("value",cmwarenty);
											 if(clwarenty!=""){
												 $('input[name=cmplabwarnt]').prop('checked', true);
												 $("#cmplbrdate").show();
												  
											 }
											 $("#companyLaborWarrantyExpDate_id").attr("value",clwarenty);
											 $("#myModal").modal('toggle');
										},
										error : function(e) {
											alert(e);
										}
									});// ajax

									
								});
								
								
								
								
							 
							 /* copy equipment end */
							 
							 
								/*problemimages start*/
								
								$("#viewProbAttchs").click(function(){
									$("#problemModal").modal('toggle');
									
								});
								/*problemimages end*/
							
				/* files end */
					 
					function readURL(input) {
						var reader = new FileReader();
						reader.onload = function(e) {
							$("#taxfiles").append(
									"<li><img width='50px' height='50px' src='"
											+ e.target.result + "'/><li>")
									.show();
						}
						reader.readAsDataURL(filedata[input]);
					}

					
					
					
					 
					 
					 function focusfunction(selected_area){
						 $([document.documentElement, document.body]).animate({
						        scrollTop: $("." + selected_area).offset().top
						    }, 10);	 
					 }
					 
					 
					 
					 
							$("#pac-input").blur(function(){
								searchSiteAddress();
							});
							$("#siteUnit_id").blur(function(){
								searchSiteAddress();
							});
					 
							
							$("body").delegate("#addressMsgModal_create","click",function(){
								//clean up the site address and unit
								$("#pac-input").val("");
								$("#siteUnit_id").val("");
								$("#addressMsgModal").modal('toggle');
							});
							$("body").delegate("#addressMsgModal_load","click",function(){
								
								//siteLatestSO  siteId
							});
							
							
							 var serviceOrderStatusIdval= $("#serviceOrderStatusId").val();
							 var serviceOrderConfirmedId=$("#serviceOrderConfirmedId").val();
							 if(serviceOrderConfirmedId=="true"){
								 
								 $(".sendConfirmMsg").addClass("hide");
							   	 $(".confirmOrder").addClass("hide");
								 $("#confirm-Msg_id").html("Order confirmed.<br/>Awaiting customer confirmation.");
									
							 }else{
								 
								 if(serviceOrderStatusIdval==2){
								   		$(".sendConfirmMsg").removeClass("hide");
								   		$(".confirmOrder").addClass("disabled");
									   	$(".confirmOrder").removeClass("confirmOrder");
								   }else{
								   		 
								   	 $(".confirmOrder").show();
								   }

							 }
							 
							  
							$(".confirmOrder").click(function(){
											 var soId=$("#soId").val();
											  
											 
											 
											 $(this).hide();
											
											 $.ajax({
													url : "/confirmSOOrder?soId="+soId,
													success : function(data) {
														  
														   
														   $(".sendConfirmMsg").removeClass("hide");
														   $(".confirmOrder").removeClass("hide");
														   $(".confirmOrder").addClass("disabled");
														   $(".confirmOrder").removeClass("confirmOrder");
													},
													error : function(e) {
														alert(e);
													}
												});// ajax
											  
											 
										});
										
										
										$("body").delegate(".sendConfirmMsg","click",function(){
											 var soId=$("#soId").val();
											  $.ajax({
													url : "/sendConfirmMsg?soId="+soId,
													success : function(data) {
														 
														var d=data.msg.confirmedDate;
														$(".sendConfirmMsg").addClass("hide");
												   		$("#confirmOrder").addClass("hide");
												   		
												   		//$("#confirm-Msg_id").html("Order confirmed on "+d+" and <br/>waiting confirmation from the customer");
												   		$("#confirm-Msg_id").html("Order confirmed.<br/>Awaiting customer confirmation.");
														
														
													},
													error : function(e) {
														alert(e);
													}
												});// ajax
											  
											 
										});
										
										
										$("body").delegate("#equpment_cancel_id","click",function(){
											$("#equpment_reset_id").click();
											$("#myModal").modal("toggle");
										});
										
										
										
										$("body").delegate(".expand","click",function(){
											
											 var idd=$(this).attr("id");
										});
										
				});


