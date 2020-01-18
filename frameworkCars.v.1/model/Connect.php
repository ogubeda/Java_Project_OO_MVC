<?php
//////
class Connect {
    //////
    public static function enable() {
        //////
        $connection = mysqli_connect("localhost", "oscar", "147853xLash.", "Project_Cars");
        //////
        return $connection;
    }// end_enable
    //////
    /////

    public static function close($connection) {
        //////
        mysqli_close($connection);
    }// end_close
    //////
    /////

}// end_Connect
//////