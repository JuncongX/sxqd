function optionclick(){
    var info = new Object();
      var zhf= window.location.href.split('=');
      info.id = zhf[1];
    info.status = $('select#status').val();
    info.clss = $('select#class').val();
    info.major = $('select#major').val();
      $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudent',
       data: JSON.stringify(info),
       async: true,
       contentType: "application/json",
       dateType: "json",
       success: function(data){
     $('#students').dataTable().fnClearTable(); //清除表格内
     $('#students').dataTable().fnDestroy();
      writein(data);
            var docrTable = $('#students').dataTable({
                "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示   
                "bFilter" : true, //是否启动过滤、搜索功能
                "info": false,
                 "pageLength": 7,
                "lengthChange" : false,
                  "oLanguage": { //国际化配置
                    "sProcessing" : "正在获取数据，请稍后...",
                    "sLengthMenu" : "显示 _MENU_ 条",
                    "sZeroRecords" : "没有您要搜索的内容",
                    "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
                    "sInfoEmpty" : "记录数为0",
                    "sInfoFiltered" : "(全部记录数 _MAX_ 条)",
                    "sInfoPostFix" : "",
                    "sSearch" : "搜索",
                    "sUrl" : "",
                    "oPaginate": {
                        "sFirst" : "第一页",
                        "sPrevious" : "上一页",
                        "sNext" : "下一页",
                        "sLast" : "最后一页"
                    }
                },
              });
     },
       error: function(){
        alert('服务端异常');
        }
    });//ajax
     $('select#class').empty();
     $('select#major').empty();
  //重新获得筛选条件
    $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudentScreening',
       async: true,
       data: JSON.stringify(info),
       contentType: "application/json",
       dateType: "json",
       success: function(data){
       var namelength = data.major.length;
       $('select#major').append('<option>专业</option>');
       $('select#class').append('<option>班级</option>');
       for ( var i = 0; i < namelength; i++){
        $('select#major').append('<option>'+data.major[i]+'</option>');
       }
       var namelength = data.clss.length;
       for ( var i = 0; i < namelength; i++){
        $('select#class').append('<option>'+data.clss[i]+'</option>');
       }
       },
        error: function(){
        alert('服务端异常');
        }
        });//ajax  
    //$.getJSON("js/json/approval-2.json", function(data) {
         // });
}
function optionclick1(){
    var info = new Object();
      var zhf= window.location.href.split('=');
      info.id = zhf[1];
    info.status = $('select#status').val();
    info.clss = $('select#class').val();
    info.major = $('select#major').val();
      $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudent',
       data: JSON.stringify(info),
       async: true,
       contentType: "application/json",
       dateType: "json",
       success: function(data){
     $('#students').dataTable().fnClearTable(); //清除表格内
     $('#students').dataTable().fnDestroy();
      writein(data);
            var docrTable = $('#students').dataTable({
                "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示   
                "bFilter" : true, //是否启动过滤、搜索功能
                "info": false,
                 "pageLength": 7,
                "lengthChange" : false,
                  "oLanguage": { //国际化配置
                    "sProcessing" : "正在获取数据，请稍后...",
                    "sLengthMenu" : "显示 _MENU_ 条",
                    "sZeroRecords" : "没有您要搜索的内容",
                    "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
                    "sInfoEmpty" : "记录数为0",
                    "sInfoFiltered" : "(全部记录数 _MAX_ 条)",
                    "sInfoPostFix" : "",
                    "sSearch" : "搜索",
                    "sUrl" : "",
                    "oPaginate": {
                        "sFirst" : "第一页",
                        "sPrevious" : "上一页",
                        "sNext" : "下一页",
                        "sLast" : "最后一页"
                    }
                },
              });
     },
       error: function(){
        alert('服务端异常');
        }
    });//ajax
     $('select#class').empty();
  //重新获得筛选条件
    $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudentScreening',
       async: true,
       data: JSON.stringify(info),
       contentType: "application/json",
       dateType: "json",
       success: function(data){
       $('select#class').append('<option>班级</option>');
       var namelength = data.clss.length;
       for ( var i = 0; i < namelength; i++){
        $('select#class').append('<option>'+data.clss[i]+'</option>');
       }
       },
        error: function(){
        alert('服务端异常');
        }
        });//ajax  
    //$.getJSON("js/json/approval-2.json", function(data) {
         // });
}
function optionclick2(){
    var info = new Object();
      var zhf= window.location.href.split('=');
      info.id = zhf[1];
    info.status = $('select#status').val();
    info.clss = $('select#class').val();
    info.major = $('select#major').val();
      $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudent',
       data: JSON.stringify(info),
       async: true,
       contentType: "application/json",
       dateType: "json",
       success: function(data){
     $('#students').dataTable().fnClearTable(); //清除表格内
     $('#students').dataTable().fnDestroy();
      writein(data);
            var docrTable = $('#students').dataTable({
                "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示   
                "bFilter" : true, //是否启动过滤、搜索功能
                "info": false,
                 "pageLength": 7,
                "lengthChange" : false,
                  "oLanguage": { //国际化配置
                    "sProcessing" : "正在获取数据，请稍后...",
                    "sLengthMenu" : "显示 _MENU_ 条",
                    "sZeroRecords" : "没有您要搜索的内容",
                    "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
                    "sInfoEmpty" : "记录数为0",
                    "sInfoFiltered" : "(全部记录数 _MAX_ 条)",
                    "sInfoPostFix" : "",
                    "sSearch" : "搜索",
                    "sUrl" : "",
                    "oPaginate": {
                        "sFirst" : "第一页",
                        "sPrevious" : "上一页",
                        "sNext" : "下一页",
                        "sLast" : "最后一页"
                    }
                },
              });
     },
       error: function(){
        alert('服务端异常');
        }
    });//ajax
     $('select#major').empty();
  //重新获得筛选条件
    $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudentScreening',
       async: true,
       data: JSON.stringify(info),
       contentType: "application/json",
       dateType: "json",
       success: function(data){
       var namelength = data.major.length;
       $('select#major').append('<option>专业</option>');
       for ( var i = 0; i < namelength; i++){
        $('select#major').append('<option>'+data.major[i]+'</option>');
       }
       },
        error: function(){
        alert('服务端异常');
        }
        });//ajax  
    //$.getJSON("js/json/approval-2.json", function(data) {
         // });
}
function writein(data){
       var tbody = document.getElementsByTagName ('tbody')[0];
       var len = data.students.length;
       for ( var i = 0; i < len; i++)
      {
          var obj = data.students[i];
            var tr = tbody.insertRow(tbody.rows.length);
            var j=i+1;
            $("tr:eq("+j+")").val(obj.id);//对当前行赋值
            //$('tr').addClass('pointer');
            var td = tr.insertCell (tr.cells.length);
            td.innerHTML = '<a href="student_table_details.html?id="'+obj.id+'">'+obj.nickName+'</a>';
            var td = tr.insertCell (tr.cells.length);
            td.innerHTML = obj.userName;
            var td = tr.insertCell (tr.cells.length);
            td.innerHTML = obj.major;
            var td = tr.insertCell (tr.cells.length);
            td.innerHTML = obj.clss;
            var td = tr.insertCell (tr.cells.length);
            td.innerHTML = obj.status;
            var td = tr.insertCell (tr.cells.length);
            td.innerHTML = '<a href="teacher_table_details.html?id='+obj.teacherId+'">'+obj.teacherName+'</a>';
      } //for 
}
$(document).ready(function(){
  var info = new Object();
    var zhf= window.location.href.split('=');
    info.id = zhf[1];
  info.status ='实习状态';
  info.clss ='班级';
  info.major ='专业';
    $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudentScreening',
       async: true,
       data: JSON.stringify(info),
       contentType: "application/json",
       dateType: "json",
       success: function(data){
       var namelength = data.major.length;
       for ( var i = 0; i < namelength; i++){
        $('select#major').append('<option>'+data.major[i]+'</option>');
       }
       var namelength = data.clss.length;
       for ( var i = 0; i < namelength; i++){
        $('select#class').append('<option>'+data.clss[i]+'</option>');
       }
     },
       error: function(){
        alert('服务端异常');
        }
    });
  //点一次导入表格
  var info = new Object();
  info.status ='实习状态';
  info.clss ='班级';
  info.major ='专业';
    var zhf= window.location.href.split('=');
    info.id = zhf[1];
    $.ajax({
       type: 'post',
       url: '/fieldManagement/admin/showCompanyStudent',
       async: true,
       contentType: "application/json",
       data: JSON.stringify(info),
       dateType: "json",
       success: function(data){
      writein(data);
      var docrTable = $('#students').dataTable({
                "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示   
                "bFilter" : true, //是否启动过滤、搜索功能
                "info": false,
                 "pageLength": 8,
                "lengthChange" : false, 
                  "oLanguage": { //国际化配置
                    "sProcessing" : "正在获取数据，请稍后...",
                    "sLengthMenu" : "显示 _MENU_ 条",
                    "sZeroRecords" : "没有您要搜索的内容",
                    "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
                    "sInfoEmpty" : "记录数为0",
                    "sInfoFiltered" : "(全部记录数 _MAX_ 条)",
                    "sInfoPostFix" : "",
                    "sSearch" : "搜索",
                    "sUrl" : "",
                    "oPaginate": {
                        "sFirst" : "第一页",
                        "sPrevious" : "上一页",
                        "sNext" : "下一页",
                        "sLast" : "最后一页"
                    }
                },
              });
     },
       error: function(){
        alert('服务端异常');
        }
    });
//     $.getJSON("js/json/student_table.json", function(data) {
//       writein(data);
//       resetpsw();//-------------重置密码------
//       forbidden();// -------------禁用--------------
//   var docrTable = $('#students').dataTable({
//                 "bProcessing" : true, //DataTables载入数据时，是否显示‘进度’提示   
//                 "bFilter" : true, //是否启动过滤、搜索功能
//                 "info": false,
//                  "pageLength": 8,
//                 "lengthChange" : false, 
//                   "oLanguage": { //国际化配置
//                     "sProcessing" : "正在获取数据，请稍后...",
//                     "sLengthMenu" : "显示 _MENU_ 条",
//                     "sZeroRecords" : "没有您要搜索的内容",
//                     "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
//                     "sInfoEmpty" : "记录数为0",
//                     "sInfoFiltered" : "(全部记录数 _MAX_ 条)",
//                     "sInfoPostFix" : "",
//                     "sSearch" : "搜索",
//                     "sUrl" : "",
//                     "oPaginate": {
//                         "sFirst" : "第一页",
//                         "sPrevious" : "上一页",
//                         "sNext" : "下一页",
//                         "sLast" : "最后一页"
//                     }
//                 },
//               });
// });//getjson
//------------------->
});//document