<h1 data-tr = "Our Cars"></h1>
<div>
    <button class = "default-button" style = "float: left" name = "create" id = "create" type = "button" data-tr = "Create" onclick = "location.href = 'index.php?page=controllerCars&op=create'">
</div>
<div>
    <button class = "default-button" name = "deleteAll" id = "deleteAll" data-tr = "Delete All" onclick = "location.href = 'index.php?page=controllerCars&op=deleteAll'">
</div>
<br>
<div class = "list-cars">
<?php
//////
    if (empty($resSel)){
        echo '<p data-tr = "There is no available cars."></p>';
    }else {
        foreach ($resSel as $car) {
            echo '<div class = "car-img">
            <a href = "index.php?page=controllerCars&op=read&carPlate='. $car['carPlate'] . '">' . 
            '<img src="view/img/tesla_logo.png" width = "100" heigth = "100"><p>'
            . $car['brand'] . " " . $car['model'] . " " . $car['carPlate'] . '</p>
            </a>
            </div>&nbsp';
        }// end_foreach
    }// end_else 
?>
</div>