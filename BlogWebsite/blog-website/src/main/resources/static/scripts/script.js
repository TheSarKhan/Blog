 
  function myFunction() { 
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
      x.className += " responsive";
    } else {
      x.className = "topnav";
    }
  }

     
  $.getJSON("https://api.ipify.org?format=json", function(data) {
    $("#ip-address").html(data.ip);
})