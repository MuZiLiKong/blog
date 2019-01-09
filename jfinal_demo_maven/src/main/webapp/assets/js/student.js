function del(obj){
			$.ajax({
				url:'/student/delete',
				data://'userName='+un+'&userPass='+up+'&type='+obj+'&random='+Math.random(),
				{
					'id':obj,
					'random':Math.random()
		         },
				type:'POST',
				dataType:'JSON',
				success:function(data){
					if(data.success)
					{		
						 alert(data.message);
						location.href ='/student/getStuListAll?random='+Math.random();
					}else
					{
						alert(data.message);						
					}
				},
		         error:function(e){
						alert('请求失败。');					
				}
			});
}
		
		
		