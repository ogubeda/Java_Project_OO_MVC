$(document).ready(function() {
    $("#btn-slide").on("click", function() {
        $("#slide-lang").slideToggle();
    })
    $(".lang-btn").on("click", function() {
        $("#slide-lang").slideUp("fast");
    })
    $("#conf-btn").on("click", function() {
        $("#confMenu").slideToggle();
    })
    //////
    $(window).scroll(function() {
        if ($(this).scrollTop() > 102) {
            $("#contenido").addClass("content-mar");
            $("#menu").addClass("fixed-menu");
        }else {
            $("#contenido").removeClass("content-mar");
            $("#menu").removeClass("fixed-menu");
        }
    });
});