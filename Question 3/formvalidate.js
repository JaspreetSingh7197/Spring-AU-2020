function checkconstraint()
{
	var aa=document.getElementById('user').value;
	if(aa.length==0)
	{
		alert('username cant be empty');
		return;
	}
	var check=0;
	var pswd=document.getElementById('pass').value;
	var confp=document.getElementById('conf').value;
	var pat=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$*])[A-Za-z\d@$*]{8,}$/;
	var imp=/abc/;
    if(pat.test(pswd)==false)
    {
    	alert('password must contain 1 uppercase,1,lowercase,1 special and /abc/ pattern');
    	check=1;
    	return;
    }
    else
    {
    	if(!imp.test(pswd))
    	{
    		alert('must have abc pattern');
    		check=1;
    	}
    	if(pswd!=confp)
    	{
    		alert('passwords are not equal');
    		check=1;
    		return;
    	}
    }
    if(check==0)
    {
    	alert('username:'+ aa);
    	alert('password:'+ pswd );
    }
    
}