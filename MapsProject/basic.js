//This is listener for window, to load the map
google.maps.event.addDomListener(window, 'load', initialize);

//Global vars here
var mapGlobal;

function initialize() {
	var mapOptions = {
		center: new google.maps.LatLng(-34.397, 150.644),
		zoom: 8,
		mapTypeId: google.maps.MapTypeId.ROADMAP
	};

	var map = new google.maps.Map(document.getElementById("map-canvas"), mapOptions);
	mapGlobal = map;

	//This is a listener for the map, to load JS
	google.maps.event.addListenerOnce(map, 'tilesloaded', placeMarker);
}

function placeMarker(){
	var map = mapGlobal;
	var latLng = new google.maps.LatLng(-34.397, 150.644);

	var image = {
		url: "image1.jpg",
		scaledSize: new google.maps.Size(50,50)
	};

	var marker = new google.maps.Marker({
		position: latLng,
		map: map,
		icon: image
	});

	console.log("placing marker");
}



