jQuery(document).ready(function () {

    $("#userBasicIc").click(
        function(){
            $.ajax({
                url: "/user/userInfo",
                success: function (result){
                    $("#div001").html(result);
                    $("#userEdit").click(
                        function () {userEdit();}
                    );
                }
            })
        }
    );

    $("#userEdit").click(
        function(){userEdit();}
    );


    function userEdit() {
        $.ajax({
            url: "/user/userEdit",
            success: function (result) {
                $("#div001").html(result);
                $("#editSubmit").click(
                    function(){
                        editSave();
                    }
                );
            }
        })
    };


    function editSave() {

        var nickname = $("#nickname").val();
        var age = $("#age").val();
        var userId = $("#userId").val();
        var gender = $("input:radio[name='gender']:checked").val();

        if(!nickname){
            alert('昵称不能为空');
            return false;
        }

        if(nickname.length < 2){
            alert('昵称不能小于2位');
            return false;
        }

        if(nickname.length > 20){
            alert('昵称不能大于20位');
            return false;
        }

        if(age.length > 3){
            alert('年龄不能大于3位');
            return false;
        }

        if( !age.match(/[1-9][0-9]*$/)){
            alert('非法数字');
            return false;
        }

        $.ajax({
            url: "/user/editSave",
            data:{"nickname":nickname,"age":age,"userId":userId,"gender":gender},
            success: function (result) {
                $("#div001").html(result);
                $("#userEdit").click(
                    function () {userEdit();}
                );
            }
        })
    }
});