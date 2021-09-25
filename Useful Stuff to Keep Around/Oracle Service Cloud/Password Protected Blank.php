<?
if (isset($_POST['Submit']) && $_POST['password'] == 'hammers14')
{          

}
else
{
?>
<form action="" method="POST">
	<fieldset>
		<legend>Login</legend>
		<label for="password" >Password*:</label>
		<input type="password" name="password" id="password" maxlength="50" />
		<input type="submit" name="Submit" value="Log In" />
	</fieldset>
</form>
<?
}
?>