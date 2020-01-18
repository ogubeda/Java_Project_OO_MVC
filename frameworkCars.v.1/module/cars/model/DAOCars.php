<?php
//////
include ("model/Connect.php");
class Querys {
    //////
    function select() {
        //////
        $connection = Connect::enable();
        $selectSQL = "SELECT * FROM allCars;";
        $res = mysqli_query($connection, $selectSQL);
        $arrCarPlates = array();
        //////

        if (mysqli_num_rows($res) > 0) {
            while ($row = mysqli_fetch_assoc($res)) {
                $arrCarPlates[] = $row;
            }// end_while
        }// end_if
        //////
        Connect::close($connection);
        return $arrCarPlates;
    }// end_select
    //////

    function selectOne($carPlate) {
        //////
        $connection = Connect::enable();
        $selectSQL = 'SELECT * FROM allCars WHERE carPlate ="' . $carPlate . '"';
        $res = mysqli_query($connection, $selectSQL);
        $car = array();
        //////

        if (mysqli_num_rows($res) > 0) {
            $car = mysqli_fetch_assoc($res);
        }// end_if
        Connect::close($connection);
        return $car;
    }

    function insert($car) {
        //////
        $roads = "";
        $done = false;
        $error = "";
        $connection = Connect::enable();
        foreach($car['exitRoads'] as $row){
            $roads = $roads  . "$row:";
        }

        $insertSQL = "INSERT INTO allCars (carPlate, brand, model, seats, doors, gearShift, typeEngine, cv, maxSpeed, roads, extras, startDate, endDate)
            VALUES ('$car[carPlate]', '$car[brand]', '$car[model]', '$car[seats]', '$car[doors]', '$car[gearShift]', 
            '$car[typeEngine]','$car[powerCV]', '$car[maxSpeed]', '$roads', '$car[extras]', '$car[startDate]', '$car[endDate]');";
        if (mysqli_query($connection, $insertSQL)) {
            $done = true;
        }else {
            $error = mysqli_error($connection);
        }// end_else
        Connect::close($connection);
        //////
        return array('done' => $done, 'error' => $error);
    }// end_insert
    //////
    /////

    function delete($carPlate) {
        $done = false;
        $error = "";
        $connection = Connect::enable();
        $deleteSQL = "DELETE FROM allCars WHERE carPlate = '$carPlate'";
        if (mysqli_query($connection, $deleteSQL)){
            $done = true;
        }else {
            $error = mysqli_error($connection);
        }
        Connect::close($connection);
        //////
        return array('done' => $done, 'error' => $error);
    }// end_delete
    //////

    function deleteAll() {
        //////
        $connection = Connect::enable();
        $deleteAll = "DELETE FROM allCars";
        $deleteAllSQL = mysqli_query($connection, $deleteAll);
        Connect::close($connection);
        //////
        return $deleteAllSQL;
    }// end_deleteAll

    function update($car, $plate) {
        //////
        $roads = "";
        $done = false;
        $error = "";
        $connection = Connect::enable();
        foreach($car['exitRoads'] as $row){
            $roads = $roads  . "$row:";
        }
        $updateSQL = "UPDATE allCars SET carPlate = '$car[carPlate]', brand = '$car[brand]', model = '$car[model]', seats = '$car[seats]', doors = '$car[doors]', 
                gearShift = '$car[gearShift]', typeEngine = '$car[typeEngine]', cv = '$car[powerCV]', maxSpeed = '$car[maxSpeed]', roads = '$roads',
                extras = '$car[extras]', startDate = '$car[startDate]', endDate = '$car[endDate]' WHERE carPlate = '$plate'";
        if (mysqli_query($connection, $updateSQL)) {
            $done = true;
        }else {
            $error = mysqli_error($connection);
        }
        Connect::close($connection);
        //////
        return array('done' => $done, 'error' => $error);
    }
}// end_Querys
