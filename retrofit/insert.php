<?php
	$array=array();
	$conn=mysqli_connect("localhost","root","","test");
	if($conn){
		$array["con"]="Establishd";
		$array["Mysql"]="Its Mysql";
	}
	else{
		$array["con"]="Not Establishd";
		$array["Mysql"]="It's not Mysql";
	}
	$name=$_REQUEST['name'];
	$email=$_REQUEST['email'];
	$pass=$_REQUEST['pass'];
	$insert=mysqli_query($conn,"INSERT INTO record (name,email,password) VALUES ('$name','$email','$pass')");
	if($insert){
		$array["status"]="Inserted";
		$array["ahmad"]="Ahmad";
	}
	else{
		$array["status"]="Not Inserted";
		$array["ahmad"]="Ahmad";
	}
   echo	json_encode($array);
?>