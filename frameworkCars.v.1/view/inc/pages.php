<?php
//////
switch ($_GET['page']) {
	case "homepage";
		include ("module/home/homepage.php");
		break;
	case "controllerCars";
		include ("module/cars/controller/" . $_GET['page']. ".php");
		break;
	case "services";
		include ("module/services/" . $_GET['page'] . ".php");
		break;
	case "aboutus";
		include ("module/aboutus/" . $_GET['page'] . ".php");
		break;
	case "contactus";
		include ("module/contactus/" . $_GET['page'] . ".php");
		break;
	case "error404";
		include ("view/inc/" . $_GET['page'] . ".php");
		break;
	case "error503";
		include ("view/inc/" . $_GET['page'] . ".php");
		break;
	default;
		include ("module/home/homepage.php");
		break;
}
?>