 $(function(){
        //html5表单验证
        //--------------------------------------------------------------------------------------
        //验证邮箱用户名
        function checkEmail(){
            var email = $('#inputText').val();
            if(email == ''){
                $('#email-rsg').html('邮箱不能为空！');
                return false;
            }
            if(email.indexOf('@') == -1){
                $('#email-rsg').html('邮箱必须包含@！');
                return false;
            }

            if(email.indexOf('.com') == -1){
                $('#email-rsg').html('邮箱必须包含.com！');
                return false;
            }
            if(email.indexOf('@') > email.indexOf('.')){
                $('#email-rsg').html('邮箱中@必须在.前面！');
                return false;
            }
            $('#email-rsg').html('');
            return true;
        }

        //验证密码
        function checkPwd(){
            pwd1 = $('#inputPwd').val();
            if(pwd1 == ''){
                $('#pwd1-rsg').html('密码不能为空!');
                return false;
            }
            if(pwd1.length < 6){
                $('#pwd1-rsg').html('密码至少为6位!');
                return false;
            }
            $('#pwd1-rsg').html('');
            return true;
        }
        $('#inputText').blur(checkEmail);
        $('#inputPwd').blur(checkPwd);
        $('#registerForm').submit(function(){
            var flag = false;
            if(checkEmail() & checkPwd() ){
                flag = true;
                alert('登录成功！');
            }
            return flag;
        })
    })
    //-------------------------------------------------------------------------------------------------
    //定义变量
    var lStorage = window.localStorage,     //获取localStorage对象
            info = document.getElementById('inputText'),
            info1 = document.getElementById('inputPwd');
    //存储数据
    function addInfo(){
        var date = new Date();
        //自定义key,名字myBoard
        if(lStorage.userName1){   //
            lStorage.userName1 += info.value+'\n'+'\n';//将时间转换成本地字符串正常显示
        }else { //第一次存储/localStorage为空时
            lStorage.userName1 = info.value+'\n'+'\n';
        }
        if(lStorage.passwd1){
            lStorage.passwd1 += info1.value+'\n'+'\n';//将时间转换成本地字符串正常显示
        }else { //第一次存储/localStorage为空时
            lStorage.passwd1 = info1.value+'\n'+'\n';
        }
        updateInfo();
}
    
function addInfo(personInfo){
	$.ajax({
		
		
	})
}