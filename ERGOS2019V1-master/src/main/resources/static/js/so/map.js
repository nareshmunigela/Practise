      // This example requires the Places library. Include the libraries=places
      // parameter when you first load the API. For example:
      // <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">
 
      function initMap() {
    	  var myLatlng = new google.maps.LatLng(36.778259,-119.417931);
        var map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: 36.778259, lng:-119.417931},
          zoom: 10
        });
        
        
        var map1 = new google.maps.Map(document.getElementById('map_new'), {
            center: {lat: 36.778259, lng:-119.417931},
            zoom: 10
          });
       
        var image = 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png';
        var marker=new google.maps.Marker({position:myLatlng, draggable:true,map:map,title:"click",label:"",icon:image});
        marker.addListener('dragend',function(event) {
            getPlaceDetailsByLatLang(event.latLng);


       });
        
        var marker1=new google.maps.Marker({position:myLatlng, draggable:true,map:map1,title:"click",label:"",icon:image});
        
        marker1.addListener('dragend',function(event) {
            getPlaceDetailsByLatLang1(event.latLng);


       });
        var input = /** @type {!HTMLInputElement} */(
            document.getElementById('pac-input'));

         
        var options = {
        		  types: ['(cities)'],
        		  componentRestrictions: {country: "us"}
        		 };
      var autocomplete = new google.maps.places.Autocomplete(input);
    


		autocomplete.addListener('place_changed', function() {
  var place = autocomplete.getPlace();
  if (!place.geometry) {
    window.alert("Autocomplete's returned place contains no geometry");
    return; 
  }

  // If the place has a geometry, then present it on a map.
 var  myLatlng =  place.geometry.location;
  if (place.geometry.viewport) {
    map.fitBounds(place.geometry.viewport);
     } else {  map.setCenter(place.geometry.location);
  }
  marker.setPosition(myLatlng);
  searchSiteAddress();
 // getPlaceDetailsByLatLang(myLatlng); 
  marker.addListener('dragend',function(event) {
       getPlaceDetailsByLatLang(event.latLng);

      
  });
  
});
		 var options1 = {
				  types: ['(cities)'],
				  componentRestrictions: {country: "us"}
				 };
		
		 var input1 = /** @type {!HTMLInputElement} */(
	                document.getElementById('pac-input_new'));
		 
		// $(".pac-container").css("z-index","1052px");
	        var autocomplete1 = new google.maps.places.Autocomplete(input1);
		
	       
		autocomplete1.addListener('place_changed', function() {
			  var place1 = autocomplete1.getPlace();
			  if (!place1.geometry) {
			    window.alert("Autocomplete's returned place contains no geometry");
			    return; 
			  }

			  // If the place has a geometry, then present it on a map.
			 var  myLatlng1 =  place1.geometry.location;
			  if (place1.geometry.viewport) {
			    map1.fitBounds(place1.geometry.viewport);
			     } else {  map1.setCenter(place1.geometry.location);
			  }
			  marker1.setPosition(myLatlng1);

			 // getPlaceDetailsByLatLang(myLatlng); 
			  marker1.addListener('dragend',function(event) {
				  
			       getPlaceDetailsByLatLang1(event.latLng);
			    

			  });
			  
			});
      
		function getPlaceDetailsByLatLang(myLatLang){

		    var geocoder;
			  geocoder = new google.maps.Geocoder();
			   

			  geocoder.geocode(
			      {'latLng': myLatLang}, 
			      function(results, status) {
			          if (status == google.maps.GeocoderStatus.OK) {
			                  if (results[0]) {
			                      var add= results[0].formatted_address ;
			                      var  value=add.split(",");

			                   var	   count=value.length;
			                  var    country=value[count-1];
			                    var  state=value[count-2];
			                    var  palcename=value[count-3];
							 
							 
							document.getElementById('pac-input').value = value;
							 
							 
			                      
			                  }
			                  else  {
			                      alert("address not found");
			                  }
			          }
			           else {
			              alert("Geocoder failed due to: " + status);
			          }
			      }
			  );

			
		}
		function getPlaceDetailsByLatLang1(myLatLang1){
			 
		    var geocoder;
			  geocoder = new google.maps.Geocoder();
			   

			  geocoder.geocode(
			      {'latLng': myLatLang1}, 
			      function(results, status) {
			          if (status == google.maps.GeocoderStatus.OK) {
			                  if (results[0]) {
			                      var add= results[0].formatted_address ;
			                      var  value=add.split(",");

			                   var	   count=value.length;
			                  var    country=value[count-1];
			                    var  state=value[count-2];
			                    var  palcename=value[count-3];
							 
							 
							document.getElementById('pac-input_new').value = value;
							 
							 
			                      
			                  }
			                  else  {
			                      alert("address not found");
			                  }
			          }
			           else {
			              alert("Geocoder failed due to: " + status);
			          }
			      }
			  );

			
		}
      }
      
      
      function searchSiteAddress(){
			 
		    var siteAddress=$("#pac-input").val();
			var siteUnit=$("#siteUnit_id").val();
			
			var siteId=0;
			$.ajax({
				url : "/searchSiteAddress?siteAddress="+siteAddress+"&siteUnit="+siteUnit,
				
				success : function(data) {
					
					//alert(JSON.stringify(data.msg));
					var siteNumber=data.msg[0].siteNumber;
					var siteAddress=data.msg[0].siteAddress;
					 siteId=data.msg[0].siteId;
					
					//alert("siteNumber..."+siteNumber+" "+siteAddress+"  siteId.."+siteId);
					//alert("site address already existed, do you want to continue with the site id :"+siteNumber);
					
					
					//modal-alert
					 var str='<span  data-toggle="tooltip"   data-original-title="'+siteAddress+'">'+siteNumber+'</span>';
					$('#addressModal_siteId').html(str);
					
					
					$("#addressMsgModal_load_href").attr("href","/siteLatestSO?siteId="+siteId);
					$('[data-toggle="tooltip"]').tooltip();
					 
					$("#addressMsgModal").modal('toggle');
					
				},error: function(e){
					
				}
			});
			
			 
			
			
			
	 }
    