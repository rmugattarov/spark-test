$(function() {
window.setInterval(function() {$.get("hello", function(data, status) {$("#test").html(data)})}, 2000);
});