<?php
include("module/cars/model/DAOCars.php");
class Utils {
    //////
    public static function check($plate) {
        //////
        $value = false;
        $query = new Querys();
        $check = $query -> select();
        foreach ($check as $row) {
            if ($row['carPlate'] == $plate) {
                $value = true;
            }// end_if
        }// end_foreach
        //////
        return $value;
    }// end_check
    //////

    public static function consoleLog($data) {
        //////
        echo "<script>console.log('PHP: " . $data . "');</script>";
    }// end_consoleLog
    //////

    public static function redirect($url){
        //////
        die('<script>window.location.href="' . $url . '";</script>');
    }// end_redirect
    //////

    public static function formComplete($formData) {
        //////
        $carplate = $formData['carPlate'];
        $brand = $formData['brand'];
        $model = $formData['model'];
        $seats = $formData['seats'];
        $doors = $formData['doors'];
        $powerCV = "";
        $maxSpeed = $formData['maxSpeed'];
        $startDate = $formData['startDate'];
		$endDate = $formData['endDate'];
		$roadsArray = "";
        if (($_GET['op'] == "update") && ($_GET['carPlate'])) {
			$mode = 1;
			$redirect = "index.php?page=controllerCars&op=read&carPlate=$_GET[carPlate]";
			$powerCV = $formData['cv'];
			$roadsArray = explode(":", $formData['roads']);
			/////
		}else {
			$mode = 0;
			$redirect = "index.php?page=controllerCars&op=list";
			$powerCV = $formData['powerCV'];
			$roadsArray = $_POST?$_POST['exitRoads']:"";
			//////
        }// end_else
		//////
		if ($formData['gearShift'] == "Manual") {
			$checkMan = "checked";
		}else if ($formData['gearShift'] == "Auto") {
			$checkAuto = "checked";
		}// end_else
		//////
		if ($formData['typeEngine'] == "Electric") {
			$checkElec = "selected";
		}else if ($formData['typeEngine'] == "Hybrid") {
			$checkHyb = "seleted";
		}else if ($formData['typeEngine'] == "Combustion") {
			$checkComb = "selected";
		}// end_else
		//////
		
		if (in_array("City", $roadsArray)) {
			$checkCity = "selected";
		}// end_if
		if (in_array("Roadway", $roadsArray)) {
			$checkRWay = "selected";
		}// end_if
		if (in_array("Road", $roadsArray)) {
			$checkRoad = "selected";
		}// end_if
		if (in_array("Rural", $roadsArray)) {
			$checkRural = "selected";
		}// end_if
		if (in_array("Mountain", $roadsArray)) {
			$checkMnt = "selected";
		}// end_if
		//////
		if ($formData['extras'] == "yes") {
			$checkExt = "checked";
		}// end_if
		//////
		return array('carPlate' => $carplate, 'brand' => $brand, 'model' => $model, 'seats' => $seats, 
		'doors' => $doors, 'checkMan' => $checkMan, 'checkAuto' => $checkAuto,'powerCV' => $powerCV, 
		'maxSpeed' => $maxSpeed, 'checkElec' => $checkElec, 'checkHyb' => $checkHyb, 'checkComb' => $checkComb,
		'checkCity' => $checkCity, 'checkRWay' => $checkRWay, 'checkRoad' => $checkRoad, 'checkRural' => $checkRural,
		'checkMnt' => $checkMnt, 'checkExt' => $checkExt, 'startDate' => $startDate, 'endDate' => $endDate,'redirect' => $redirect, 'mode' => $mode);
    }// end_formComplete
}