
function checkForm(){
	if(regForm.makh.value=='') { alert('Nhập Mã Khách Hàng'); return false;}
	if(regForm.ho.value=='') { alert('Nhập họ'); return false;}
	if(regForm.ten.value=='') { alert('Nhập tên'); return false;}
	if(isNaN(regForm.cmnd.value) || regForm.cmnd.value=='') { alert('Enter 9 digits Identity No'); return false;}
	if(regForm.tel.value.indexOf('-')==-1){ alert('Enter home phone format xxx-yyyyyy'); return false;}
	m = regForm.email.value.indexOf('@');
	n = regForm.email.value.indexOf('.');
	if(m<=0 || n<m || n==m+1) { alert("Invalid Email format"); return false;}
	return true;
}

function checkNull(item){   
	if(item.value=="") {
		alert("Phải nhập "+item.name );
		item.focus();
		return false;
	}
	return true;
}

function checkIDNo(item) {
	if (isNaN(item.value) || item.value < 0 || item.value.length!=9){
		alert("You have entered an invalid Identity number!");
		item.focus();
		return false;
	}
	return true;
}
function checkTel(item){
	if(item.value.indexOf("-")==-1) {
		alert("Valid Phone No: xxx-yyyyyy");
		item.focus();
		return false;
	}
	return true;
}
function checkEmail(item){
	if((item.value.indexOf("@")==-1) || (item.value.indexOf(".")==-1)) {
		alert("Valid email address format: x@y.z");
		item.focus();
		return false;
	}
	return true;
}

function convertAllUnicode(form) {
	form.firstName.value=toUnicode(form.firstName.value);
	form.lastName.value=toUnicode(form.lastName.value);
	form.address.value=toUnicode(form.address.value);
}