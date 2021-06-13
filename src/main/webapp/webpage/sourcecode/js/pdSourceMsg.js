$(function(){
    $("#one").hide();
    $("#two").hide();
    $("#three").hide();
    var checkIndex=$("#packagingLevel ").get(0).selectedIndex;
    checkLevel(checkIndex);

    createTable();
});

function createTable(){
    $("#tableMsg").remove();
    var checkIndex=$("#packagingLevel ").get(0).selectedIndex;

    var table = document.createElement("table");
    table.border = "1";
    table.width = "100%";
    table.height = "100px";
    table.id = "tableMsg";

    //根据选择的层级显示比例框
    checkLevel(checkIndex);
    var tr,td;
    for(var i=0;i<checkIndex+2;i++){
        //循环插入元素
        tr = table.insertRow(table.rows.length);
        for(var j=0;j<3;j++){
            if(i == 0){
                td = tr.insertCell(tr.cells.length);
                switch (j){
                    case 0:
                        td.innerHTML = "包装级别"
                        break;
                    case 1:
                        td.innerHTML = "包装数量"
                        break;
                    case 2:
                        td.innerHTML =  "包装类型"
                        break;
                }
                td.align = "center";
            }else if(i == checkIndex + 1){
                if(j == 0){
                    td = tr.insertCell(tr.cells.length);
                    td.innerHTML =  "所追溯源码总数"
                    td.align = "left";
                }
            }else{
                td = tr.insertCell(tr.cells.length);
                if(j == 0){
                    td.innerHTML = checkIndex + 1 - i;
                }else if(j == 1){
                    if(i == 1){
                        td.innerHTML = "<input type='text' placeholder='输入包装数量' name='packagingQuantity' id='packagingQuantity' style='text-align:center; width: 100%; border:0'>";
                    }else{
                        td.innerHTML = td.innerHTML = "<input type='text' id='goodsCount"+ (checkIndex + 1 - i) + "' style='text-align:center; width: 100%; border:0'>";;
                    }
                }else if(j == 2){
                    td.innerHTML = "<select style='border:0'><option value='volvo'>箱</option><option value='volvo'>盒</option></select>";
                }
//                    td.innerHTML = "第"+i+"行，第"+j+"列";
                td.align = "center";
            }
        }
    }

    //td.innerHTML = "测试";

    document.querySelector("#tb").appendChild(table);

    var x=document.getElementById('tableMsg').rows[checkIndex+1].cells;
    x[0].colSpan="3";
}

function checkLevel(checkIndex){
    //根据选择的层级显示比例框
//        var els =document.getElementsByName("packagingProportion");
//        for (var i = 0, j = els.length; i < j; i++){
//            alert(els[i].value);
//        }
//        alert(document.getElementsByName("packagingProportion"));
    $("input[name='packagingProportion']").val("");
    if(checkIndex == 1) {
        $("#one").show();
        $("#two").hide();
        $("#three").hide();
    }else if(checkIndex == 2) {
        $("#one").hide();
        $("#two").show();
        $("#three").hide();
    }else if(checkIndex == 3){
        $("#one").hide();
        $("#two").hide();
        $("#three").show();
    }else{
        $("#one").hide();
        $("#two").hide();
        $("#three").hide();
    }
}

/**
 * 保存
 * @param obj 保存按钮（按钮需要在form表单中）
 */
function saveSourceMsg(obj){
    var checkIndex=$("#packagingLevel ").get(0).selectedIndex;
    var one, two, three;
    var reg = new RegExp("^[0-9]*$");
    if(checkIndex == 1) {
        one = $("input[name='packagingProportion_one_one']").val();
        if(!reg.test(one)){
            alert("包装比例请输入正整数");
            return false;
        }
        $("#packagingProportion").val(one);
    }else if(checkIndex == 2) {
        two = $("input[name='packagingProportion_two_two']").val();
        one = $("input[name='packagingProportion_two_one']").val();
        if(!reg.test(one) || !reg.test(two)){
            alert("包装比例请输入正整数");
            return false;
        }
        $("#packagingProportion").val(two + ":" + one);
    }else if(checkIndex == 3){
        three = $("input[name='packagingProportion_three_three']").val();
        two = $("input[name='packagingProportion_three_two']").val();
        one = $("input[name='packagingProportion_three_one']").val();
        if(!reg.test(one) || !reg.test(two) || !reg.test(three)){
            alert("包装比例请输入正整数");
            return false;
        }
        $("#packagingProportion").val(three + ":" + two + ":" + one);
    }

    if($(obj).closest('form').valid()){
        $.ajax({
            type: 'post',
            url: webRoot+$(obj).closest('form').attr('action'),
            data: $(obj).closest('form').serialize(),
            dataType: 'json',
            success: function(data){
                alert(messages[data.result]);
                search();
                $(".panel-search").show();
            }
        });
    }
}